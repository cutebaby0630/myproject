package com.cutebaby;

import java.util.Scanner;

public class GameTester {

	public static void main(String[] args) {

		int a = -1;
		while (a != 0) {

			System.out.print("請輸入方向:");
			Scanner scanner = new Scanner(System.in);
			String line = scanner.nextLine();
			a = Integer.parseInt(line);

			switch (a) {
			case 2:
				System.out.println("向下");
				break;
			case 4:
				System.out.println("向左");
				break;
			case 6:
				System.out.println("向右");
				break;
			case 8:
				System.out.println("向上");
				break;
			case 0:
				System.out.println("Bye");
				break;

			}

		}

	}

}
