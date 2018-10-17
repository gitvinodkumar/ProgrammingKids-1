package com.nt.collections;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class DifferenceBetweenMapAndHashMap {

	public static void main(String[] args) {
		
		
 Map<String,String>map=new IdentityHashMap<>();
   map.put("one","vinod");
   map.put(new String("one"),"hari");
   System.out.println(map.size());
   System.out.println(map);
   
   System.out.println();
   Map<String,String>map1=new HashMap<>();
   map1.put("one","vinod");
   map1.put(new String("one"),"hari");
   System.out.println(map1.size());
   System.out.println(map1);
   System.out.println();
   Map<String,String>map2=new WeakHashMap<>();
   map2.put("one","vinod");
   map2.put(new String("one"),"hari");
   map2.put("three","nataraz");
   map2.put("a","hari");
   System.out.println(map2.size());
   System.out.println(map2);
   
	}

}
