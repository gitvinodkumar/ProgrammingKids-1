package com.nt.tread;

public class MyOwnThread extends Thread {
	
	Example e;
	MyOwnThread (Example e){
		this .e=e;
	}
	
	public void run(){
		
		e.m1();
		
	}
	

}
