public class AdvancedPattern5{
  public static void main(String[] args){
    
    
    
    		// Advanced-Pattern-5
		
		/* 
		    
		    
		         *
		        * * 
		       * * *
		      * * * *
		      * * * *
		       * * *
		        * *
		         *
		  
		  
		 */	
		int rows = 4;
		
		for(int i = 1; i<= rows; i++) {
			// Upper Half
			// spaces = rows - i
			for(int j = 1; j<= rows - i; j++) {
				System.out.print(" ");
			}
			
			for(int j = 1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
			}
			
		// Lower Half
		for(int i = rows; i>=1; i--) {
			// spaces = rows - i
			for(int j = 1; j<= rows - i; j++) {
				System.out.print(" ");
			}
			
			for(int j = 1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
			}
    
    
  }
}
