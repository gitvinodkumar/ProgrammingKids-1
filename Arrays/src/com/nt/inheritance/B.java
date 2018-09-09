package com.nt.inheritance;

 class A{
	
	public void m1(int...a){
		System.out.println("A.m1()");
	}
	
}

public class B extends A{
	public void m1(long...a){
		System.out.println("B.m1()");

}
	
	public static void main(String[] args) {
		B b=new B();
		b.m1();
		b.m1(3);
		b.m1(5l);
		A a=new B();
		a.m1();
		a.m1(3);
		//a.m1(9l);
	}
}