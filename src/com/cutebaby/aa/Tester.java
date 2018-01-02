package com.cutebaby.aa;

public class Tester {

	public static void main(String[] args) {
		Customer c1 = new Customer(1000);
		c1.print();
		AgCustomer c2 = new AgCustomer(1000);
		c2.print();
		AuCustomer c3 =new AuCustomer(1000);
		c3.print();
	}

}
