package com.cutebaby.stepik;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Spliterator;

public class ArrayList4 {
	public static void main(String[] args) {
		// List<Integer> a = new ArrayList<>();
		// Scanner scanner = new Scanner(System.in);
		String line = "1 2 3 4 5 6 7";
		
		String[] token = line.split(" ");
		for (int i =token.length;i >0;i--) {
			if(i%2==0) {
			System.out.print(i+" ");
			}
			
		}
		// System.out.println(line);

		
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);

		List<Integer> list2 = new LinkedList<>();
		list2.add(1);
		list2.add(2);
		list2.add(3);

		List<Integer> list3 = new ArrayList<>();
		list3.add(3);
		list3.add(1);
		list3.add(2);
		
		System.out.println(list3.equals(list2));
		System.out.println(list1.equals(list1));
		System.out.println (list1.equals(list2));
		System.out.println(list1.equals(list3));
		 
		
		 
		 
	}

}
