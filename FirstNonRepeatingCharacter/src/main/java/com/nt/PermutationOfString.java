package com.nt;

public class PermutationOfString {
	
	
	
		
	    public static void main(String args[]) throws InterruptedException {
	        permutation("GOD");
	       
	    }

	   
	 /*
	  * A method exposed to client to calculate permutation of String in Java. 
	  */
	   public static void permutation(String input) throws InterruptedException{
	          permutation("", input);
	          System.out.println("hii");
	   }

	   /*
	    * Recursive method which actually prints all permutations
	    * of given String, but since we are passing an empty String
	    * as current permutation to start with,
	    * I have made this method private and didn't exposed it to client. 
	    */
	   private static void permutation(String perm, String word) throws InterruptedException {
		 
		   
	        if (word.isEmpty()) {
	           /* System.out.print(perm + word);
	           System.out.print(" ");
	          */

	        } else {
	        	//System.out.println("word="+word+"   "+"perm="+perm);
	        	System.out.println("wordlength="+word.length());
	            for (int i = 0; i < word.length(); i++) {
	                permutation(perm + word.charAt(i), word.substring(0, i) 
	                                        + word.substring(i + 1, word.length()));
	                
	               // System.out.println(word.charAt(i));
	                System.out.println(i);
	                
	            }
	           
	          
	        }
	       

	    }
	}
    





