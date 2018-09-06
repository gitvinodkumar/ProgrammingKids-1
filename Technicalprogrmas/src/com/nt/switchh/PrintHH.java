package com.nt.switchh;

public class PrintHH {
	
	
	public static void main(String[] args) {
		
		for(int i=1;i<=9;i++){
			
			if(i==5){
				
				for(int j=1;j<=5;j++){
					
					if(j==1||j==5){
					 System.out.print(" ");
					}else{
						System.out.print("*");
					}
					System.out.println();
				}
				
			}else{
                 for(int j=1;j<=5;j++){
					
					if(j==1||j==5){
					 System.out.print("*");
					}else{
						System.out.print(" ");
					}
					System.out.println();
				}
			}
			
		}
		
	}

}
