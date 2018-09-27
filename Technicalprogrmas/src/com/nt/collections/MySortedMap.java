package com.nt.collections;

import java.util.TreeSet;

public class MySortedMap {

	public static void main(String[] args) {
		
		/*SortedMap<Object,Integer>map=new TreeMap<Object,Integer>();
		map.put("b",1);
		map.put("a",2);
		map.put("c",3);
		map.put(new Example("a"),5);
		
		System.out.println(map);*/
		
		TreeSet<Object>set=new TreeSet<Object>();
		
		set.add(new Student("vinod"));
		//System.out.println(set);
		set.add(new Student("hari"));
		set.add(new Student("amar"));
		set.add(new Student("bhanu"));
		set.add(new Student("zshok"));
		System.out.println(set);
		
	}

}
