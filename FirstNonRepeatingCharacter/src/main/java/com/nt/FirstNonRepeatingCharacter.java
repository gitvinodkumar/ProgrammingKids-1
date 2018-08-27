package com.nt;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;


public class FirstNonRepeatingCharacter {

	private static Logger logger=Logger.getLogger(FirstNonRepeatingCharacter.class);
	
	public static void main(String[] args) {
		SimpleLayout layout=null;
		ConsoleAppender appender=null;
		
		//create Lqyout///////
		layout=new SimpleLayout();
		//create appender
		appender=new ConsoleAppender(layout);
		//appender is attachment to loger
		logger.addAppender(appender);
		//set activitis
		logger.setLevel(Level.ALL);
		logger.info("program is stared from main method");
		logger.debug("calling static method");
		System.out.println("this is non-repeating first charcter="+m1());
	}	
		public static Character m1(){
		//take string
		String name="javaprogramming";
		HashMap<Character,Integer>map=new LinkedHashMap<Character,Integer>();
		
		logger.debug("this is for loop");
		for(int i=0;i<=name.length()-1;i++){
			char ch=name.charAt(i);
			if(map.containsKey(ch)){
				map.put(ch,map.get(ch)+1);
			}else{
				map.put(ch,1);
			}
			
			
		}logger.debug("end the loop");
		
		logger.debug("retriving the elemnets i hash map by using for loop");
		Set<Character>s=map.keySet();
		
		
		for(Character c:s){
			
			if(map.get(c)==1){
				return c;
			}
		}
		return null;
		
	}
}
