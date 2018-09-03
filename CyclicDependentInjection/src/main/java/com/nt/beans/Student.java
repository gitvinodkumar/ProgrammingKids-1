package com.nt.beans;

public class Student {
	
	
	private String name;
	private String add;
	
	private Course course;
	public void setCourse(Course course) {
		this.course = course;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", add=" + add + ", course=" + course + "]";
	}
	///////////////////////////////////////
	 
	
	
	
	

}
