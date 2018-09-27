package com.nt.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HowToFindMinAndMax {

	public static void main(String[] args) {
		
		List<Integer>list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(6);
		//find min and max number
		System.out.println(list);
		//convert list to arrays
		Collections.rotate(list, 2);
		System.out.println(list);
	}

}
