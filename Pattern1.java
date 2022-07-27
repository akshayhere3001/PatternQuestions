public class Pattern1{
  public static void main(String[] args){
        
       // Pattern-1
		
		/*     * * * * *
		 	   * * * * *
		 	   * * * * *
		 	   * * * * * 
		 */
		int i, j;
	  	int rows = 4;
	  	int cols = 5;
		for(i = 1; i<=rows; i++) {
			for(j = 1; j<= cols; j++) {
				System.out.print(" * ");			
			}
			System.out.println();
		}
      
  }
}
