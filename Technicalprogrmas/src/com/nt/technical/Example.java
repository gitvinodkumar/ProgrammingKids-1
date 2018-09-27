package com.nt.technical;

public class Example {

	
	
	public static void main(String[] args) {
		Integer io=new Integer(420);
		Integer i1=io;
		io++;
		StringBuilder br=new StringBuilder("123");
		StringBuilder br1=br;
		br.append("5");
		System.out.println(io);
		System.out.println(i1);
		System.out.println(br);
		System.out.println(br1);
		System.out.println((io==i1)+" "+(br==br1));
	}
}
