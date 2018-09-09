package com.nt.movesZeros;

import java.util.Arrays;

public class MovesZeros {

	public static void main(String[] args) {
		
		int arr[]={1,2,3,0,0};
	int counter=arr.length-1;
	
	for(int i=arr.length-1;i>=0;i--){
		if(arr[i]!=0){
			arr[counter]=arr[i];
			counter--;
			
		}
	}
		//remaing non-zeros
		while(counter>=0){
			arr[counter]=0;
			counter--;
		}
	
					
	System.out.println(Arrays.toString(arr));				
				
		
	}

}
