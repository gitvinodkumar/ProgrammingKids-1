package com.nt.operators;

public class Var_argsProbelms {
	
	public static void m1(int...x){
		
		for(int z:x){
			System.out.println(z);
		}
		
		for(int i=0;i<x.length;i++){
			System.out.println(x[i]);
		}
		
		
	}
	
	public static void main(String[] args) {
		
		//m1(10);
		int i[]=new int[4];
		i[0]=1;
		i[1]=2;
		i[2]=3;
		i[3]=5;
		//send the values to the method
		m1(i);
		
		
	}

}
