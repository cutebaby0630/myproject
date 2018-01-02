package com.cutebaby.aa;

public class AuCustomer extends Customer {
	public AuCustomer(int amount) {
		super(amount);
		super.discount = 0.1f;
	}

	public int returnMoney() {
		return (int) (amount * 0.1);
	}

	@Override
	public void print() {
		int returnMoney = (int) (amount * 0.1);
		int total = (int) (amount * (1 - discount));
		System.out.println(amount + "\t" + total );
		System.out.println("Customer feedback :"+returnMoney);
	}

}
