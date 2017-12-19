package com.kao;

public class NumberTester {

	public static void main(String[] args) {
		for (int n = 3; n < 100; n++) {
			if (n % 3 == 0) {
				System.out.print(n + "\t");
			}
			if (n % 15 == 0) {
				System.out.println(" ");
			}
		}

	}

}