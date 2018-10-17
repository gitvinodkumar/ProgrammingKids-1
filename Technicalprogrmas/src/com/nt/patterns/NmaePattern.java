package com.nt.patterns;

public class NmaePattern {

	public static void main(String[] args) {
		String name="javaprogramming";
		
		//first for loop
		for(int i=0;i<=name.length()-1;i++){
			 //inner loop-1 for spaces
			for(int j=0;j<=name.length()-i;j++){
				System.out.print(" ");
			}
			
			//inner loop-2 for printing chars
			for(int j=0;j<=i;j++){
				System.out.print(name.charAt(j)+" ");
			}
			
			System.out.println();
			
		}// end of first loop
		
		//for second condition
		
		/*for(int i=name.length()-2;i>=0;i--){
			
			 //inner loop-1 for spaces
			for(int j=0;j<=name.length()-i;j++){
				System.out.print(" ");
			}
			
			//inner loop-2 for printing chars
			for(int j=0;j<=i;j++){
				System.out.print(name.charAt(j)+" ");
			}
			*/
		//	System.out.println();
			
			
		
		

	}


}
 