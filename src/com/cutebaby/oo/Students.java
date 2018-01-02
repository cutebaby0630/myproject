package com.cutebaby.oo;

public class Students {
	int chinese;
	int english;
	int math;
	String name;
	// 區域變數 ：chinese; english; math;
	static int pass = 60;
	// 屬性前的沒加，別的package找不到
	// 屬性前加private，只有當下的class看得到
	// 屬性前加public，每一個都存取的到
	// 父類別屬性前加protected，只能給子類別用&同package用

	// 加了static就是class變數
	public Students(String name, int english, int chinese, int math) {
		this.name = name;
		this.english = english;
		this.chinese = chinese;
		this.math = math;
	}

	public Students() {

	}

	public Students(String name) {
		this.name = name;
		// this強調name為屬性變數，並不是區域變數
	}

	 public void print() {
		// void 代表執行後不回傳
		System.out.println(pass);
		System.out.println(english + "\t" + chinese + "\t" + math + "\t");

	}

	public static void method() {
		System.out.println("hello");
		// static只能抓到static上的東西
		// EX.後面可以放pass不能放name
	}

	public int getAverage() {
		// 執行後回傳int
		return (english + math + chinese) / 3;
	}
}
