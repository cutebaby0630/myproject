package com.java2.io;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class WriteTest {

	public static void main(String[] args) throws FileNotFoundException {
		PrintStream out = new PrintStream("data1.txt");
		out.println("Baby\t1\t1500");
//		print()中要寫tab鍵直接打\t
		out.print("回饋50");
		out.flush();
		out.close();
	}
}
// 可以在建構子中放入try catch ，再用main方法呼叫
//如果是小錯誤，可以在建構子中寫入try catch 來解決，main方法就不用解決exception
//如果是大錯誤可以用throw，這樣main方法也需要throw→錯誤較大必須呼叫作業系統來解決
	