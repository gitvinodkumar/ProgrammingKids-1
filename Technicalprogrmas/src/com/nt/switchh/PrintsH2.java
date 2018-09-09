package com.nt.switchh;

public class PrintsH2 {
	
	
	public static void main(String[] args) {
		
		for(int i=0;i<=5;i++){
			
		    if(i==5){
		    	
		    	
		    	for(int j=0;j<=5;j++){
		    		if(j==0||j==5||j==1||j==2||j==4){
		    			System.out.print(" ");
		    		}else{
		    			System.out.print("*");
		    		}
		    	}
		    	System.out.println();
		    	
		    }else{
		    	for(int j=0;j<=5;j++){
		    		if(j==0||j==5)
		    			System.out.print("*");
		    		else
		    			System.out.print(" ");
		    	}
		    	System.out.println();
		    	
		    }
			
		}
		System.out.println(" ");
		System.out.print("");
		
		//for i letter
		for(int i=0;i<=5;i++){
			System.out.println("   *");
		}
		
	}
}

