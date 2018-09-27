package com.nt.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class HowtoReverseCollection {

	public static void main(String[] args) {
	
		List<String>list=new ArrayList<String>();
		
		list.add("vinod");
		list.add("nataraz");
		list.add("hari");
		
		Iterator<String>it=list.iterator();
		String name[]=new String[list.size()];
		int lenth=list.size();
		  int a=lenth-1;
		while(it.hasNext()){
			
			name[a--]=it.next();
			
		}
		
                 //print string array
		System.out.println(Arrays.toString(name));
		//reverse the Collections
		String name1[]=new String[list.size()];
		int count=0;
		for(int i=name.length-1;i>=0;i--){
			name1[count]=name[i];
			count++;
		}
		System.out.println("reversing the aarray:"+Arrays.toString(name1));
	}

}
