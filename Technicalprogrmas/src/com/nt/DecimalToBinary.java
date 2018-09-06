package com.nt;

import java.util.Scanner;

public class DecimalToBinary {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		StringBuilder sb=new StringBuilder();
		int b=0;
		while(n!=0){
			
			b=n%2;
			sb.append(b);
			n=n/2;
		}
		sb.reverse();
		System.out.println(sb.toString());
		
	}

}
