package com.java2.object;

import java.util.Scanner;

public class ABGame {

	public static void main(String[] args) {
		String secert = "9873";
		Scanner scanner = new Scanner(System.in);
		int length = secert.length();
		int A = 0;
		int B = 0;
		while (A != 4) {
			A = 0;
			B = 0;
			System.out.println("Please enter your guess :");
			String nums = scanner.nextLine();
			int x = nums.length();
			for (int j = 0; j < x; j++) {
				char a = nums.charAt(j);
				for (int i = 0; i < length; i++) {
					if (a == secert.charAt(i)) {
						if (i == j) {
							A++;
						} else {
							B++;
							break;
						}

					}

				}
			}
			System.out.println(A + "A" + B + "B");
		}

	}

}
