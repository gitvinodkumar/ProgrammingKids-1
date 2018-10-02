package com.nt.collections;

import java.util.IdentityHashMap;
import java.util.Map;

public class MyIdentityHashMap {
	
	
	
	public static void main(String[] args) {
		
		
		Map<String,String>map=new IdentityHashMap<>();
		
		map.put("course","java");
		map.put("name","vinod");
		map.put("phno","278288");
		System.out.println(map);
	}

}
