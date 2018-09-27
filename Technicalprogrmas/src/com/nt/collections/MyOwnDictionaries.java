package com.nt.collections;

import java.util.Dictionary;
import java.util.Hashtable;

public class MyOwnDictionaries {

	public static void main(String[] args) {
		
	Hashtable<String,String>map=new Hashtable<String,String>();
	map.put("vinod","123");
	System.out.println(map);
	Dictionary<String,Object>dict=new Hashtable<String,Object>();

		dict.put("1",new Example("vinod"));
		System.out.println(dict);

	}

}
