package com.nt;

public class ToFindSmallestNumber {

	public static void main(String[] args) {
		
		System.out.println(smallestEqualSum(new int[]{1,3,2,2,1,3}));
	}
	static	int smallestEqualSum(int[] a) {
	        if(a == null) {
	            return 0;
	        }
	        for (int i = 0; i < a.length; i++) {
	            int sum = 0;
	            int subSum = 0;
	            for (int j = 0; j <= i; j++) {
	                sum += a[j];
	            }
	            if (i == a.length - 1) {
	            	
	                return sum;
	            }
	            int k = i;
	            while (true) {
	                subSum += a[k + 1];
	                k++;
	                if (subSum == sum) {
	                    subSum = 0;
	                    if (k == a.length - 1) {
	                    	//System.out.println("hi"+i);
	                        return sum;
	                    }
	                }
	                if (k == a.length - 1) {
	                    break;
	                }
	            }
	        }
	        return 0;
	    }
		

	}


