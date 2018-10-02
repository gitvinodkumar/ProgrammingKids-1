package com.nt.technical;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Abcd {
	
	
	
	public static void main(String[] args) {
		
		String s[]={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		System.out.println(s.length);
		
		Map<String,Integer>map=new LinkedHashMap<>();
		
		for(int i=0;i<26;i++){
			
			
			map.put(s[i],1);
		}
		
		
		Set<String>set=map.keySet();
		Iterator<String>it=set.iterator();
		for(int k=0;k<=6;k++){
			it=set.iterator();
		while(it.hasNext()){
			for(int i=0;i<26;i++){
				String ch=it.next();
			if((ch==s[i])){
				for(int j=0;j<26;j++){
					if(k==0)
					System.out.print(ch+s[j]+" ");
					if(k==1){
						
						System.out.print(ch+ch+s[j]+" ");
					}
                    if(k==2){
						
						System.out.print(ch+ch+ch+s[j]+" ");
					}
                     if(k==3){
						
						System.out.print(ch+ch+ch+ch+s[j]+" ");
					}
                     if(k==4){
 						
 						System.out.print(ch+ch+ch+ch+s[j]+" ");
 					}
                     if(k==5){
  						
  						System.out.print(ch+ch+ch+ch+ch+s[j]+" ");
  					}
                     if(k==6){
  						
  						System.out.print(ch+ch+ch+ch+ch+ ch+s[j]+" ");
  					}
				}
				System.out.println();
				;
			}
			System.out.println();
			
			}
		}
	}

}
}
