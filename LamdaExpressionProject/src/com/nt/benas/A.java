package com.nt.benas;

public class A extends B
{
	
	private A(){
		super();
	}
	public final String sing() 
	{
		return "fa";
	}
	public static void main(String[] args) 
	{
		A a = new A();
		B b = new A();
	System.out.println(a.sing() + " " );
	}
}
class B 
{
	private final String sing() 
	{
		return "la";
	}
}