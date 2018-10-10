package com.nt.basedString;

public class SumOfGivenDigitNumber {
	
	
	public static int Recursion(int num){
		
		if(num==0){
			return 0;
		}else{
			int n=num%10;
		    num=num/10;
			return n+Recursion(num);
		}
		
	}

	public static void main(String[] args) {
		
		System.out.println(Recursion(789));
		

	}

}
