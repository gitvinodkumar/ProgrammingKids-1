package com.nt.casting;

public class CastingOFdiiferntApproches {
	
	static int[]a;
	public static void main(String[] args) {
		
		int i[]=new int[7];
		//int j[]=(int)new short[3];
		Object k=new short[3];
		Object z=new int[]{2,3,4};
		int p[]=(int[])z;
		System.out.println(p[0]);
		System.out.println(a);
	}

}
