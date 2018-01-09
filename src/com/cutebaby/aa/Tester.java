package com.cutebaby.aa;

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		// Arraylist為集合，可放異質資料
		// 如要標誌特定種類 → Arraylist<種類名稱>
		list.add(100);
		list.add(99);
		list.add(98);
		list.add("a");

		int n = (int) list.get(1);
		String b = (String) list.get(3);
		// 因為Arraylist沒有特定種類 → 另外設變數必須轉型
		// 如果剛開始 Arraylist<種類名稱>有特定種類，就不須轉型
		
		System.out.println(list.get(1));
		// list.get(1)代表拿list中的1號
		System.out.println(list.size());
		// list.size()代表印中list有幾項
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println(" ");
		Customer c1 = new Customer(1000);
		c1.print();
		AgCustomer c2 = new AgCustomer(1000);
		c2.print();
		AuCustomer c3 = new AuCustomer(1000);
		c3.print();
	}

}
