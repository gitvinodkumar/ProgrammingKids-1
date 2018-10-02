package com.nt.synchronised;

public class Thread1 extends Thread {
	
	Student s;
	
	public Thread1(Student s) {
		this.s=s;
	}

	public void run(){
		s.add(10, 10);
	}

}
