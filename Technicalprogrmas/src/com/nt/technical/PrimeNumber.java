package com.nt.technical;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("PrimeNumbers"+2+" "+3+" "+5+" "+7+" ");
		//int a=sc.nextInt();
		String name="";
		for(int a=2;a<200;a++){
		if(a%2!=0&&a%3!=0&a%5!=0&&a%7!=0){
			name+=a+" ";		}else{
			//System.out.println("that is not a prime number"+a);
		}
		}
System.out.println(name);
	}

}
