import java.util.HashSet;
import java.util.Set;

public class Example {
	
	public static void main(String[] args) {
		Set<Integer> i=new HashSet<Integer>();
		Integer i1=45;
		Integer i2=47;
		
		i.add(i1);
		i.add(i2);
		i.add(i1);
		System.out.println(i.size());
		i.remove(i1);
		System.out.println(i.size());
		i2=17;
		System.out.println(i);
		i.remove(i2);
		System.out.println(i);
		System.out.println(i.size());
		for(Object obj:i){
			System.out.println(obj);
		}
		

}
}
