package com.cutebaby.schedule;

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
	public boolean isAvailable(int weekDay,int hour) {
		boolean avail = true;
		if(weekDay == this.weekDay) {
			if(hour>=this.time&&hour<=this.time+hour) {
				return false;
				
			}
		}
		return avail;
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
