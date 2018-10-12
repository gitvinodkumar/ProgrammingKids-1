package com.nt.concurrent;

import java.util.Enumeration;
import java.util.concurrent.ConcurrentHashMap;

public class MyConcurrentHashMap {

	public static void main(String[] args) {
		
		
		ConcurrentHashMap<Integer,String>map=new ConcurrentHashMap<Integer,String>();
		map.put(1,"vinod");
		map.put(2,"java");
		map.put(3,"jjjj");
		System.out.println(map);
		
		
		

	}

}
