package com.nt.topics;

import java.util.Arrays;

public class ObjectCreationAndSyntax {

	ObjectCreationAndSyntax (int x){
		System.out.println(x);
	}
	ObjectCreationAndSyntax (){
		System.out.println("ObjectCreationAndSyntax.ObjectCreationAndSyntax()");
	}
	
	
	public static void main(String[] args) {
		
		int []i=new int[3];
		i[0]='a';
		i[1]=(byte)100;
		i[2]=(int)100l;
		//i[3]=(int)100.0;
		System.out.println(Arrays.toString(i));
		
		ObjectCreationAndSyntax [] object=new ObjectCreationAndSyntax [3];
		
		   object[0]=new ObjectCreationAndSyntax (10);
		   object[1]=new ObjectCreationAndSyntax ();
		   object[2]=new ObjectCreationAndSyntax();
		   
		   System.out.println(Arrays.toString(object));
		   
		   Integer[]n=new Integer[3];
		   n[0]=1;
		   n[1]=3;
		   n[2]=5;
		   System.out.println(Arrays.toString(n));
		   
		   int a[]={1,2,3,4,4};

	}

}
