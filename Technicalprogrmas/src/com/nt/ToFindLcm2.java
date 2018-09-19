package com.nt;

import java.util.Scanner;

public class ToFindLcm2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("name");
		String no=sc.nextLine();
		//convert into char
		int n1=no.charAt(0);
		System.out.println("second name");
		String n=sc.nextLine();
		int n2=n.charAt(0);
		
		System.out.println("thirde name");
		String nam=sc.nextLine();
		int n3=nam.charAt(0);
		
		char ch='a';
		char ch1='b';
		System.out.println(ch);
		int lcm=n1>n2?n1:n3;
		
		System.out.println(lcm);
		
		while(true){
				if((lcm%n2==0)&&(lcm%n3==0)&&(lcm%n1==0)){
			
			System.out.println("lcm "+n1+" "+n2+" "+n3+" ="+lcm);
			
			break;
			
		}
				++lcm;
		}
System.out.println(ch<ch1);
	}

}
