public class AdvancedPattern3{
  public static void main(String[] args){
    
    		// Advanced-Pattern3 -> 
		/* 
		 	 
		 	 
		 	 		 1
		 	 		2 2
		 	 	   3 3 3
		 	 	  4 4 4 4 
		 	 	 5 5 5 5 5
		 	  		
		 */
		
		int rows = 5;
		
		for(int i = 1; i<=rows; i++) {
			// for spaces 
			for(int j = 1; j<= rows - i; j++) {
				System.out.print(" ");
			}
			// print row number, row number times
			for(int j = 1; j<=i; j++) {
				System.out.print(i + " ");
				
			}
			System.out.println();
		}
    
    
    
  }
}
