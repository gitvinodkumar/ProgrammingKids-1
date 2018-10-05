package TestPrograms;

import java.util.Arrays;

public class ReverseEachWordInGivenString {

	public static void main(String[] args) {
		
		String name="java program vinod hari nataraz siva lord spring";
		
		String arr[]=name.split(" ");
		String arr1[]=new String[arr.length];
		System.out.println(Arrays.toString(arr));
		String result="";
		
			
		for(int i=0;i<=arr.length-1;i++){
			
			for(int j=arr[i].length()-1;j>=0;j--){
				
				result+=arr[i].charAt(j);
				
			}
			result+=" ";
			
		}
		System.out.println(result);

	}

}
