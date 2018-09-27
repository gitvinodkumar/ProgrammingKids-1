package com.nt.Difficult;

import java.util.Arrays;

public class ReverseArrayys {
	
	public static void main(String[] args) {
		
		int i[]={2,3,4,5};
		int k[]=new int[4];
		int count=0;
		for(int j=i.length-1;j>=0;j--){
			k[count]=i[j];
			count++;
		}
		
		
		System.out.println("reverser of Array="+Arrays.toString(k));
		//other process
		
	}

}
