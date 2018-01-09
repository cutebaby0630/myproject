package com.cutebaby.bb;

public class ReturnTicket extends Ticket {
	float discount=0.15f;
	String rt;
	int rm = (int)((amount*2)*(1-discount));
	public ReturnTicket(String date,String time,String start,String finish,String rt,int rm){
		super(date,time,start,finish,rm);
		this.rt=rt;
				
	}
	@Override
	public void print(){
		System.out.println(date+"\t"+time+"\t"+start+"\t"+finish+"\t"+rt+"\t"+rm);
	
		
	}

}
