package com.nt.basedString;

public class StringPermutations { 
	
	
	public static void main(String args[]) { 
		
		
		permutation("123");
		
	}
	
	public static void permutation(String input){ 
		permutation("", input);
		
		}
	static void permutation(String perm, String word) {
		
		if (word.isEmpty()) { 
			
			System.err.println(perm + word);
			
		} else {
			
			for (int i = 0; i < word.length(); i++) {
				
				String a=perm + word.charAt(i);
				String b=word.substring(0, i) + word.substring(i + 1, word.length());
				System.out.println("a="+a+  "  "+"b="+b+"  "+i);
				permutation(a,b);
				} 
			} 
		} 
	
} 

