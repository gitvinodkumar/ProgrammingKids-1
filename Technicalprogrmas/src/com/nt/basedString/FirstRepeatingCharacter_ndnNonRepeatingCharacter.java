package com.nt.basedString;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FirstRepeatingCharacter_ndnNonRepeatingCharacter {
	Map<Character,Integer>map=new LinkedHashMap<Character,Integer>();
	
	public  Character Result(String name){
		
       for(int i=0;i<name.length();i++){
			
			if(!map.containsKey(name.charAt(i))){
				map.put(name.charAt(i),1);
			}else{
				map.put(name.charAt(i),map.get(name.charAt(i))+1);
			}
		}
       
       Set<Character>set=map.keySet();
		for(Character c:set){
			
			if(map.get(c)==1){
				return c;
			}
		}
		return null;
		
	}
	
	public Character Result1(){
		
		Set<Character>set=map.keySet();
		for(Character c:set){
			
			if(map.get(c)>1){
				return c;
			}
			
		}
		return null;
	}
	
	

	public static void main(String[] args) {
		FirstRepeatingCharacter_ndnNonRepeatingCharacter f=new FirstRepeatingCharacter_ndnNonRepeatingCharacter();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the given string:");
		String name=sc.nextLine();
		
		System.out.println("fisrst non-repeating element="+f.Result(name));
		System.out.println("fisrst repeating element="+f.Result1());
		

	}

}
