package com.nt.technical;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class BinaryToOcatl {

	public static void main(String[] args) {
	  
		  Scanner sc=new Scanner(System.in);
		  //given value
		  int binary=sc.nextInt();
		  int decimal=0;
		  int count=0;
		  StringBuilder ocatal=new StringBuilder();
		  //create MAP
		  Map<Integer,String>map=new TreeMap<Integer,String>();
		  map.put(10,"A");
		  map.put(11,"B");
		  map.put(12,"C");
		  map.put(13,"D");
		  map.put(14,"F");
		  map.put(15,"E");
		  
		  //convert binay to decimal
		  while(binary!=0){
			  
			  decimal+=(binary%10)*(Math.pow(2,count));
			  
			  count++;
			  binary=binary/10;
		  }
	System.out.println("bainary to decimal="+decimal);
	//decimal to ocatl
	count=0;
	while(decimal!=0){
		ocatal.append(decimal%8);
		decimal=decimal/8;
	}
System.out.println(ocatal.reverse());
//int octal=Integer.valueOf(new String(ocatal));
int octal=10;
System.out.println("BinaryToOcatl.main()"+octal);
//System.out.println(octal);
//by using StringBuilder
StringBuilder br=new StringBuilder();
    //decimal to hexdecimal
     while(octal!=0){
    	 
    	 if(map.containsKey(octal%16)){
    		 br.append(map.get(octal%16));
    		 octal=octal/16;
    		 System.out.println("BinaryToOcatl.main()");
    	 }else{
    		 
    		 br.append(octal%16);
    		 octal=octal/16;
    		 System.out.println("BinaryToOcatl.main()-");
    	 }
    	 
    	
    	
     }
     br.reverse();
	 System.out.println("decimal to hexadecimal="+br);

	}

}
