package com.nt.movesZeros;

import java.util.HashMap;
import java.util.Set;

public class FindEachCharacterOccurance {

	public static void main(String[] args) {
		
		//given STring
		String word="javaprogramming";
		
		HashMap<Object,Integer>map=new HashMap<Object,Integer>();
		
		for(int i=0;i<word.length();i++){
			if(map.containsKey(word.charAt(i))){
				//put the key in map and incrment by 1
				map.put(word.charAt(i),map.get(word.charAt(i))+1);
			}else{
				map.put(word.charAt(i),1);
			}
		}
		Set<Object>sh=map.keySet();
		for(Object o:sh){
			
			if(map.get(o)>1){
				System.out.println(map.get(o)+"="+o);
			}else{
				System.out.println(map.get(o)+"="+o);
			}
		}

	}

}
