package com.nt.tread;

public class Test {

	public static void main(String[] args) {
		Example e=new Example();
		MyOwnThread th=new MyOwnThread(e);
		MyOwnThread2 th1=new MyOwnThread2(e);
		th.start();
		th1.start();

	}

}
