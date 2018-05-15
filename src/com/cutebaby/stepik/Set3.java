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
		Set<String> set = new TreeSet<>();
		List<String> list = new ArrayList<String>(set);
		set.add("6");
		set.add("postgres");
		set.add("sqlite");
		set.add("oracle");
		set.add("mongodb");
		set.add("postgres");
		set.add("mssql");
		
		set.remove("6");
		
//		System.out.print(set);
		
		
		for(String  name : set){
			System.out.println(name);
		}
	}

}
