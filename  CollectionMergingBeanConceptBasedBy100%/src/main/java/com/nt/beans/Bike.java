package com.nt.beans;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("bike")
public class Bike {
	
	
	
	@Value("vinod")
	  public List<String> properties;
	@Value("hari")
	  public HashSet<String>numbers;
	@Value("89999")
	public LinkedHashSet<Integer>phno;
///////////////////
	
	@Override
	public String toString() {
		return "Bike [ properties=" + properties + "]";
	}
 
	
	/**/

}
