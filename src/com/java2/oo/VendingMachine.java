package com.java2.oo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachine {
	int total = 0;
	List<Drink> drinks = new ArrayList<>();

	public void start(){
		System.out.println("please insert coins.");
		for(int i=0; i<drinks.size();i++){
			Drink drink =drinks.get(i);
			System.out.println(drink.getId() +"\t"+drink.getName()+"\t"+drink.getPrice());
		}
		Scanner scanner = new Scanner(System.in);
		int z = -1;

		int m = 0;

		while (z != 0) {
			System.out.println("販賣機餘額:" + " " + m + "元");
			System.out.println("請投幣或選擇飲料(a或b或c)，或輸入0結束:");
//			Scanner scanner = new Scanner(System.in);
			String line = scanner.nextLine();

			switch (line) {
			case "1":
				m = m + 1;
				break;
			case "5":
				m = m + 5;
				break;
			case "10":
				m = m + 10;
				break;
//			case "a":
//				if (m < 15) {
//					System.out.println("BEEP!");
//					break;
//				} else {
//					System.out.println("DON!");
//					m = m - 15;
//					break;
//				}
//			case "b":
//				if (m < 20) {
//					System.out.println("BEEP!");
//					break;
//				} else {
//					System.out.println("DON!");
//					m = m - 20;
//					break;
//				}
//			case "c":
//				if (m < 30) {
//					System.out.println("BEEP!");
//					break;
//				} else {
//					System.out.println("DON!");
//					m = m - 30;
//					break;
//				}
			case "0":
				System.out.println("結束!");
				z = 0;
				break;
			}

		}
		
	}
	
}
