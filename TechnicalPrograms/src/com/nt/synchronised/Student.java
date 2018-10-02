package com.nt.synchronised;

public class Student {
	
	 static int x;
	 static  int y;
	
	public synchronized void add(int x,int y){
		
		this.x=x;
		this.y=y;
		try{
			Thread.sleep(2000);
			
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		int res=this.x+this.y;
		System.out.println(res);
		
	}
	
	public synchronized void m1(){
		/*this.x=90;
		this.y=100;*/
		Student s=new Student();
		s.y=90;s.x=10;
		System.out.println("this is void m1()");
	}

}
