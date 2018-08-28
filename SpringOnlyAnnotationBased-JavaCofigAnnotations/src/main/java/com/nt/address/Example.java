package com.nt.address;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nt.beans.Address;

@Component("ex")
public class Example {
	
	@Autowired
	Address add;

	@Override
	public String toString() {
		return "Example [add=" + add + "]";
	}
	/////////////////////
	
	

}
