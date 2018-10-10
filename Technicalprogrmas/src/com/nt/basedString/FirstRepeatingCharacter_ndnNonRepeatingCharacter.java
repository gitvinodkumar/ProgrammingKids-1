package com.nt.basedString;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FirstRepeatingCharacter_ndnNonRepeatingCharacter {

	public static void main(String[] args) {
		//createing map
		Map<Character,Integer>map=new LinkedHashMap<Character,Integer>();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the given string:");
		String name=sc.nextLine();
		
		for(int i=0;i<name.length();i++){
			
			if(!map.containsKey(name.charAt(i))){
				map.put(name.charAt(i),1);
			}else{
				map.put(name.charAt(i),map.get(name.charAt(i))+1);
			}
		}
		
		//retriving the elements from map
		Set<Character>set=map.keySet();
		for(Character c:set){
			
			if(map.get(c)>1){
				
			}
			
		}
		

	}

}
