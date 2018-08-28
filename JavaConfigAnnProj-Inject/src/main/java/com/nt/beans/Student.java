package com.nt.beans;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;

@Named("ss")
public class Student {
	
	
	private Address add;
	@Value("vinod")
	private String name;
	private Example e;
	
	  @Inject 
	public Student(Address add,Example e){
		//super();
		this.add = add;
		this.e=e;
		
	}

	@Override
	public String toString() {
		return "Student [add=" + add + ", name=" + name + ", e=" + e + "]";
	}
	
	
	
}
