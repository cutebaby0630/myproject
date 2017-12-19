package com.ibm;

public class NineLazy {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int n = 2; n <= 9; n++) {
				if(i>3&&i<9){
					System.out.print(" " + "..." + "\t");
					}else{
						if((i * n)<10){
							System.out.print(n + "x" + i + "=" + " "+(i * n) + "\t");
						}else{
							System.out.print(n + "x" + i + "=" + (i * n) + "\t");
						}
						
						
					}
					
				}
			
			
			System.out.println();
	}

}
}