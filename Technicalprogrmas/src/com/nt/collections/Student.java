package com.nt.collections;

public class Student implements Comparable<Object> {
	
	private String name;
//private int no;
private String no;
	public Student(int no,String name) {
		this.name=name;
		//this.no=no;
	}
	public Student(String no) {
		//this.name=name;
		this.no=no;
	}

	@Override
	public int compareTo(Object o) {
		
		Student s=(Student)o;
		System.out.print("previouse name="+s.no+"  ");
		System.out.println("current name="+this.no);
//		int diff=this.no-s.no;
		//this is numbser wies natural odering
		//here names wise ordering
		char ch=no.charAt(0);
		char ch1=s.no.charAt(0);
		int diff=ch-ch1;
		//System.out.println(diff);
		if(diff<0){
			return -1;
		}else if(diff>0){
			return 1;
		}
		
		return 0;
	}
	@Override
	public String toString() {
		return "Student [ no=" + no + "]";
	}

	
	
	
	

}
