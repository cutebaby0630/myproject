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
