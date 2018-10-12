package com.nt.stacks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

public class MyStack {
	
	
	
	public static void main(String[] args) {
		
		/*Stack<Integer> s=new Stack<Integer>();
		
		s.push(1);
		s.push(2);
		s.push(new Integer(3));
		s.push(4);
		System.out.println(s);
		
		s.remove(new Integer(3));
		System.out.println(s);*/
		
		
		
		MyOwnStack s=new MyOwnStack();
		s.push("a");
		s.push("b");
		s.push("c");
		s.push("d");
		s.push("e");
		System.out.println(s);
		s.pop();
		System.out.println(s);
		System.out.println(s.peek());
		
		
		
	}

}
