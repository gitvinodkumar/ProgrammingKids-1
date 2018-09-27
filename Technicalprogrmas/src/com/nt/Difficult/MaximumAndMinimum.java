package com.nt.Difficult;

public class MaximumAndMinimum {

	public static void main(String[] args) {
		
		int arr[]={2,3,4,5,7};
		
		int max=0;
		int min=0;
		//first two paramteres
		if(arr[0]>arr[1]){
			max=arr[0];
			min=arr[1];
		}else{
			min=arr[0];
			max=arr[1];
		}
		
		//remainng varibles
		for(int i=2;i<arr.length;i++){
			//max
			if(arr[i]>max){
				max=arr[i];
				//min
			}else if(arr[i]<min){
				min=arr[i];
			}
			
		}
		System.out.println("max value="+max);
		System.out.println("min value="+min);

	}

}
