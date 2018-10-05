package com.nt.recursive;

public class CountDown {
	
	
	static String countDown(int n){
		
		System.out.println(n);
		
		if(n==0)
			return "0";
		
		return " "+n+" "+countDown(n-1);
		
		
	}

	public static void main(String[] args) {
		System.out.println(countDown(10));
	}

}
