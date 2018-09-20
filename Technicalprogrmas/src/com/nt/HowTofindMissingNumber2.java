package com.nt;

import java.util.Arrays;

public class HowTofindMissingNumber2 {
	
	public static void MissingNumber(int[]num,int length){
	int []num1=new int[length];
		for(int i=0;i<length-1;i++){
			
			//copy num to num1
			num1[i]=num[i];
			
		}
		
		for(int i=0;i<length;i++){
			for(int j=1;j<i;j++)
			if(num1[i]!=j){
				System.out.println("missing number is="+i);
			}
		}
		
		System.out.println(Arrays.toString(num1));
		System.out.println(Arrays.toString(num));
		
	}
	

	
	public static void main(String[] args) {
		MissingNumber((new int[]{1,2,3,5,6}),6);
	}
}