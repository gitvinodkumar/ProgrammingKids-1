package com.nt;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HowtofindDuplicateNumbers {
	
	public HowtofindDuplicateNumbers() {
		System.out.println("cons");
	}
	public static void main(String[] args) throws ClassNotFoundException {
		
		Map<Integer,Integer>map=new HashMap<>();
		int num[]=new int[]{1,3,2,3,0};
		
		map.put(1,1);
		Class name=Class.forName("com.nt.HowtofindDuplicateNumbers");
		
		Object oj=(Object)name;
		HowtofindDuplicateNumbers h=(HowtofindDuplicateNumbers)oj;
		System.out.println(h);
	}

}
