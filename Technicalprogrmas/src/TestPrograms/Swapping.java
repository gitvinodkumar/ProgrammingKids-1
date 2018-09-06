package TestPrograms;

import java.util.Scanner;

public class Swapping {
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int temp=x+y;
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("after swapping:");
		System.out.println("x="+x+ " y ="+y);
		
	}

}
