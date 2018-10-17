package com.nt.patterns;

public class Pattern2 {

	public static void main(String[] args) {
		int count=1;
		for (int i = 1; i <= 5; i++) {

			
			for (int j = 1; j <=count; j++) {
				System.out.print("*  ");
				
			}
			for (int j = 1; j <= 5- i; j++) {
				System.out.print("  ");
			}
			System.out.println();
			
			count++;
		}
		

	}
}
