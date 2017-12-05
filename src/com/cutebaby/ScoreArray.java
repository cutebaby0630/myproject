package com.cutebaby;

public class ScoreArray {

	public static void main(String[] args) {
		int m[][] =new int[5][3];
		m[0][0]=11;
		m[0][1]=22;
		m[0][2]=33;
		m[1][0]=44;
		m[1][1]=55;
		m[1][2]=66;
		m[2][0]=77;
		m[2][1]=88;
		m[2][2]=99;
		m[3][0]=11;
		m[3][1]=22;
		m[3][2]=33;
		m[4][0]=11;
		m[4][1]=22;
		m[4][2]=33;
		
		for(int i=0; i<5; i++){
			System.out.print(m[i][0] + "\t"+m[i][1]+"\t"+m[i][2]+"\t");
			int average = (m[i][0] +m[i][1]+m[i][2])/3;
			if(average<60){
				System.out.println(average+ "*");
			}else{
				System.out.println(average);
			}
		}
		
	}

}
