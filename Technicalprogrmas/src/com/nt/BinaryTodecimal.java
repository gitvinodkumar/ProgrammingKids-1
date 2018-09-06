package com.nt;

import java.util.Scanner;

public class BinaryTodecimal {
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int b=0;
		int count=0;int decimal=0;
		
		while(n!=0){
			b=(int)Math.pow(2, count++);
			System.out.println("b"+b);
			decimal+=b*(n%10);
			
			 n=n/10;
			 System.out.println(decimal);
			 
			 
			
		}
		System.out.println("decimal form:"+decimal);
		
		
	}

}
