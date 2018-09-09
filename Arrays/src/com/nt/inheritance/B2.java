package com.nt.inheritance;

 class Z{
	
	public void m1(int...a){
		System.out.println("A.m1()");
	}
	
}

public class B2 extends Z{
	public void m1(int...a){
		System.out.println("B.m1()");

}
	
	public static void main(String[] args) {
		B2 b=new B2();
		b.m1();
		b.m1(3);
		
		Z a=new B2();
		a.m1();
		a.m1(3);
		//a.m1(9l);
	}
}