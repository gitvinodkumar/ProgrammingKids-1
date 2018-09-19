package com.nt;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class ABCD {
	
	
	public static void main(String[] args) {
		
		Map<String,Integer>map=new LinkedHashMap<>();
		
		for(int i=0;i<=2;i++){
			
			for(int j=97;j<=122;j++){
				
				if(i==0){
					String ch=String.valueOf((char)j);
					map.put(ch,i);
				}
					if(i==1){
						String ch1=String.valueOf((char)j);
						map.put(ch1+ch1,i);
					}
					if(i==2){
						String ch=String.valueOf((char)j);
						map.put(ch+ch+ch,i);
					}
					
			}
			
		}
		Set<String>set=map.keySet();
		Iterator<String>it=set.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+" ");
			
		}
		
		System.out.println("=====");
		
	}
}
		
		
	


