package com.nt.stacks;

import java.util.Arrays;

public class MyOwnStack {
	
	Object []obj=new Object[10];
	int count=0;
	public void push(Object obj){
		
		this.obj[count++]=obj;
		
	}
	
	public Object pop(){
		
		return obj[count--];
	}
	

	 public Object peek(){
		 
		 return obj[count];
	 }

	@Override
	public String toString() {
	
		StringBuilder br=new StringBuilder();
		br.append("[");
		for(int i=0;i<=size()-1;i++){
			br.append(obj[i]);
			br.append(",");
		}
		
		br.append("]");
		
			br.delete(br.lastIndexOf(","),br.lastIndexOf(",")+1);
		
		return new String(br);
		
	}
	 
	 public int size(){
		 return count;
	 }
	 
	 
}
