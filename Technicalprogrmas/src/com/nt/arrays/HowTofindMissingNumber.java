package com.nt.arrays;

public class HowTofindMissingNumber {
	
	
	public static int MissingNum(int arr[],int length){
		
		int count=1;
		for(int i=0;i<length;i++){
			
			if(arr[i]!=count++){
				return i;
			}
		}
		return -1;
		
		
	}

	public static void main(String[] args) {
		System.out.println(MissingNum(new int[]{1,2,3,4,5,7},7));

	}

}
