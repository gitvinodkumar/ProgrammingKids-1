package TestPrograms;

import java.util.Map;
import java.util.TreeMap;

public class PatternABBB {

	public static void main(String[] args) {
		
		
		Map<Integer,String>map=new TreeMap<Integer,String>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
		map.put(5, "E");
		
		for(int i=1;i<=5;i++){
			
			for(int j=1;j<=5;j++){
				System.out.print(map.get(i)+" ");
			}
			
			System.out.println();
		}

	}

}
