
import java.io.*;
import java.util.*;
public class CandidateCode {
    public static void main(String args[] ) throws Exception {
      int count=0;
      int count1=0;
      int count2=0;
    	//Write code here
    	//intput 
    	int []marks={10,10,3,8,23,98,34,75,23,87,56,78};
    	int a=marks[0];
    	char c=29;
    	int b=c;
    	System.out.println(b);
    	System.out.println(a);
    	for(int j=0;j<marks.length;j++){
    	    
    	      if(marks[j]>70){
    	          count++;
    	      }else if(marks[j]>40&&marks[j]<75){
    	          count1++;
    	      }else if(marks[j]<40&&marks[j]>=10){
    	          count2++;
    	      }
    	}
    	System.out.println(count);
    	System.out.println(count1);
    	System.out.println(count2);
    }
}