package TestPrograms;

import java.util.Arrays;

public class TrickyQuestion {

	public static void main(String[] args) {
		
		
		//given string 
		String name="java is fun";
		//splited into words
		String arr[]=name.split(" ");
		
		String out1=" ",out2=" ",out3=" ";
		//first for loop
		for(int i=0;i<arr.length;i++){
			
			//second loop
			
			for(int j=arr[i].length()-1;j>=0;j--){
				out1+=String.valueOf(arr[i].charAt(j));
				
			}
			//adding space
			out1+=" ";
			
		}
		System.out.println(out1);
		//remove spaces from first and last places
		out1=out1.trim();
		System.out.println(out1);

		System.out.println(out1.length());
		//for second output
		//convert out split
		String arr1[]=out1.split(" ");
		
		  System.out.println(arr1.length);
		  System.out.println(Arrays.toString(arr1));
		 String t1=arr1[0];
		 String t2=arr1[2];
		 //replcaes the values
		 arr1[0]=t2;
		 arr1[2]=t1;
		 System.out.println(Arrays.toString(arr1));
		 //convert array to string
		 for(int i=0;i<arr1.length;i++){
			 out2+=arr1[i];
			 out2+=" ";
		 }
		 
		 System.out.println(out2);
		 out2=out2.trim();
		 
		 
		
	}

}
