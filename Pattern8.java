public class Pattern8{
  public static void main(String[] args){
  
      // Pattern-7 -> Floyd's Triangle
		/* 
		  
		  1 
		  2 3
		  4 5 6 
		  7 8 9 10
		  11 12 13 14 15
		  
		 */
		
		int rows = 5;
		int count = 1;
		
		for(int i = 1; i<= rows; i++) {
			for(int j = 1; j<= i; j++) {
				System.out.print(count++ + " ");
			}
			System.out.println();
		}
    
    
  }  
}