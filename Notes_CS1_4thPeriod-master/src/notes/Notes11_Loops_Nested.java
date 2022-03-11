package notes;

/*
 * Nested Loops
 * 
 * basically, 2+ loops inside each other.
 * 
 */

public class Notes11_Loops_Nested {

	public static void main(String[] args) {
		
		/*
		 * 2 counting variables 
		 * 2 conditions
		 */
		
		int x = 0, y = 0;
		
		while (x < 5) {
			
			y = 0;
			
			//inside loop finishes for EACH outside loop
			while (y < 5) {
				y++;
				System.out.println("   y = " + y);
				
			}
			x++;
			System.out.println("x = " + x);
			
		}
		
		
		y++;
		
		System.out.println("\n\n");
		
		
		/*
		 * Rows and Columns
		 * 
		 * Row = outside loop
		 * Columns = inside loop 
		 */
		
		int r = 0, c = 0;
		
		while (r < 3) {
			c = 0;
					
			while (c < 5) {
				System.out.print(c + " ");
				c++;
			}
			
			System.out.println();
			r++;
		}
		
		System.out.println("\n\n");
		
		r = 0; c = 0;
		//print coordinates
		while (r < 3) {
			c = 0;
					
			while (c < 5) {
				System.out.print("(" + r + ", " + c + ") ");
				c++;
			}
			
			System.out.println();
			r++;
		}
		
		
		
		System.out.println("\n\n");
		
		
		/*
		 * Print multiplication tables up to 10
		 */
		r = 0; c = 0;
		//print coordinates
		while (r < 11) {
			c = 0;
					
			while (c < 11) {
				System.out.printf("%6d", r * c);
				c++;
			}
			
			System.out.println();
			r++;
		}
		
		
		
		System.out.println("\n\n");
		
		
		
		
		/*
		 * Print multiplication tables up to 10
		 * 
		 * Add Headders
		 */
		r = 0; c = 0;
		//print coordinates
		
		//add top headder
		System.out.print("        ");
		while (c < 11) {
			System.out.printf("%6d", c);
			c++;
		}
		System.out.println("\n----------------------------------------------------------------------------------------------------------");
		
		while (r < 11) {
			c = 0;
			
			System.out.printf("%6d |", r);  //adds left header
			
			while (c < 11) {
				System.out.printf("%6d", r * c);
				c++;
			}
			
			System.out.println();
			r++;
		}
		
		
		
		System.out.println("\n\n");
		
		
		/*
		 * print this
		 *    *
		 *   **
		 *  ***
		 * ****
		 * 
		 */
		
		r = 0; 
		int space = 0, stars = 0;
		//print coordinates
		while (r < 4) {
			
			space = 0; 
			stars = 0;
			
			//print spaces
			while (space < 4 - r - 1) {
				System.out.print(" ");
				space++;
			}
			
			
			//print stars
			while (stars <= r) {
				System.out.print("*");
				stars++;
			}
			
			r++;
			System.out.println();
			
		}
		
		
		
	}
	
	
	
	
	
	
}
