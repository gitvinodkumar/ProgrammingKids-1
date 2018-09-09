package com.nt.benas;

public class MyThread extends Thread {
	
	
	public MyThread(String string) {
		
		super(string);
	}


	public void run(){
		System.out.println("MyThread.run()");
		System.out.println(Thread.currentThread());
	}

	
	public static void main(String[] args) {
		//Thread th=new Thread(new MyThread());
		
		MyThread th=new MyThread("thread-1");
		th.start();
	}
}
