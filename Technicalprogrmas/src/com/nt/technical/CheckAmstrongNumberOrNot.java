package com.nt.technical;

import java.util.Scanner;

public class CheckAmstrongNumberOrNot {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		//int num=sc.nextInt();
		//int num1=num;
		int result=0;
		for(int i=1;i<1000;i++){
			int num=i;
		while(num!=0){
			System.out.println("lll");
			result+=Math.pow(num%10,3);
			num=num/10;
			
		}
		
      
	}
		result=0;
	}

}
