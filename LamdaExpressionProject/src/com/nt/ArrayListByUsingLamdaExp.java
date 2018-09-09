package com.nt;

import java.util.ArrayList;

public class ArrayListByUsingLamdaExp {

	
	
	public static void main(String[] args) {
		
		ArrayList<String>al=new ArrayList<>();
		
		al.add("vinod");
		al.add("hari");
		al.add("nataraz");
		al.add("jack ma");
		al.add("lord siva");
		
		//using lamda Expression
		
		al.forEach(n->System.out.println(n));
		
	}
}
