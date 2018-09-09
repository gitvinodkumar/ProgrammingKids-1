package com.nt.benas;

import java.util.HashSet;
import java.util.TreeSet;


class Main {
	   public static void main(String args[]) { 
	     
	      
	      
	      TreeSet<String> treeSet = new TreeSet<>();
	      
	        treeSet.add("Geeks");
	        treeSet.add("for");
	        treeSet.add("Geeks");
	        treeSet.add("GeeksforGeeks");
	 
	        for (String temp : treeSet)
	            System.out.printf(temp + " ");
	 
	        System.out.println("\n");
	        
	        System.out.println(treeSet);
	        
	        HashSet<String> hashSet = new HashSet<>();
	        /*hashSet.add("Geeks");
	        hashSet.add("for");
	        hashSet.add("Geeks");
	        hashSet.add("GeeksforGeeks");*/
	        hashSet.add("vinod");
	        hashSet.add("java");
	        hashSet.add("program");
	 
	        System.out.println(hashSet);
	       
	        
	  }
	}