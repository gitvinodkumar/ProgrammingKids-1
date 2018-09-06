package TestPrograms;

import java.util.Arrays;

public class Non_zerosswifting {
	
	
	
	
	public static void main(String[] args) {
		
		int arr[]={1,1,2,0,5,0,6};
		int temp=0;int count=0;
		
		for(int i=0;i<arr.length;i++){
			
			if(arr[i]!=0){
				
				arr[count]=arr[i];
				count++;
				
			}
		}
				while(count<arr.length){
					arr[count]=0;
					count++;
				}
			
		
		System.out.println(Arrays.toString(arr));
		System.out.println(count);
		
	}

}
