package com.nt;

import java.util.Arrays;

public class HowToFindMissingNumber1 {
	//private synchronized int e;

	public static void main(String[] args) {
		
		/*//given arrays
		int arr[]={2,3,2};
		int a[]=new int[arr.length];
		//int b[]=new int[arr.length];
		int b=0;
		int count=0;
		for(int i=1;i<a.length;i++){
			
		   if(arr[count]==i){
			   a[count]=i;
		   }else{
			   b=i;
		   }
			
		}
		
	System.out.println("missing number="+b);
	int i = 1, j = 10; 
	do 
	{
	    if(i++ > --j)  Line 4 
	    {
	    	System.out.println("HowToFindMissingNumber1.main()");
	        continue; 
	    } 
	} while (i < 6); 
	System.out.println("i = " + i + "and j = " + j);  Line 9 
		
		
	Float f = new Float("12"); 
	switch (9) 
	{
	    case 12: System.out.println("Twelve"); 
	    case 0: System.out.println("Zero"); 
	    default: System.out.println("Default"); 
	}
	
	
	String s = "42";
    try 
    {
        s = s.concat(".5");   Line 8 
        double d = Double.parseDouble(s);
        s = Double.toString(d);
        int x = (int) Math.ceil(Double.valueOf(s).doubleValue());
        System.out.println(x);
    }
    catch (NumberFormatException e) 
    {
        System.out.println("bad number");
    }
		
		
		 assert false;
		
		*/
		
		// get a number in the first argument
       /* int number =0;
 
        assert number > 10; // stops if number > 10
 
        System.out.println("Pass");*/
		
		/*int x = 0;  
        assert (x > 0) ? "assertion failed" : "assertion passed" ; 
        System.out.println("finished");  
        */
		int i=1;int j=0;
		switch(i) 
        { 
		
        //case 0: j += 1; 
		//case 1:j=1;
           case 2: j += 6; 
            case 4: j += 1; 
            default: j += 2; 
            case 0: j += 1; 
           // case 1:j+=10;
        } 
        System.out.println("j = " + j); 
        
      /*  int x=20;
        String sup = (x < 15) ? "small" : (x < 22)? "tiny" : "huge";
        System.out.println(sup);
        
        int w = (int)888.8;
        byte x = (byte)1000L;
        long y = (byte)100;
        byte z = (byte)100L;
        
        try 
        {
            badMethod();  
            System.out.print("A"); 
        }  
        catch (Exception ex) 
        {
            System.out.print("B"); 
        }  
        finally 
        {
            System.out.print("C"); 
        }  
        System.out.print("D"); 
    }  
    public static void badMethod() {} 
    }

	*/
        
        String s = "foo"; 
        Object o = (Object)s; 
        if (s.equals(o)) 
        { 
            System.out.print("AAA"); 
        } 
        else 
        {
            System.out.print("BBB"); 
        } 
        if (o.equals(s)) 
        {
            System.out.print("CCC"); 
        } 
        else 
        {
            System.out.print("DDD"); 
        } 

	}
}


