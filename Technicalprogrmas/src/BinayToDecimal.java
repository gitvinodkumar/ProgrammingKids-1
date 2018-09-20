import java.util.Scanner;

public class BinayToDecimal {

	public static void main(String[] args) {
		
		//count the value
		int count=0;
		System.out.println("enter the binary value");
		Scanner sc=new Scanner(System.in);
		int binary=sc.nextInt();
		int result=0;
		//convert binary to decimal
		while(binary!=0){
			int b=binary%10;
			result+=(b)*(Math.pow(2,count++));
			
			binary=binary/10;
			
			
			
		}
		System.out.println("binary to decimal conversion="+result);
		
		

	}

}
