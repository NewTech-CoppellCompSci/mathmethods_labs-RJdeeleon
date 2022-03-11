package notes;

/*
 * Basic While Loop Notes
 * 
 * while (condition){
 * 
 * 		This looped until condition is false
 * 
 * }
 * 
 * 
 * 
 */

public class Notes08_While_Loops {

	
	public static void main(String[] args) {
		
		
		//variable to check in your condition
		int x = 0;
		while (x < 10) {  //condition (boolean statement)
			//code block
			
			System.out.print(x + " ");
			
			//update my checked variable
			x++;
		}
		System.out.println("\nDone\n\n");  //for console spacing
		
		x = 0;
		
		while (x < 10) {  //condition (boolean statement)
			//code block
			
			System.out.print(x + " ");
			
			//update my checked variable
			x += 2;
		}
		System.out.println("\nDone\n\n");
	
		
		
		//make loop go down print 24 to 0
		int y = 24;
		while (y >= 0) {
			
			System.out.print(y + ":) ");
			y--;
		}
		
		
		System.out.println("\nDone\n\n");
		
		
		
		
		//print 0 to 10 with commas (3 different ways)
		x = 0;
		while (x < 10) {  //condition (boolean statement)
			//code block
			
			System.out.print(x + ", ");
			
			//update my checked variable
			x++;
		}
		System.out.print(x);
		System.out.println("\nDone\n\n");
		
		
		x = 0;
		System.out.print(x);
		while (x < 10) {  //condition (boolean statement)
			
			x++;
			System.out.print(", " + x);
		
			
		}
		System.out.println("\nDone\n\n");
		
		
		x = 0;
		int max = 10;
		while (x <= max) {  //condition (boolean statement)
			//code block
			if (x == max) {
				System.out.print(x);
			}
			else {
				System.out.print(x + ", ");
			}
			//update my checked variable
			x++;
		}
		
		System.out.println("\nDone\n\n");
		
		
		
	}
	
	
	
}
