package com.cutebaby;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
		// 階層 Arraylist → List → Collection → Interable(子 → 父)
		// 父類別的參照可以放子類別的物件
		
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
	}

}
