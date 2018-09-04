package com.nt.beans;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class Bike {
	
	
	
	
	  public List<String> properties;
	  public HashSet<String>numbers;
	public LinkedHashSet<Integer>phno;
///////////////////
	
	@Override
	public String toString() {
		return "Bike [ properties=" + properties + "]";
	}

	public void setProperties(List<String> properties) {
		this.properties = properties;
	}

	public void setNumbers(HashSet<String> numbers) {
		this.numbers = numbers;
	}

	public void setPhno(LinkedHashSet<Integer> phno) {
		this.phno = phno;
	}

}
