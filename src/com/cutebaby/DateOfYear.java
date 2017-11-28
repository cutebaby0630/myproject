package com.cutebaby;

import java.util.Random;
import java.util.Scanner;

public class DateOfYear {

	public static void main(String[] args) {
		System.out.println("請輸入天數:");
		Scanner scanner =new Scanner(System.in);
		String line =scanner.nextLine();
		int n = Integer.parseInt(line);
		
		int m[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		for (int i = 0; i <= m.length; i++) {
			if (n <= m[i]) {
				System.out.println((i + 1) + "/" + n);
				break;
			} else {
				n = n - m[i];
			}
		}

	}

}
