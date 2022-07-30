public class AdvancedPattern {
	public static void main(String[] args) {
	
		// Pattern-1 -> Butterfly Patterm
		/*
		  *             * 
		  * *	      * * 
		  * * *     * * * 
		  * * * * * * * * 
		  * * * * * * * * 
		  * * *     * * *  			  
		  * *         * *
		  *             *
		 */
		
		
		int rows = 4;
		
		// Upper Half
		for(int i = 1; i<=rows; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
				// for spaces
				int spaces = 2 * (rows - i);
				for(int j = 1; j<spaces; j++) {
				System.out.print(" ");
			}
				// parallel part of Upper Half
				for(int j = 1; j<=i; j++) {
					System.out.print("*");
				}
				System.out.println();
		}
			// Lower Half 
		for(int i = rows; i>=1; i--) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
				// for spaces
				int spaces = 2 * (rows - i);
				for(int j = 1; j<spaces; j++) {
				System.out.print(" ");
			}
				// parallel part of Lower Half
				for(int j = 1; j<=i; j++) {
					System.out.print("*");
				}
				System.out.println();
		}	
		
		}	
	}

