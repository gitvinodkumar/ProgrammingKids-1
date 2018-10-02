package com.nt.collections;

import java.util.Arrays;

public class OwnStack {
	
	private Object[]obj=new Object[10];
	int count=0;
	
	public void push(Object ele){
		
		obj[count++]=ele;
		
	}
	
	public Object pop(){
		
		return obj[--count];
		
	}
	
	public Object peek(){
		
		return obj[count];
		
	}

	@Override
	public String toString() {
		StringBuilder br=new StringBuilder();
		br.append("[");
		for(int i=0;i<size();i++){
			br.append(obj[i]);
			br.append(",");
		}
	
		
		br.append("]");
		
		return new String(br);
	}
	
	public int size(){
		
		return count;
		
	}
	  
	
	

}
