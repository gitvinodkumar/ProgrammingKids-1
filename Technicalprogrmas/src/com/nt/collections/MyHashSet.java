package com.nt.collections;

import java.util.HashSet;

public class MyHashSet {
	
	
	public static void main(String[] args) {
		
		HashSet<Object>set=new HashSet<>();
		set.add("vinod");
		set.add(new Example("hari"));
		set.add(new Example("hari"));
		
		System.out.println(set);
		
	}

}
