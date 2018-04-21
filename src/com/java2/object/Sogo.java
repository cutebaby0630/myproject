package com.java2.object;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.nio.channels.ShutdownChannelGroupException;
import java.util.ArrayList;
import java.util.Scanner;

import com.cutebaby.aa.AgCustomer;
import com.cutebaby.aa.AuCustomer;
import com.cutebaby.aa.Customer;
import com.java2.io.Sales;

public class Sogo {
	Scanner a = new Scanner(System.in);
	public Sogo () {
		
	}

	public void start(){
		int function=0;
			while(function!=3){
			showFunctions();
			function =a.nextInt();
			switch(function){
			case 1:
				intputSales();
				break;
			case 2:
				ArrayList<Sales>list= new ArrayList<>();
				try {
					FileInputStream fie = new FileInputStream("sales.txt");
					InputStreamReader isr = new InputStreamReader(fie);
					BufferedReader in = new BufferedReader(isr);
					String line = in.readLine();
					while(line!=null) {
						String[] token = line.split("\t");
						try {
							int type = Integer.parseInt(token[0]);
							int amount = Integer.parseInt(token[1]);
							Sales sales = new Sales(type,amount);
							list.add(sales);
						}catch(NumberFormatException e) {
							System.out.println("資料格式錯誤");
							return;
						}
						line = in.readLine();
					}
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
//				印出報表
				for(Sales sales:list) {
					Customer customer = null;
					switch(sales.type) {
					case 1 :
						customer = new Customer(sales.getAmount());
						break;
					case 2:
						customer = new AgCustomer(sales.getAmount());
						break;
					case 3 :
						customer = new AuCustomer(sales.getAmount());
						break;
					}
					customer.print();
				}
				break;
				
			case 3:
				return;
			}
		}
	}
	
	public void intputSales(){
		try {
			FileOutputStream fio = new FileOutputStream("sales", true);
			PrintStream out =new PrintStream(fio);
			System.out.println("請輸入會員等級:");
			int type = a.nextInt();
			System.out.println("請輸入銷售金額:");
			int amount = a.nextInt();
			out.println(type +"\t"+amount);
			out.flush();
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
				
	}
	
	public void showFunctions(){
		System.out.println("請輸入功能(1~3):");
		System.out.println("1) 輸入銷售紀錄");
		System.out.println("2) 印出銷售報表");
		System.out.println("3) 結束程式");
	}
	public static void main(String[] args) {
			Sogo sogo = new Sogo();
			sogo.start();
		
	}
}
