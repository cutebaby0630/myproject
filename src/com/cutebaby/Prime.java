package com.cutebaby;

public class Prime {

	public static void main(String[] args) {
		int n = 6;
		boolean prime = true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				prime = false;
				break;
//				System.out.println("not prime");
			}
		}
		if(prime){
			System.out.println(n + " is prime number");
		}else{
			System.out.println(n + " not prime number");
		}
	}

}
