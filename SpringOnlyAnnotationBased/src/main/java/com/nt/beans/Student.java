package com.nt.beans;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

import com.nt.address.Example;


@Named("ss")
//@Component("ss")
public class Student {
	
	@Value("vinod")
	private String name;
	@Value("1234")
	private int id;
	@Inject
	private Address add;
	
	private Example e;

	//inplcae of required we will use inject
	
	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}
/////////
	
	/*public void setAdd(Address add) {
		this.add = add;
	}*/

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", add=" + add + "]";
	}
	
	

}
