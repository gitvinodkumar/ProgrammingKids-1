package SampleExampleOfArray;

public class Bike {
	
	int x=10;
	int y=80;
	
	static void m1(Bike[]b){
		b[2].x=90;
	}
	static void m2(Object obj){
		
		if(obj instanceof Object){
			System.out.println("this is Object");
		}else{
			System.out.println("this is not obejct");
		}
	}
	
	//@SafeVarargs
	public static void main(String[] args) {
		
		Bike[] b=new Bike[3];
		b[0]=new Bike();
		b[1]=new Bike();
		b[2]=new Bike();
		m1(b);
		m2(null);
		
		System.out.println(b[0].x);
		System.out.println(b[1].x);
		System.out.println(b[2].x);
	}

}
