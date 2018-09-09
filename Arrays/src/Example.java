
public class Example {
	
	int x;
	int y;

	
	Example(int x,int y){
		this.x=x;
	}
	public static void main(String[] args) {
		
		int i[]={1,2,4};
		int j[]={3,5,9};
		int k[]={'a','b'};
		char[] ch={92,90};
		  
		int [][]t={{1,2,3,4}};
		//System.out.println(i[0]+j[0]);
		Example e[]={new Example(10,20),new Example(20,30),new Example(30,40)};
		e[0].x=10;
		e[1].y=5;
		  System.out.println(e[0].x);
		  System.out.println(e[1].x);
		  System.out.println(e[2].x);
		  System.out.println(k[0]+k[1]);
		  System.out.println(ch[0]);
		
		  

	}

}
