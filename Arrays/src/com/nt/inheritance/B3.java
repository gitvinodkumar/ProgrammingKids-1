package com.nt.inheritance;

 class X{
	
	public void m1(int...a){
		System.out.println("A.m1()");
	}
	
}

public class B3 extends X{
	public void m1(int[]a){
		System.out.println("B.m1(;;;;)");

}
	
	public static void main(String[] args) {
		B3 b=new B3();
		//b.m1();
		//b.m1(3);
		b.m1(new int[]{9});
		X a=new B3();
		a.m1();
		a.m1(3);
		a.m1(new int[]{9});

	}
}