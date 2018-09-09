package com.nt.movesZeros;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class FindDuplicate1 {

	public static void main(String[] args) {
		
		String name="butter bread and bread butter";
		String word[]=name.split(" ");int count=0;
		/*int count=0;
		System.out.println(word[0].toLowerCase());
		for(int i=0;i<word.length-1;i++){
			
			if(word[i].toLowerCase()==word[i+1].toLowerCase()){
				System.out.println(word[i]);
			}
				
				
		}*/
		//
		ArrayList<String>al=new ArrayList<String>();
		
		for(String wor:word){
			if(al.contains(wor)){
				System.out.println("taht is duplicate:=="+wor);
				count++;
			}else{
				al.add(wor);
				count++;
			}
			
			
		}
		
		System.out.println("number of words is="+count);
	}

}
