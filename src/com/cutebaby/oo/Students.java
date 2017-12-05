package com.cutebaby.oo;

public class Students {
	int chinese;
	int english;
	int math;
	String name;
//區域變數 ：chinese; english; math;
	
	public Students(String n, int c,int e ,int m){
		name=n;
		english=e;
		chinese=c;
		math=m;
	}
	public void print(){
//		void 代表執行後不回傳
		System.out.println(english + "\t"+chinese +"\t"+math+"\t");
	
	}
	public int getAverage(){
		return (english+math+chinese)/3;
	}
}

