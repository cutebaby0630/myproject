package com.java2.threading;

public class Horse extends Thread{
//	因為無法重複繼承，所以繼承另外一個介面(多執行緒)
	
//	@Override
	public void run(){
//		for(int i=0 ; i<=50000;i++){
//			System.out.println(getName() + ":"+i);
//		}
//}
	for(int i=0;i<=100;i++){
		System.out.println(getName() + ":"+i);
		try {
			sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
