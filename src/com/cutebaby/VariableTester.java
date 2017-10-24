package com.cutebaby;

import java.util.Random;

public class VariableTester {

	public static void main(String[] args) {
			int age = 0;

			float weight = 69.5f;
			char c = 65;
			char c2 = 'Z'; 
//			
			int i = c2;
			System.out.println(i);
//			System.out.println((int)c2;
			boolean pass = true;
			System.out.println(pass);
			System.out.println(!pass);
			
			String s = new String ("Hello");
			Random r = new Random();
			System.out.println(r.nextInt(6)+1);
			int n1 = r.nextInt(6)+1;
			System.out.println(3 > 2);
// 			變數 age weight c c2 i pass s r n1
//			參照變數 s r 
//			
			String w = new String("Hello");
			String w1 = ("hahahahahh");
//			String為字串形態，特例 =右邊可以不加new
			int len = w.length();
			System.out.println("len:" + len);
//			寫出W中有幾個字母
			System.out.println(w.charAt(0));
//			寫出W中的第一個字是什麼
			
	}

}
