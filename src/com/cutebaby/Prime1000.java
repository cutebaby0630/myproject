package com.cutebaby;

public class Prime1000 {

	public static void main(String[] args) {
		boolean prime = true;
		for (int n = 3; n <= 1000; n++) {
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					prime = false;
					break;
				} else {
					prime = true;
				}
				if (prime) {
					System.out.print(n+"\t");
					break;
				}

			}
		}
	}
}
