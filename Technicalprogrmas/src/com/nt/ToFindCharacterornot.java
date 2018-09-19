package com.nt;

import java.util.Scanner;

public class ToFindCharacterornot {
	
	public static void main(String[] args) {
		
		System.out.println("please enter charcater");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char ch=s.charAt(0);
		
		if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
			System.out.println("this is albet="+ch);
		}
		else{
			System.out.println("that is not albet="+ch);
		}
		
	}

}
