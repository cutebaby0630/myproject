package com.cutebaby.stepik;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//mongodb
//mssql
//oracle
//postgres
//sqlite
public class Set3 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		List<String> list = new ArrayList<String>(new HashSet());
		list.add("6");
		list.add("postgres");
		list.add("sqlite");
		list.add("oracle");
		list.add("mongodb");
		list.add("postgres");
		list.add("mssql");
		
		list.remove("6");
		
		System.out.print(list);
		
		
		for(int i=0 ;i<=list.size();i++){
			System.out.println (list.get(i));
		}
	}

}
