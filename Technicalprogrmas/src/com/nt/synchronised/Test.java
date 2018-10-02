package com.nt.synchronised;

public class Test {

	public static void main(String[] args) {
		Student s=new Student();
		Thread1 th=new Thread1(s);
		Thread2 th1=new Thread2(s);
		
           th.start();
           th1.start();
	}

}
