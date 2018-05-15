 package com.cutebaby.stepik;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Spliterator;



public class ArrayList4 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		List<Integer> nameList = new ArrayList  (scanner.nextInt());
		
		Object[] objArray = nameList.toArray();
		Spliterator<Integer> token = nameList.spliterator();
		for (int i=0 ;i<objArray.length;i++){
			if(i%2!=0){
				break;
			}else{
				System.out.println(objArray[i]);
			}
		}
	  }
}
