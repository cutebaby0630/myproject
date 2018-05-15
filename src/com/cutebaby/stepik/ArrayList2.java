package com.cutebaby.stepik;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArrayList2 {

	public static void main(String[] args) {

	    List<String> nameList = new ArrayList<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));
	    
	    
	    String[] strArray = nameList.toArray(new String[0]);



	    for (int i = 0; i <= strArray.length; i++) {
	      System.out.println(strArray[i]);
	    }

	    
	    
	  }
}
