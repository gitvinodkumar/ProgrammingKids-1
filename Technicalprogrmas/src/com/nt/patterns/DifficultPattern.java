package com.nt.patterns;

public class DifficultPattern {

	public static void main(String[] args) {
		
		//main loop
		
		for(int i=1;i<=4;i++){
			
			//inner loop-1
			for(int j=1;j<=4-i;j++){
				if(i==1&&j==1){
					System.out.print("*");
				}
				System.out.print(" ");
				System.out.print(" ");
			}
			//second innerloop
			for(int j=1;j<=i;j++){
				if(i==1)
					System.out.print(" ");
				else
				System.out.print(" *");
			}
			System.out.println();
			System.out.println();
			
		}
		
	}

}
