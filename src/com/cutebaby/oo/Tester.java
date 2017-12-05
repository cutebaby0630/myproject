package com.cutebaby.oo;

public class Tester {

	public static void main(String[] args) {
		Students stu = new Students("王小明:",55,66,77);
//		stu.chinese = 55;
//		stu.english = 66;
//		stu.math = 77;
		stu.print();
		int avg = stu.getAverage();
		System.out.println(stu.name + avg);
	}

}
