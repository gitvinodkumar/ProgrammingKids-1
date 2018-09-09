package com.nt.movesZeros;

public class FindCorrectSqure {
	
	
	
	static void m1(int num){
		String con="";
		//convert int to value
		String no=String.valueOf(num);
		for(int i=0;i<no.length();i++){
			//find character
			char ch=no.charAt(i);
			String no1=String.valueOf(ch);
			int number=Integer.parseInt(no1);
			if(number%2==0){
			con+=no1;
				
			}
			con=con.trim();
			//convert con to ineteger
			int con1=Integer.parseInt(con);
			if(con1==num){
			     System.out.println("perfect numer"+con1);	
			}
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		
          //pass first value
		m1(4040);
		m1(5050);
	}

}
