import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class AbCdPattern {
	
	
	
	public static void main(String[] args) {
		HashMap<String, Integer>map=new HashMap<String,Integer>();
		
		  map.put("a",1);
		  
		Set<String>set=map.keySet();
		Iterator<String>it=set.iterator();
		
		while(it.hasNext()){
			String name=it.next();
			map.put(name+name,map.get("a"));
		}
		System.out.println(map);
		
		
		
		
		
		
	}

}
