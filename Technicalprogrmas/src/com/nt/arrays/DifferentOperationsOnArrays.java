package com.nt.arrays;

import java.util.Arrays;

public class DifferentOperationsOnArrays {

	public DifferentOperationsOnArrays(){
		System.out.println("DifferentOperationsOnArrays.DifferentOperationsOnArrays()");
	}
	
	
	
	
	
	public static void main(String[] args) {
		DifferentOperationsOnArrays n[]=new DifferentOperationsOnArrays[2];
		n[0]=new DifferentOperationsOnArrays();
		
		int i[]=new int[]{1,2,4,3};
		System.out.println(Arrays.toString(i));
		Arrays.sort(i);
        System.out.println(Arrays.toString(i));
        Arrays.fill(i,34);
        System.out.println(Arrays.toString(i));
        
	}

}
