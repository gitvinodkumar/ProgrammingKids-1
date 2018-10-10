package com.nt.patterns;

public class FivePattern3 {

	public static void main(String[] args) {
		
		
		for(int k=0;k<=10;k++){
			
			
			   if(k==0||k==5||k==10){
				   for(int i=1;i<=5;i++){
					   if(i==1||i==5)
						   System.out.print("  ");
					   else
						   System.out.print(" *");
				   }
			   }else{
				   for(int i=1;i<=5;i++){
					   if(i==1||i==5)
						   System.out.print(" *");
					   else
						   System.out.print("  ");
				   }
			   }
			System.out.println();
			
			
			
			
			
		}
		

		

	}

}
