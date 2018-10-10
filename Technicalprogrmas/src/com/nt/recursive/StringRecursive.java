package com.nt.recursive;

import java.util.Scanner;

public class StringRecursive {
	
	
	public static String Recursive(String name,int length){
		
		
		String ch=String.valueOf(name.charAt(length));
		
		if(length==0)
			return String.valueOf(name.charAt(0));
		
		return ch+Recursive(name, length-1);
		
	}
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String name=sc.nextLine();
		
		System.out.println(Recursive(name,name.length()-1));
		
	}

}
