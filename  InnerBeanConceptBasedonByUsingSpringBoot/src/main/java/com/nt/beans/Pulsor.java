package com.nt.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("pulsor")
public class Pulsor {
	
	@Value("123")
	private int bikeno;
	@Value("bajaj")
	private String bikename;
	
	public Pulsor(){
		System.out.println("Pulsor.Pulsor()");
	}
	@Override
	public String toString() {
		return "Pulsor [bikeno=" + bikeno + ", bikename=" + bikename + "]";
	}
	

}
