package com.nt;

import java.util.Scanner;

public class ToFindLcm {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("first Albet");
		String no=sc.nextLine();
		//convert into char
		int n1=no.charAt(0);
		System.out.println("secnod");
		String n=sc.nextLine();
		int n2=n.charAt(0);
		
		System.out.println("third Alphet");
		String nam=sc.nextLine();
		int n3=nam.charAt(0);
		
		
		int lcm=n1>n2?n1:n3;
		
		System.out.println(lcm);
		
		while(true){
				if((lcm%n2==0)&&(lcm%n3==0)&&(lcm%n1==0)){
			
			System.out.println("lcm "+n1+" "+n2+" "+n3+" ="+lcm);
			
			break;
			
		}
				++lcm;
		}

	}

}
