package com.nt.arrays;

import java.util.Arrays;

public class SortofArrays {

	public static void main(String[] args) {
		
		int i[]={10,2,5,7,8};
		
		Arrays.sort(i);
		System.out.println(Arrays.toString(i));
		int a=0;
		int b=i.length-1;
		
		while(a<b){
			System.out.print(i[b--]);
			System.out.print(" ");
			System.out.print(i[a++]);
			System.out.print(" ");
		}
		
		//if (i.length % 2 != 0) 
			System.out.print(i[a]); 

	}

}
