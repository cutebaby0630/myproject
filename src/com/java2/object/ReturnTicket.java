package com.java2.object;

public class ReturnTicket extends Ticket {
	private float discount=0.15f;
	String rt;
	private int rm = (int)((amount*2)*(1-discount));
	int s1;
	int s2;
	public ReturnTicket(String date,String time,String start,String finish,String rt,int rm){
		super(date,time,start,finish,rm);
		this.rt=rt;
				
	}
	@Override
	public void print(){
		System.out.println(date+"\t"+time+"\t"+start+"\t"+finish+"\t"+rt+"\t"+rm);
	
		
	} 
	
}
