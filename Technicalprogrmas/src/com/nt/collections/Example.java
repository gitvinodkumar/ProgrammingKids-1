package com.nt.collections;

public class Example {
	
	String s;
	public Example(String s){
		this.s=s;
	}
	
	public String getS(){
		return s;
	}
	
	
	public int hashCode(){
		System.out.println("Example.hashCode()");
		if(s==null){
		return 12345;
		}else{
			return 2344;
		}
	}
	
	public boolean equals(Object o){
		System.out.println("equlas method()==");
		if(o instanceof Example){
			Example e=(Example)o;
			return (!e.getS().equals(this.s));
		}
		else{
			return false;
		}
	}

	@Override
	public String toString() {
		return "Example [s=" + s + "]";
	}
	
	 

}
