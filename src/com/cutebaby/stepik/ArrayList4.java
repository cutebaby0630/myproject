package com.cutebaby.stepik;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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

	}

}
