package com.java2.threading;

public class HorseRunable implements Runnable{
//	因為無法重複繼承，所以繼承另外一個介面(多執行緒)
	@Override
	public void run(){
		for (int i=0;i<=100;i++){
			System.out.print("R:"+i);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
//  怎麼執行Runable→new  HorseRunable →new thread
//	區域變數只有在括號中有

}
