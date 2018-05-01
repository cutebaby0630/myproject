package com.cutebaby.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class Tester {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(6);
		list.add(3);
		list.add(0);
		list.add(0);
		list.add(4);
		list.add(2);
		list.add(0);
		System.out.println(list);
		
		Set<Integer> set = new HashSet<>();
		set.add(6);
		set.add(3);
		set.add(0);
		set.add(0);
		set.add(4);
		set.add(2);
		set.add(0);
		System.out.println(set);
		//set 資料不會重覆 
		//抽牌，點名，可以用set
		
		Set<String> set2 = new HashSet<>();
		set2.add("baby");
		set2.add("Doris");
		set2.add("cuteababy");
		set2.add("baby");
		System.out.println(set2);
		
		Map<String, String> stu = new TreeMap<>();
				stu.put("01","baby");
				stu.put("02", "Doris");
				stu.put("03", "cutebaby");
				System.out.println(stu);
				
		Map<String, String> stu2 = new HashMap<>();
		
				stu2.put("01","baby");
				stu2.put("02", "Doris");
				stu2.put("03", "cutebaby");
				System.out.println(stu);
		System.out.println(stu2);
	}

}
