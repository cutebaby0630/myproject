package com.cutebaby;

import java.util.Scanner;

public class GameTester {

	public static void main(String[] args) {

		int a = -1;
		int hp = 100;
		int row = 3;
		int col = 5;
		int pos = 0;

		while (hp > 0) {

			System.out.print("請輸入方向:");
			Scanner scanner = new Scanner(System.in);
			String line = scanner.nextLine();
			a = Integer.parseInt(line);

			switch (a) {
			case 2:
				if (pos / col < row - 1) {
					pos = pos + col;
					hp = hp - 5;
					System.out.println(hp);
				} else {
					hp = hp - 30;
					System.out.println(hp);
				}
				break;
			case 4:
				if (pos % col != 0) {
					pos = pos - 1;
					hp = hp - 5;
					System.out.println(hp);
				} else {
					hp = hp - 30;
					System.out.println(hp);
				}
				break;
			case 6:
				if (pos % col != col - 1) {
					pos = pos + 1;
					hp = hp - 5;
					System.out.println(hp);
				} else {
					hp = hp - 30;
					System.out.println(hp);
				}
				break;
			case 8:
				if (pos / col > row - 1) {
					pos = pos - col;
					hp = hp - 5;
					System.out.println(hp);
				} else {
					hp = hp - 30;
					System.out.println(hp);
				}
				break;

			}

		}

	}

}
