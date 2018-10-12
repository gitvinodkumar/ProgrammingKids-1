package com.nt.collections;

import java.util.HashMap;
import java.util.Map;

public class MapInternals {

	public static void main(String[] args) {
		
		Map<Integer,String>map=new HashMap<Integer,String>();
		map.put(7,"vinod");
		map.put(2, "hari");
		map.put(3,"jjjj");
		System.out.println(map);
		
		HashMap<Integer,String>m=new HashMap<Integer,String>();
		m.put(7,"vinod");
		m.put(2, "hari");
		m.put(3,"jjjj");
		System.out.println(m);

	}

}
