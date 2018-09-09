package com.nt.movesZeros;

public class PyramidStructure {
	
	
	public static void  m1(int num){
		
		for(int i=1;i<=num;i++){
			if(i==1){
				System.out.println(i);
			}
			 if(i==2||i==3){
				System.out.print(i);
				System.out.print(" " );
				if(i==3)
					System.out.println();
				
			}
			
			 if(i==4||i==5||i==6){
				System.out.print(i);
				System.out.print(" ");
				if(i==6)
					System.out.println();
			}
			 if(i==7||i==8||i==9||i==10){
				System.out.print(i);
				System.out.print(" ");
				if(i==10)
					System.out.println();
			}
			 if(i==11||i==12||i==13){
				 System.out.print(i);
				 System.out.print(" ");
				 if(i==13)
					 System.out.println("...");
			 }
			
		}
	}

	public static void main(String[] args) {
		m1(13);

	}

}
