
public class Pattern {
	
	public static void main(String[] args) {
		int count=2;
		
		for( int i=1;i<=3;i++){
			
			for(int k=0;k<=5-i;k++){
				
				System.out.print("  ");
			}
			for( int j=1;j<2*i;j++){
				
				System.out.print(" *");
			}
			System.out.println();
			
		}
		
		/*for(int i=2;i<=3;i++){
			
			for(int j=0;j<=6-count;j++){
				System.out.print("  ");
				
			}
			
			for(int j=1;j<2*count;j++){
				System.out.print(" *");
			}
			count--;
			System.out.println();
			
		}*/
		
	}

}
