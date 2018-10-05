package com.nt.recursive;

public class StringRecursive {
	
	
	public static String Recursive(String name,int length){
		
		System.out.println(length);
		String ch=String.valueOf(name.charAt(length));
		
		if(length==0)
			return String.valueOf(name.charAt(0));
		
		return ch+Recursive(name, length-1);
		
	}
	
	

	public static void main(String[] args) {
		
		System.out.println(Recursive("vinod", 4));
		
	}

}
