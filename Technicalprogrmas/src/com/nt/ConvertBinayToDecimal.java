package com.nt;

import java.text.NumberFormat;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ConvertBinayToDecimal {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Map<Integer,String>map=null;
		StringBuilder br=new StringBuilder();
		
		System.out.println("enter the numer");
		
		int decimal=sc.nextInt();
		int result=0;
		//create map object
		map=new TreeMap<Integer,String>();
		map.put(10,"A");
		map.put(11,"B");
		map.put(12,"C");
		map.put(13,"D");
		map.put(14,"E");
		map.put(15,"F");
		
		while(decimal!=0){
			
			if(map.containsKey(decimal%16)){
			br.append(map.get(decimal%16));
			decimal=decimal/16;
			System.out.println("if");
			}else{
				br.append(decimal%16);
				decimal=decimal/16;
				System.out.println("the else");
			}
			
		}
		br.reverse();
		System.out.println(br);
		
		

	}

}
