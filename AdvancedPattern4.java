public class AdvancedPattern4{
  public static void main(String[] args){
  
    
    		// Advanced-Pattern-3 -> Palindromic Pyramid
		
		/* 
		  
		        1 
		      2 1 2
		    3 2 1 2 3 
		  4 3 2 1 2 3 4
		5 4 3 2 1 2 3 4 5 
		   
		 
		 */
		
		int rows = 5;
		
		// Outer Loop
		for(int i = 1; i<= rows; i++) {
			// For Spaces 
			for(int j = 1; j<= rows - i; j++) {
				System.out.print(" ");
			}
			
			
			// 1st half Numbers
			for(int j = i; j>= 1; j--) {
				System.out.print(j);
			}
			
			// 2nd half Numbers
			for(int j = 2; j<= i; j++) {
				System.out.print(j);
			}
			System.out.println();
			
		}
    
    
    
  }
}
