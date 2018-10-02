package com.nt.tread;

public class Example {
	
	
	public static void m1(){
		
		for(int i=0;i<10;i++){
			System.out.println("thi is static="+i);
		}
		
	}

	public void m2(){
		for(int i=10;i>=0;i--){
			System.out.println("thi is non-static method()"+i);
		}
	}
	
}
