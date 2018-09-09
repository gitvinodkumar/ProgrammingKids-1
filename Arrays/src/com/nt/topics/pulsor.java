package com.nt.topics;

public class pulsor implements Bike {

	@Override
	public String[] properties(String[] p) {
		
		System.out.println("this is pulsor propetris");
		p[0]="this is very good";
		p[1]="this is very fate";
		p[2]="this is very high cost";
		
		return p;
	}

}
