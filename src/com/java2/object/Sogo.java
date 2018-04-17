package com.java2.object;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Sogo {
	Scanner a = new Scanner(System.in);

	public void start(){
		int funtion=0;
			while(funtion!=3){
			showFunctions();
			funtion =a.nextInt();
			switch(funtion){
			case 1:
				intputSales();
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
			int level = a.nextInt();
			System.out.println("請輸入銷售金額:");
			int price = a.nextInt();
			out.println(level +"\t"+price);
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
