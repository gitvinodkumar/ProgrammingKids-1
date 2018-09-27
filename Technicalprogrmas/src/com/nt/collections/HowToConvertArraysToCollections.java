package com.nt.collections;

import java.util.Arrays;
import java.util.List;

public class HowToConvertArraysToCollections {

	public static void main(String[] args) {
		
		String name[]=new String[]{"vinod","hari","nataraz"};
		
		//convert to arrays to Collections
		List<String>list=Arrays.asList(name);
		
		//print name
		System.out.println("list="+list);
		

	}

}
