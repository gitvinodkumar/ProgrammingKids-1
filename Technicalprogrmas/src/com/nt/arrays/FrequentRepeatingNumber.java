package com.nt.arrays;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class FrequentRepeatingNumber {
	
	public static void main(String[] args) {
		
		int arr[]={1,2,3,4,3,5,3};
		Map<Integer,Integer>map= new TreeMap<Integer,Integer>();
		int count=0;
		for(int i=1;i<arr.length;i++){
			
			if(map.containsKey(i)){
				map.put(arr[count++],map.get(i)+1);
				System.out.println("FrequentRepeatingNumber.main(-----)");
			}else{
				map.put(arr[count++],1);
			}
		}
		Set<Integer>set=map.keySet();
		System.out.println("FrequentRepeatingNumber.main()");
		//retirve the values
		for(Integer i:set){
			
			if(map.get(i)<2){
				System.out.println("frequent number is:"+map.get(i));
			}
			
		}
		
		
	}

}
