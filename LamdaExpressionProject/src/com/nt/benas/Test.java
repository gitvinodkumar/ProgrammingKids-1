package com.nt.benas;

public class Test {

	public static void main(String[] params) {
		
		Pulsor pulsor=new Pulsor();
		
		//System.out.println(pulsor.x);
		/*float f=1/3;
		 int i=1/3;*/
		 //float f=1.01;
		 double d=999d;
		 
		/* System.out.println(f+"    "+i);*/
		 
		 
		 /* System.out.println(1+1);
		String s="on"+'one';
		 int i=2+'2';
		 
		  byte b=255;*/
		 System.out.println(params[0]);
		 
		 
		 boolean b1 = false;
		 if((b1 ==true) || place(true)){
		 System.out.println("Hello Crowle");
		 
		 Integer a=new Integer(99);
		     a=0;
		     System.out.println(a);
		     
		     Inc inc = new Inc();
		     int i =0;
		     inc.fermin(i);
		     i = ++i;
		     System.out.println("here value:"+i);
		     int c=10;
		     int f=0;
		     System.out.println("fffff:"+--f);
		     switch(c){
		     
		     
		     default:
		    	 System.out.println("no value given");
		    	 case 1:
		    	 System.out.println("one");
		    	 case 10:
		    	 System.out.println("ten");
		    	 case 5:
		    	 System.out.println("five");
		     
		     
		     }
		    
		 try{
			 Thread.sleep(1000);
		} catch(Exception e){
			System.out.println("kkkk");
		}
		 }
		 }
		 public static boolean place(boolean location){
		 if(location==true){
		 System.out.println("Borcetshire");
		 }
		 System.out.println("Powick");
		 return true;
		 }      

		 

}


