package notes;

/*
 * String and Concatenation
 * 
 * Topics
 *   - String Variables
 *   - String Literals
 *   - Concatenation = shmooshing string together
 * 
 * 
 */

public class Notes02_Strings_Concatenation {

	
	//main method, where the program starts
	public static void main(String[] args) {
		
		/*
		 * Variable = storage spot for info
		 * 
		 * Creating Variables
		 * 	 - Declare it
		 *         State the type and name
		 *   - Initialize it
		 *         Give it a starting value
		 * 
		 */
		
		//declare String variable
		String letters;
		//initialize letters
		letters = "abcd...";
		
		//declare and initialize in 1 line
		String letters2 = "ABCD...";
		
		/*
		 * = is a command!
		 * is says, take the right and store it in the left 
		 * 
		 */
		
		System.out.println(letters);
		System.out.println(letters2);
		
		letters2 = "OH MY... I'm stuck in the computer!!!";
		System.out.println(letters2);
		
		letters2 = letters;
		System.out.println(letters2);
		
		
		
		/*
		 * Concatenation
		 * 
		 * Basically, the act of smooshing (technical term) 2
		 *   Strings together.
		 *   
		 * use a + 
		 */
		
		String word1 = "Oopse";
		String word2 = " I did it again...";
		System.out.println(word1 + word2);
		
		/*
		 * Now with a String literal
		 * 
		 * String Literal = the actual characters between the ""
		 *   It is LITERALLY the letters
		 */
		
		String word3 = "mouse";
		System.out.println("If you give a " + word3 + " a cookie...");
		
		String number = "5";
		System.out.println(number + number);
		
		
		int number2 = 5;
		System.out.println(number2 + number2);
		
		
		
		
		
	}
	
	
	
	
	
}
