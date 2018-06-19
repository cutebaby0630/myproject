package com.cutebaby.schedule;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//有一文字檔儲存了課表資料(schedule.txt)
//請讀取資料後，設計程式可檢查是否有空檔?
//		如:
//			請輸入星(1-7):2
//			請輸入時(0-24):11
//			[有空檔]
//			請輸入星期(1-7):4
//			請輸入時(0-24):14
//			[有課:C004 English 到16時]
public class Main {
	String name;
	String id;
	int weekDay;
	String hour;
	int time;
	public static void main(String[] args) {
		readCourse();
	}
	public void Course(int id,String name,int weekDay,String hour ,int time){
		
		
	}
	public void readCourse(){
		FileReader fr;
		try {
			fr = new FileReader("schedule.txt");
			BufferedReader bf = new BufferedReader(fr);
			String line = bf.readLine();
			String token[] = line.split(",");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
