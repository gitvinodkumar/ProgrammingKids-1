package com.nt;
import java.util.Scanner;
public class BinarytoOcatl {
	
	
	
	
	                 Scanner scan;
		int num;
		void m1(){
	            System.out.println("Binary to Octal");
		    scan = new Scanner(System.in);
	 	    System.out.println("\nEnter the number :");
		    num = Integer.parseInt(scan.nextLine(), 2);
		    System.out.println(num);
		}
		void m2() {
		        String octal = Integer.toOctalString(num);
		       System.out.println("Octal Value is : " + octal);
		}
	 
	
	  public static void main(String[] d){
		  BinarytoOcatl obj = new BinarytoOcatl();
		  int num=10;
		  String ocatl=Integer.toOctalString(num);
		  System.out.println(ocatl);
	        obj.m1();
	        obj.m2();
	   }
	}


