package com.cutebaby.oo;

public class Tester {

	public static void main(String[] args) {
//		Students stu = new Students("王小明:",55,66,77);
		Students stu1 = new Students("王小明",55,66,77);
		Students stu2 = new Students("王小明",58,59,60);
//		stu.chinese = 55;
//		stu.english = 66;
//		stu.math = 77;
		stu1.print();
		stu2.print();
		int avg = stu1.getAverage();
		System.out.println(stu1.name + avg);
		Students.method();
		
	}

}
