public class Pattern4{
  public static void main(String[] args){
    
      
    
      // Pattern-4
		/* 
		   		* * * * 
		   		* * * 
		   		* * 
		   		* 
		 */
		
		int rows = 4; 
		
		for(int i = 1; i<=rows; i++) {
			for(int j = i; j<=rows; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		   
    
   }
}
