package com.cutebaby.oo;

public class Students {
	int chinese;
	int english;
	int math;
	String name;
//區域變數 ：chinese; english; math;
	
	public Students(String name, int english,int chinese ,int math){
		this.name=name;
		this.english=english;
		this.chinese=chinese;
		this.math=math;
	}
	public Students(String name) {
		this.name =name;
//		this強調name為屬性變數，並不是區域變數
	}
	
	public void print(){
//		void 代表執行後不回傳
		System.out.println(english + "\t"+chinese +"\t"+math+"\t");
	
	}
	public int getAverage(){
//		執行後回傳int
		return (english+math+chinese)/3;
	}
}

