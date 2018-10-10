package com.nt.basedString;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class HowToremoveDuplicatechara {
	
	
	
	public static void main(String[] args) {
		
		//given string 
		String name="bananas";
		LinkedHashMap<Character,Integer>map=new LinkedHashMap<Character,Integer>();
		
		for(int i=0;i<name.length();i++){
			
			map.put(name.charAt(i),i);
		}
		System.out.println(map);
		Set<Character>s=map.keySet();
		String result="";
		Iterator<Character>i=s.iterator();
		for(Character a:s){
			result+=a;
			
		}
		
		System.out.println(result);
	}

}
