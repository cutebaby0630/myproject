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

		int total = 0;
		while (z != 0) {
			System.out.println("餘額:" + total + "元");
			System.out.println("請投幣或選擇飲料(1或2或3)，或輸入0結束:");
			String line = scanner.nextLine();
			switch (line) {
			case "1":
				if (total >= 25) {
					Drink drink = drinks.get(0);
					System.out.println("獲得：" + drink.getName());
					total-=drink.getPrice();
				} else {
					System.out.println("餘額不足!");
				}
				break;
			case "2":
				if (total >= 30) {
					Drink drink = drinks.get(1);
					System.out.println("獲得：" + drink.getName());
					total -=drink.getPrice();
				} else {
					System.out.println("餘額不足!");
				}
				break;
			case "3":
				if (total >= 20) {
					Drink drink = drinks.get(2);
					System.out.println("獲得：" + drink.getName());
					total -=drink.getPrice();
				} else {
					System.out.println("餘額不足!");
				}
				break;
			case "5":
				total = total + 5;
				break;
			case "10":
				total = total + 10;
				break;
			case "50":
				total = total + 50;
				break;
			case "0":
				System.out.println("End!");
				z = 0;
				break;
			default:
				System.out.println("Error!");
				break;
			}

		}

		
	}
	
}
