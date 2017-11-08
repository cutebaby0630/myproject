package com.cutebaby;

import java.util.Scanner;

public class Star1 {

	public static void main(String[] args) {
		System.out.println("請輸入星星數");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int n = Integer.parseInt(line);
		int i, j;

		for (i = n; i > 0; i--) {
			for (j = 0; j < i; j++)		
				System.out.print("*");
			System.out.println();
		}
		
		}
	}
