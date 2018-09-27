package com.nt;

public class SecondLargestNumberinAnArray {

	 private int firstlargest;
	 private int secondlargest;
	public int LargestNumber(int arr[]){
		
	      //first two elemenst 
		if(arr[0]>arr[1]){
			firstlargest=arr[0];
			secondlargest=arr[1];
			
		}else{
		     firstlargest=arr[1];
		     secondlargest=arr[0];
		}
		
		//remaingng elements
		for(int i=2;i<arr.length;i++){
			
			if(arr[i]>firstlargest){
				firstlargest=arr[i];
				
			}else if(arr[i]<secondlargest&& arr[i]>firstlargest){
				
			}
			
		}
		return firstlargest;
		
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		int arr[]={47498,14526,74562,42681,75283,45796};
		
		
			
		}
		
		
	}

