

package com.nt.switchh;

import java.util.Arrays;

public class MovesZeros {
	
	
	public static void main(String[] args) {
		int i[]={1,2,3,0,5,0};
		
		int count=0;
		
		for(int j=0;j<i.length;j++){
			
			if(i[j]!=0){
				i[count]=i[j];
				count++;
			}
		}
		System.out.println(Arrays.toString(i));
		System.out.println(count);
		while(count<i.length&&count!=-1){
			
			  i[count]=0;
			  count++;
		}
		System.out.println(Arrays.toString(i));
		
	}

}
