public class Pattern2{
  public static void main(String[] args){
    
    // Pattern-2
		/*
		   		***** 
		   		* 	*
		   		* 	*
		   		***** 
		
		 */
		
		int rows = 4;
		int cols = 5;
		
		for(int i = 1; i<= rows; i++) {
			
			for(int j = 1; j<= cols; j++) {
				// cell -> (i, j)
				if(i == 1 || j == 1 || i == rows || j == cols) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
    
    
    
  }
}
