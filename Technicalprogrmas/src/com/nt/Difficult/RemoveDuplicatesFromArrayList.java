package com.nt.Difficult;

import java.util.TreeSet;

public class RemoveDuplicatesFromArrayList {
	
	
	public static void main(String[] args) {
		
		int i[]={1,2,3,4,2,3,2};
		
		TreeSet<Integer>set=new TreeSet<Integer>();
		for(int j=0;j<i.length;j++){
			set.add(i[j]);
		}
		
		System.out.println("after removing duplicates from arry="+set);
	}

}
