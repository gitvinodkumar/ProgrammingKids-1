package com.nt.basedString;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HowFindMostOccuranceWordInGivenFile {

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader reader = new BufferedReader(new FileReader("src/com/nt/basedString/abc.txt"));
		
		String[] s=reader.readLine().split(" ");
		
		for(int i=0;i<=s.length-1;i++){
			
			 System.out.println(s[i]);
			
		}
		
		

	}

}
