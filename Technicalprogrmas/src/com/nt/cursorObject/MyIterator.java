package com.nt.cursorObject;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class MyIterator {

	public static void main(String[] args) {
		
		
		List<String>l=new ArrayList<String>();
		l.add("vinod");
		l.add("hari");
		l.add("nataraz");
		l.add("jjjj");
		l.add("kkk");
		
		
		
		
		ListIterator<String>it=l.listIterator();
		
		
		/*System.out.println();
		
		
		System.out.println();
		it=l.listIterator();
		while(it.hasNext()){
			it.add("ppp");
			
			System.out.println("l="+it.next());
			
		}
		System.out.println();
		it=l.listIterator();
		while(it.hasNext()){
		
		     it.add("pplll");	
			System.out.println("l1="+it.next());
			it.remove();
		}
		System.out.println();
		System.out.println(l);
		*/
		
		
		/*while(it.hasNext()){
			
		    
			System.out.println("l1="+it.next());
			 it.set("hari");
		}
		System.out.println();
		System.out.println(l);*/
		
		
/*while(it.hasNext()){
			
		   			System.out.println("l1="+it.next());
			
		}
		System.out.println();
		System.out.println(l);
	}*/
		
		LinkedList<String> llist = new LinkedList<String>();
	    llist.add("1");
	    llist.add("2");
	    llist.add("3");
	    llist.add("4");
	    llist.add("5");
	    ListIterator<String> litr = llist.listIterator();
	    while (litr.hasNext()){
	      litr.next();
	    }
	    boolean bol = litr.hasPrevious();
	    System.out.println("List has elements : " + bol);
	    System.out.println("Elements of list = " + llist);
	    System.out.println("Size of list = " + llist.size());
	    System.out.println("Elements are in previous order ");
	    while (litr.hasPrevious())
	      System.out.println(litr.previous());
	    
	    
	    System.out.println();
	    ListIterator<String>li=l.listIterator();
	    while(li.hasNext())
	    	li.next();
	    
	    System.out.println(li.hasPrevious());
	    while(li.hasPrevious()){
	    	System.out.println(li.previous());
	    }
		
     
      
      
}
}
