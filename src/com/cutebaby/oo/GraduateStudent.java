package com.cutebaby.oo;

public class GraduateStudent extends Students {
	// 如果沒有extends，都會繼承 java.lang.Object
	// extends 代表繼承 ，只能繼承一個→GraduateStudent 繼承 Students
	// 剛開始裡面會有空的建構子，但繼承物裡面沒有空的建構子，所以會出錯
	// →Students裡面要加一個空的建構子

	int thiese;

	public GraduateStudent() {
//		super();
//		super()是建構子
		System.out.print("HI");
	}

	@Override
	// @Override→檢查複寫的東西，父列別有無
	public void print() {
		super.print();
		System.out.println(pass);
		System.out.println(english + "\t" + chinese + "\t" + math + "\t"  + thiese+ "\t");
	}

	@Override
	public int getAverage() {
		// 執行後回傳int
		return (english + math + chinese) / 3;
	}

}
