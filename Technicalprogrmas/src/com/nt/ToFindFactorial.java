package com.nt;

import java.util.Scanner;

public class ToFindFactorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int Factorial=1;
		for(int i=1;i<=num;i++){
			Factorial*=i;
		}
		
		System.out.println(Factorial);
		System.out.printf("%d*%d= %d",2,3,2*3);

	}

}
