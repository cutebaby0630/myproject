package com.cutebaby;

public class DateOfYear {

	public static void main(String[] args) {
		int n = 100;
		int b[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		for (int i = 0; i <= b.length; i++) {
			if (n <= b[i]) {
				System.out.println((i + 1) + "/" + n);
				break;
			} else {
				n = n - b[i];
			}
		}

	}

}
