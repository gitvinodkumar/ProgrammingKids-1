package com.nt.beans;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class Pulsor extends Bike {
	
	
	
	
	public List<String> properties;
	 public HashSet<String>numbers;
	 public LinkedHashSet<Integer>phno;
	 public Hashtable<String, String>ages;
	@Override
	public String toString() {
		return "Pulsor [properties=" + properties + ", numbers=" + numbers + ", phno=" + phno + "]";
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
	public void setAges(Hashtable<String, String> ages) {
		this.ages = ages;
	}
	

}
