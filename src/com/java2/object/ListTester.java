package com.java2.object;

import java.util.ArrayList;
import java.util.List;

public class ListTester {

	public static void main(String[] args) {
		List<Integer> cards = new ArrayList<>();
		cards.add(6);
		cards.add(3);
		cards.add(12);
		cards.add(30);
		
		System.out.println("removing number :"+cards.remove(3));
		System.out.println(cards.size());
		System.out.println(cards.get(2));
	}

}
