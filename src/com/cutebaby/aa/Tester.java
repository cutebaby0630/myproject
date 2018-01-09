package com.cutebaby.aa;

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		ArrayList<Customer> customers = new ArrayList<>();

		customers.add(new Customer(10000));
		customers.add(new AgCustomer(10000));
		customers.add(new AuCustomer(10000));
		customers.add(new AuCustomer(15000));
		customers.add(new AgCustomer(20000));
		for (int i = 0; i < customers.size(); i++) {
			Customer c = customers.get(i);
			c.print();
		}
	}

}
