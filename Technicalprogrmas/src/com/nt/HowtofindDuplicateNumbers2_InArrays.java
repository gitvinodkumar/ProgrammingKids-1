package com.nt;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HowtofindDuplicateNumbers2_InArrays {
	
	
	
	public static void main(String[] args) {
		
	
	
    String []name={"vinod","java","hari","vinod","java"};
    Map<String,Integer>map=new HashMap<String,Integer>();
    for(int i=0;i<name.length;i++){
    	
    	if(!(map.containsKey(name[i]))){
    		
    		map.put(name[i],1);
    	}else{
    	    map.put(name[i],(map.get(name[i])+1));	
    	}
    }//for loop
    	
    	//retirve the key sets
    	Set<String>set=map.keySet();
    	Iterator<String>ch=set.iterator();
    	
    	for(String ch1:set){
    		
    		if((map.get(ch1)>=2)){
    			System.out.print("this="+ch1+" ");
    		}
    		System.out.println();
    	}
    	
    	
    	
    
    System.out.println(map);

}//main
}//class