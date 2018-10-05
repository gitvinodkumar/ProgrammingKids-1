package com.nt.technical;

import java.util.Scanner;

public class PerfectNumberORNot {
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int result=0;
		for(int i=1;i<num;i++){
			
			if(num%i==0){
				result+=i;
			}
		}
		if(result==num)
			System.out.println("this is perfect numer="+result);
		
		//assert (result==num):"this is prime numer";
		//System.out.println(1010/10);
	}

}
