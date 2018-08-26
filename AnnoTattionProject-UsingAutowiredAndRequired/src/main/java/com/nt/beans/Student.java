package com.nt.beans;







import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ss")
public class Student {
	
	@Value("vinod")
	private String name;
	@Value("hyd")
	private String add;
	@Value("123")
	private int rollnum;
	@Value("230")
	private int marks;
	@Autowired(required=true)
	private Date date;
	@Autowired(required=true)
	//@Qualifier("s")
	@Qualifier("e")
	private Example e;
	public void setName(String name) {
		this.name = name;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	
	public void setRollnum(int rollnum) {
		this.rollnum = rollnum;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", add=" + add + ", rollnum=" + rollnum + ", marks=" + marks + ", date=" + date
				+ ", e=" + e + "]";
	}
	

}
