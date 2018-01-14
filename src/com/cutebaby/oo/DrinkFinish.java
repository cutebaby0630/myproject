package com.cutebaby.oo;

import java.util.Scanner;

public class DrinkFinish {

	public static void main(String[] args) {
		int m = 0;
		int z = -1;
		while (z != 0) {
			System.out.println("販賣機餘額:" + " " + m + "元");
			System.out.println("請投幣或選擇飲料(a或b或c)，或輸入0結束:");
			Scanner scanner = new Scanner(System.in);
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
			case "a":
				System.out.println("DON!");
				m = m - 15;
				break;
			case "b":
				System.out.println("DON!");
				m = m - 20;
				break;
			case "c":
				System.out.println("DON!");
				m = m - 30;
				break;
			case "0":
				System.out.println("結束!");
				z = 0;
				break;
			}

		}
	}
}
