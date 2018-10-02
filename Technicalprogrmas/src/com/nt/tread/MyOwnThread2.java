package com.nt.tread;

public class MyOwnThread2 extends Thread {
	
	Example e;
	MyOwnThread2 (Example e){
		this .e=e;
	}
	
	public void run(){
		
		e.m2();
		
	}
	

}
