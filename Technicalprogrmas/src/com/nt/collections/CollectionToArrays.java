package com.nt.collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionToArrays {

	public static void main(String[] args) {
		
		List<String>list=new ArrayList<String>();
		list.add("vinod");
		list.add("hari");
		list.add("nataraz");
		
		//list to arrays
		String name[]=list.toArray(new String[0]);
		System.out.println(name.length);
		for(int i = 0; i< name.length; ++i) {
	         String contents = name[i];
	         System.out.print(contents);
	      } 
		

	}

}
