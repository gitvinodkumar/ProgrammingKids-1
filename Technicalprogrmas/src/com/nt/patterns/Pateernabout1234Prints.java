package com.nt.patterns;

public class Pateernabout1234Prints {

	public static void main(String[] args) {
		
		
		for(int i=1;i<=7;i++){
			
			
			
			//first inner loop
			for(int j=1;j<=i;j++){
				System.out.print(j+" ");
			}
			
			for(int k=i-1;k>=1;k--){
				System.out.print(k+" ");
			}
			
			
			System.out.println();
			
			
		}

	}

}
