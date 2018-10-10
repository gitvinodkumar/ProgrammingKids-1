package com.nt.patterns;

public class NinePattern2 {

	public static void main(String[] args) {
		
		
		for(int k=0;k<=10;k++){
			
			
			   if(k==0||k==5){
				   for(int i=1;i<=5;i++){
					   if(i==1||i==5)
						   System.out.print("  ");
					   else
						   System.out.print(" *");
				   }
			   }else{
				   for(int i=1;i<=5;i++){
					   if(k==1||k==2||k==3||k==4||k==5){
					   if(i==1||i==5)
						   System.out.print(" *");
					   else
						   System.out.print("  ");
					   }
					   
					   if(k==6||k==7||k==8||k==9){
						   if(i==5)
							   System.out.print(" *");
						   else
							   System.out.print("  ");
					   }
				   }
			   }
			System.out.println();
			
			
			
			
			
		}
		

	}

}
