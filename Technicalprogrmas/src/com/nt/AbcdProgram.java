package com.nt;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class AbcdProgram {
	
	
	public static void main(String[] args) {
		
		Map<Character,Integer>map=new HashMap<>();
		Map<String,Integer>map1=new LinkedHashMap<>();
		Map<String,Integer>map2=new LinkedHashMap<>();
		for(int j=0;j<=3;j++){
		for(int i=97;i<=122;i++){
			map.put((char)i,i);
			if(map.get((char)i)==i){
				String ch=String.valueOf((char)i);
				map1.put(ch+ch,i+i);
				
			}
			
			if(i==3)
			if(map1.get((char)i)!=i){
				String ch=String.valueOf((char)i);
				map2.put(ch+ch+ch,i+i+i);
				
			}
		}
		}
		Set<Character>set=map.keySet();
		
		Iterator<Character>it=set.iterator();
		
		while(it.hasNext()){
			char ch=it.next();
			System.out.print(ch+" ");
		}
		System.out.println();
		System.out.println("------------");
    Set<String>set1=map1.keySet();
		
		Iterator<String>it1=set1.iterator();
		
		while(it1.hasNext()){
			String ch=it1.next();
			System.out.print(ch+" ");
		}
		System.out.println();
		System.out.println("===========");
Set<String>set2=map2.keySet();
		
		Iterator<String>it2=set2.iterator();
		
		while(it2.hasNext()){
			String ch=it2.next();
			System.out.print(ch+" ");
		}
	}

}
