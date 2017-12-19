package com.cutebaby;

import java.util.Scanner;

public class Drink {

	public static void main(String[] args) {
		int z = -1;
		
		int m = 0;
		
		while (m >= 0) {
			System.out.println("販賣機餘額:" + " " + m + "元" );
			System.out.println("請投幣或選擇飲料(a或b或c)，或輸入0結束:");
			Scanner scanner = new Scanner(System.in);
			String line = scanner.nextLine();
			
			char a=(int)'a';
			char b=(int)'b';
			char c=(int)'c';
			z = Integer.parseInt(line);
			
			
			switch (z) {
			case 1:
				m=m+1;
				break;
			case 5:
				m=m+5;
				break;
			case 97 :
				m=m+15;
				break;
			case 98 :
				System.out.println("DON!" );
				m=m-20;
				break;
			case 99 :
				System.out.println("DON!" );
				m=m-30;
				break;
				
				
			

			}

		}

	}

}
