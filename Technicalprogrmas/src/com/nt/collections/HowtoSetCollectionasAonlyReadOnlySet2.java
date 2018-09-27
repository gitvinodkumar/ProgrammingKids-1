package com.nt.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HowtoSetCollectionasAonlyReadOnlySet2 {
	
	
	public static void main(String[] args) {
		
		List<String>list=new ArrayList<String>();
		
		list.add("vinod");
		list.add("hari");
		list.add("nataraz");
		
		list=Collections.unmodifiableList(list);
		//list.add("ooooo");
		System.out.println(list);
		
		
		Set<String>set=new TreeSet<String>();
		set.add("vinod");
		set.add("nataraz");
		set.add("hari");
		set=Collections.unmodifiableSet(set);
		//set.add("iiiii");
		System.out.println(set);
	   }

}
