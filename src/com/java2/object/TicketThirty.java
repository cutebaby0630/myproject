package com.java2.object;


public class TicketThirty extends Ticket {
	private float discount=0.5f;
	String rt;
	private int rm = (int)((amount*30)*(1-discount));
	int s1;
	int s2;
	String dt;
	public TicketThirty(String date,String time,String start,String finish,String rt,int rm){
		super(date,time,start,finish,rm);
		this.rt=rt;
				
	}
	@Override
	public void print(){
		System.out.println(date+"\t"+time+"\t"+start+"\t"+finish+"\t"+rt+"\t"+rm);
		System.out.print(dt);
	
		
	} 
	
		
	}


