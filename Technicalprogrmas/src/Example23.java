
public class Example23 {
	
	
	
	
	public static int m1( final int x){
		
		if(x==8)
			System.out.println("hii heloooo");
		if(x<=10){
			return m1(x-1);
		}else{
			return m1(20);
		}
	}

	public static void main(String[] args) {
		//System.out.println(m1(9));
		
	}

}
