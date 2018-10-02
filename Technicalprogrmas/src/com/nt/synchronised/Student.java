package com.nt.synchronised;

public class Student {
	
	 int x;
	  int y;
	
	public synchronized void add(int x,int y){
		
		this.x=x;
		this.y=y;
		try{
			Thread.sleep(1000);
			
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		int res=this.x+this.y;
		System.out.println(res);
		
	}

}
