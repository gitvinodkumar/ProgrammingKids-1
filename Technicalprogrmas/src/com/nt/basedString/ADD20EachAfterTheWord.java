package com.nt.basedString;

import java.util.Arrays;

public class ADD20EachAfterTheWord {

	public static void main(String[] args) {
		
		String name="java is great";
		
		//split the world
		String []n=name.split(" ");
		//the result string
		String result[]=new String[n.length];
		String r="";
		for(int i=0;i<n.length;i++){
			
			r+=n[i]+"20%";
		}

		 System.out.println("the result is="+r);
	}

}
