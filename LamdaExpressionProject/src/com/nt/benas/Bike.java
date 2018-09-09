package com.nt.benas;

public class Bike {
	
	static int x=0;
	public Bike(int x){
		System.out.println("bike");
		x=10;
	}
	
	public void Base(){
		System.out.println("base()");
	}
	

}


class Pulsor extends Bike{
	
 public	Pulsor(){
	 super(5);
		System.out.println("bar");
		//x=90;
	}
	
	/*public static void main(String[] args) {
		Pulsor p=new Pulsor();
	}*/
}