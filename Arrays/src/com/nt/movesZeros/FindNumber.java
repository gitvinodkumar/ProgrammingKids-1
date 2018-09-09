package com.nt.movesZeros;

import java.util.Scanner;

public class FindNumber {
	
	
	//main method
	public static void main(String[] args) {
		 int n1 = 2, n2 = 4, lcm;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the values which u want to lcm first value");
		String name=sc.nextLine();
		
			char ch=name.charAt(0);
			//convert into number
			n1=(int)ch;
			System.out.println("second value==");
		String sno=sc.nextLine();
		     char ch1=sno.charAt(0);
		     n2=(int)ch1;
			
	        // maximum number between n1 and n2 is stored in lcm
	        lcm = (n1 > n2) ? n1 : n2;

	        // Always true
	        while(true)
	        {
	            if( lcm % n1 == 0 && lcm % n2 == 0 )
	            {
	                System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
	                break;
	            }
	            ++lcm;
	        }
		
		
	}

}
