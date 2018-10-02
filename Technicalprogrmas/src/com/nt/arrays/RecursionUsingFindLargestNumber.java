package com.nt.arrays;

import java.util.Arrays;

public class RecursionUsingFindLargestNumber{
  public static void main(String[] args)
  {
    int[] arr = {1,2,4,3};
    int max = recursiveMax(arr, arr.length);
    System.out.println("Maximum element: " + max);
  }
 
  static int recursiveMax(int[] arr, int length) 
  {
	  System.out.println("RecursionUsingFindLargestNumber.recursiveMax()="+Arrays.toString(arr)+"     "+length);
    if (length == 1)
      return arr[0];
    
    return max(recursiveMax(arr, length - 1), arr[length - 1]);
  }
 
  private static int max(int n1, int n2)
  {
	  System.out.println("RecursionUsingFindLargestNumber.max()="+"n1="+n1+"  "+"n2="+n2);
    return n1 > n2 ? n1 : n2;
  }	
}