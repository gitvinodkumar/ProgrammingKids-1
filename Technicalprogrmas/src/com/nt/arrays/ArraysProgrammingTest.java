package com.nt.arrays;

import java.util.Arrays;

public class ArraysProgrammingTest {
	
	
	static void m1(int i[]){
		
		System.out.println(Arrays.toString(i));
		String[]s=new String[2];
	
		Arrays.sort(i);
	}
	
	
	public static void main(String[] args) {
		
//		m1(new int[]{1,2,3});
//		m1(new int[]{});
	//System.out.println(new int[]{}.getClass());
	//Integer
	Integer i[]=new Integer[2];
	System.out.println(i[0]);
	String s[]=new String[2];
    System.out.println(s[0]);
    
    //inject tha values
    Integer i1[]=new Integer[]{1,2,3};
    //two dimenson s arrays
    String[]s1[]=new String[2][2];
    System.out.println(s1[1][0]);
    System.out.println(s1[1][1]);
	
		
	}

}
