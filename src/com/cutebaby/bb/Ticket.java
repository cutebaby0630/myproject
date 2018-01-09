package com.cutebaby.bb;

public class Ticket {
	String date;
	String time;
	String start;
	String finish;
	int amount;

	public Ticket (String date,String time,String start,String finish,int amount){
		this.date=date;
		this.time=time;
		this.start=start;
		this.finish=finish;
		this.amount=amount;
				
		}
	public void print(){
		System.out.println(date+"\t"+time+"\t"+start+"\t"+finish+"\t"+amount);
	}
}


