package com.nt;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HowtofindDuplicateNumbers {
	
	
	
	public static void main(String[] args) {
		
	
	
    String name="javaprogramming";
    Map<Character,Integer>map=new HashMap<Character,Integer>();
    for(int i=0;i<name.length();i++){
    	
    	if(!(map.containsKey(name.charAt(i)))){
    		
    		map.put(name.charAt(i),1);
    	}else{
    	    map.put(name.charAt(i),(map.get(name.charAt(i))+1));	
    	}
    }//for loop
    	
    	//retirve the key sets
    	Set<Character>set=map.keySet();
    	Iterator<Character>ch=set.iterator();
    	
    	for(Character ch1:set){
    		
    		if((map.get(ch1)>=2)){
    			System.out.println("this="+ch1);
    		}
    	}
    	
    	
    	
    
    System.out.println(map);

}//main
}//class