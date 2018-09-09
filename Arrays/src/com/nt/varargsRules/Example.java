package com.nt.varargsRules;

import java.util.Arrays;

public class Example {

	/*void m1(int i...){
		
		this is in void only three dots in middle of the 
	}
	*/
	void m1(int... i){
		System.out.println(Arrays.toString(i));
	}
	void m2(int ...i){
		System.out.println(Arrays.toString(i));
	}
	
	/*void m3(int...a,int b){
		var args is a last parameter of the method
	}
	*/
	void m3(int[]...a){
		System.out.println(a);
	}
	/*void m4(int...[]a){
		this is in valid
	}*/
	/*void m4(int[]...[]a){
		//this is in valid
	}*/
	
	void m4(int[]a[]){
		
	}
void m5(int[]a){
		
	}
/*static void m6(int...a,int b,int c){
	//not possible lst par varga
}*/
/*void m6(int...a,String...s){
	
}*/


void m12(int a){
	System.out.println(a);
}
void m12(int...a){
	System.out.println(a);
}

void m13(int...a){
	System.out.println("Example.m13()=a");
}
void m13(long...l){
	System.out.println("Example.m13()=l");
}
void m13(float...f){
	System.out.println("Example.m13()=f");
}
void m45(int[]a){
	System.out.println();
}

	public static void main(String[] args) {
		
  Example e=new Example();
  e.m1(10,20,30);
  e.m2(30,40,50);
  e.m3(new int[]{3,4,5,6});
  e.m4(new int[2][1]);
  e.m1(3);e.m1(9,0);
  
  e.m13(new int[]{9});e.m13(5l);e.m13(50f);e.m13(1l,2f,3);
	}

}
