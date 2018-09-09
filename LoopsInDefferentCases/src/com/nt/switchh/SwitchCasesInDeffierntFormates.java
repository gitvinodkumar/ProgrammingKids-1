package com.nt.switchh;

import java.util.Stack;

public class SwitchCasesInDeffierntFormates {
	
	
	public static void main(String[] args) {
		
		byte b=(byte)100l;
		System.out.println(b);
		
		byte b1=(byte)100.0;
		System.out.println(b1);
		
		long l=(byte)100l;
		System.out.println(l);
		long l1=(byte)b;
		System.out.println(l1);
		
		
		Stack s=new Stack();
		
		s.push(new Integer(5));
		s.push(new Integer(4));
		s.pop();
		s.push(new Integer(9));
		
		System.out.println(s);
	}

}