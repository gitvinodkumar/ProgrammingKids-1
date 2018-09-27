package com.nt.technical;

import java.util.Scanner;

public class NumberConvertIntoString {

	public static void main(String[] args) {
		
		/*String[]arr={"one","two","three","four","five","six","seven","eight","nine","ten"};
		String arr1[]={"ten","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninty"};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number=");
		int num=sc.nextInt();
		System.out.println(arr[num-1]);*/
		
		 int counter=3;
		    for(int x=0;x<=counter;x++)
		    {   
		        int quotient, remainder;
		        String result="";
		        quotient=x;

		        while (quotient>0)
		        {   
		            remainder=quotient%27;
		            result = (char)(remainder+64) + result;
		            quotient = (int)Math.floor(quotient/27);

		        }
		    System.out.print(result+ " ");
		           }

	}

}
