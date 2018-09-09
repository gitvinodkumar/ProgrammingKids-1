package com.nt.inheritance;

 class R{
	
	public void m1(int[]a){
		System.out.println("A.m1()");
	}
	
}

public class B4 extends R{
	public void m1(int...a){
		System.out.println("B.m1(;;;;)");

}
	
	public static void main(String[] args) {
		B4 b=new B4();
		b.m1();
		b.m1(3);
		b.m1(new int[]{9});
		R a=new B4();
		//a.m1();
		//a.m1(3);
		a.m1(new int[]{9});

	}
}