package com.nt.collections;

import java.util.Stack;

public class OwnStackTest {
	
	
	public static void main(String[] args) {
		
		Stack<String>s=new Stack();
		s.push("a");
		s.push("b");
		s.push("c");
		s.push("d");
		
		System.out.println(s.pop());
		
		System.out.println(s.peek());
		System.out.println(s);
		
		OwnStack o=new OwnStack();
		o.push("v");
		o.push("i");
		o.push("h");
		o.push("p");
		System.out.println(o);
	}

}
