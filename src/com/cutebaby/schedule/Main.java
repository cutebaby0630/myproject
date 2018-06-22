package com.cutebaby.schedule;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
	int hour;
	int time;
	List<Course> course = new ArrayList<>();
	public Main() {
		
		readCourse();
	}
	public class Course{
		String name;
		String id;
		int weekDay;
		int hour;
		int time;
		
		public Course(String name, String id, int weekDay, int hour, int time) {
			super();
			this.name = name;
			this.id = id;
			this.weekDay = weekDay;
			this.hour = hour;
			this.time = time;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public int getWeekDay() {
			return weekDay;
		}
		public void setWeekDay(int weekDay) {
			this.weekDay = weekDay;
		}
		public int getHour() {
			return hour;
		}
		public void setHour(int hour) {
			this.hour = hour;
		}
		public int getTime() {
			return time;
		}
		public void setTime(int time) {
			this.time = time;
		}
		
	}
	public void readCourse(){
		FileReader fr;
		try {
			fr = new FileReader("schedule.txt");
			BufferedReader bf = new BufferedReader(fr);
			String line = bf.readLine();
			while (line!=null) {
				String token[] = line.split(",");
				String id = token[0];
				String name = token[1];
				int weekend =Integer.parseInt(token[2]) ;
				int time = Integer.parseInt(token[3]);
				int hour = Integer.parseInt(token[4]);
				Course c = new Course(name, id, weekend, hour, time);
				course.add(c);
				

				
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	public static void main(String[] args) {
		new Main();
	}
}
