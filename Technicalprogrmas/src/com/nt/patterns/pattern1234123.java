package com.nt.patterns;

public class pattern1234123 {

	public static void main(String[] args) {
		
		int count=4;
		//first for llop
		
		for(int i=1;i<=5;i++){
			
			//for space
			for(int j=1;j<5-i;j++){
				System.out.print(" ");
			}
			
			//innser for loop-1 for 1234
			for(int j=1;j<=count;j++){
				System.out.print(j);
			}
			
			//innser for loop-1 for 1234
			for(int j=1;j<count;j++){
				System.out.print(j);
			}
			System.out.println();
			count++;
			
		}
		

	}

}
