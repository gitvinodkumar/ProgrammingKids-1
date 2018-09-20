package com.nt;

import java.util.Arrays;

public class HowTofindMissingNumber {

	
	public static void main(String[] args) {
		
	int num[]=new int[101];
		
			for(int i=1;i<101;i++){
				num[i]=i;
			}
			num[30]=0;
			num[20]=0;
			num[2]=0;
			
			//check which number is miising
	
	for(int i=1;i<=100;i++){
		if(i!=num[i]){
			System.out.println("missing number="+i+"");
		}
	}
			
			System.out.println(Arrays.toString(num));
	}
}
