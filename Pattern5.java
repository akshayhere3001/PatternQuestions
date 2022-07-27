public class Pattern5{
  public static void main(String[] args){
     
      // Pattern-5 
		/*			
		 		      * 
		  		  * * 
		  	  * * * 
		  	* * * *
		 */
		
		int rows = 4;
		
		for(int i = 1; i<= rows; i++) {
			
			// inner Loop for Spaces
			for(int j = 1; j<= rows - i; j++) {
				System.out.print(" ");
			}
			
			// 2nd Inner Loop for Stars
			for(int j = 1; j<=i; j++) {
				System.out.print("*" );
			}
			System.out.println();
		}
    
  }
}
