package com.nt.movesZeros;

import java.util.HashMap;
import java.util.Set;

public class FindDuplicate {

	public static void main(String[] args) {
		String name="Bread butter and bread ";
		
		
		//split that word
		String word[]=name.split(" ");
		//use for llop
		
		HashMap<String,Integer>map=new HashMap<String,Integer>();
		
		for(String words:word){
			
			if(map.containsKey(words.toLowerCase())){
				//it contains add 1
				map.put(words.toLowerCase(),map.get(words.toLowerCase())+1);
				
				
			}//else
			else{
				//put only that word as kewy and counet
				map.put(words.toLowerCase(),1);
			}
		
		}
		
		//retirves 
		Set<String>s=map.keySet();
		for(String s1:s){
			//check condition
			if(map.get(s1)>1){
				System.out.println("that is duplicates values:"+s1+"=="+map.get(s1));
			}
		}

	}

}
