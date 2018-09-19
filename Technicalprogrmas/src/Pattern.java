
public class Pattern {
	
	public static void main(String[] args) {
		int count=1;
		
		for( int i=1;i<=3;i++){
			
			for(int k=0;k<=5-i;k++){
				
				System.out.print("  ");
			}
			for( int j=1;j<=count;j++){
				
				System.out.print(" *");
			}
			System.out.println();
			count=count+2;
			
		}
		count=3;
		for(int i=1;i<=3;i++){
			
			for(int j=0;j<5-i;j++){
				System.out.print("  ");
			}
			
			for(int j=count;j>=1;j--){
				System.out.print(" *");
			}
			System.out.println();
			count=count-2;
		}
		
	}

}
