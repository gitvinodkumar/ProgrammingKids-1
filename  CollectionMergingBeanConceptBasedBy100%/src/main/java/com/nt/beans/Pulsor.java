package com.nt.beans;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("pulsor")
public class Pulsor extends Bike {
	
	
	
	@Value("hhhhhh")
	public List<String> properties;
	@Value("ooooooo")
	 public HashSet<String>numbers;
	@Value("ppppppppppppppp")
	 public LinkedHashSet<Integer>phno;
	 //public Hashtable<String, String>ages;
	@Override
	public String toString() {
		return "Pulsor [properties=" + properties + ", numbers=" + numbers + ", phno=" + phno + "]";
	}
	

}
