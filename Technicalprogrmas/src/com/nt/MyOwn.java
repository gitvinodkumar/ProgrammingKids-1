package com.nt;

public class MyOwn {
	
	
	public static void main(String[] args) {
		
		
		   StringBuilder s=new StringBuilder("00000000000");
		   String s1="";
		   //s.replace(0, 2, s1);
		 
		 
		 System.out.println(s.toString());
		 
		 int n=Integer.parseInt(s1);
		   int b=0;int count=0;int c=0;
		 while(n!=0){
			 b=((int)Math.pow(2, count++))*n%10;
			 c+=b;
			 n=n/10;
		 }
		 //System.out.println(c);
		 String s2=String.valueOf(c);
		
		 s.replace(0,1, s2);
		 s.reverse();
		 System.out.println(s);
		     
		   
		
		
	}

}
