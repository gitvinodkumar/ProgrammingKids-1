package com.nt.benas;

import java.util.Arrays;

public class CheckingOnArrays {

	
	public static void main(String[] args) {
		
		int i[][]=new int[4][];
		
		i[0]=new int [3];
		i[1]=new int[2];
		i[2]=new int[4];
		i[3]=new int[5];
		System.out.println(Arrays.toString(i));
		System.out.println(i[0][0]);
	}
}
