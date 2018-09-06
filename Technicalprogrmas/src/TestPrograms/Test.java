package TestPrograms;

public class Test {
	
	public void m1(String s){
		
		int check=4;
		
		if(check==s.length()){
			System.out.println(s.charAt(check)+",");
		}
		else{
			System.out.println(",");
		}
	}
	public static void main(String[] args) {
		Test t=new Test();
		t.m1("four");
	}

}
