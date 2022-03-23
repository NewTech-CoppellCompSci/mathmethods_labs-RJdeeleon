package notes;

import java.util.Arrays;

/*
 * Arrays
 * 
 * Basically a shelf of shoe boxes
 * 
 * Access them by their index
 * The first box is index 0
 * 
 */
public class Notes18_Arrays {

	public static void main(String[] args) {
		
		//declare an int array with 5 boxes
		//they automatically have 0s in them
		int[] num = new int[5];
		
		//String array with 9 elements
		//They are empty Strings ""
		String[] words = new String[9];
		
		
		//Not sure what went on here
		//y'all asked can we put a variable in the []
		int x = 7;
		String[] fart = new String[(int) Math.pow(x, 4)];
		System.out.println("fart length = " + fart.length);
		
		//an integer array with these elements
		//0, 1, 2, 3, 4, 5
		int[] num1 = {0, 1, 2, 3, 4, 5};
		String[] words1 = {"zero", "one", "two", "three" };
		
		
		//printing an array
		System.out.println(words1);
		//print element 0
		System.out.println(words1[0]);
		
		
		
		/*
		 * Printing all elements in order
		 * 
		 * 1)  for loop and print one at a time
		 * 
		 * 2)  Arrays.toString(<array>)
		 *     Requires an import
		 * 
		 * 
		 */
		System.out.println("Print elements in words1");
		for (int i = 0; i < words1.length; i++) {
			System.out.println(words1[i] + ".");
		}
		
		System.out.println("\nArrays.toString(<array>)");
		System.out.println(Arrays.toString(words1));
		
		
		
		/*
		 * Changing an element's value
		 * 
		 */
		//change element 2 to "1234"
		words1[2] = "1234";
		System.out.println("\n" + Arrays.toString(words1));
		
		//add "1234" to the end of element 3
		words1[3] += "1234";
		System.out.println("\n" + Arrays.toString(words1));
		System.out.println(words1[2]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
