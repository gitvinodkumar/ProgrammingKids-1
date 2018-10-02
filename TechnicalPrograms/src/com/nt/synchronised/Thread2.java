package com.nt.synchronised;

public class Thread2 extends Thread {

	Student s;
	public Thread2(Student s) {
		
		this.s=s;
	}
	
	public void run(){
		
		//s.add(10,30);
		s.m1();
	}

}
