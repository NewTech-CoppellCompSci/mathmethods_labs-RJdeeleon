package notes;

/*
 * Notes: If Statements and Booleans
 * 
 * Sections
 * 
 * 
 */


public class Notes07_If_Statments_and_Booleans {
	
	public static void main(String[] args) {
		
		basicIfs();
		
		ifElseStatements();
		
		elseStatements();
		
		comparingStrings();
		
		booleanOperators();
		
//		booleanVariables();
//		
//		ifElseStrategy();
		
	}
	
	
	

	/*
	 * Basic if Statement
	 * 
	 * if ( boolean expression ) {
	 * 
	 *   //CODE BLOCK
	 *   
	 * }
	 * 
	 * if the expression is true, then  the code block will run
	 * 
	 * Operators
	 *   ==  
	 *   !=  
	 */
	public static void basicIfs() {
		int x = 4, y = 4, z = 15;
		String word = "Apples";
		
		System.out.println("Basic If Statements:");
		
		if (x == 4) {
			System.out.println("Hey x equals 4!");
		}
		
		
		if (x >= y) {
			System.out.println("X is greater or equal to y");
		}
		
	}
	
	
	
	
	/*
	 * If Else Statement
	 * 
	 * This is tied to the if and if-else statements above it.
	 * If all statements above it are FALSE, then it will try this expression
	 * 
	 * else if ( boolean expression ) {
	 * 
	 *   //CODE BLOCK
	 *   
	 * }
	 * 
	 */
	public static void ifElseStatements() {
		int x = 4, y = 9, z = 15;
		String word = "Apples";
		
		System.out.println("\n\n\n\nIf Else Statements:");
		
		
		if (x == y) {
			System.out.println("1");
		}
		else if (x < y) {
			System.out.println("2");
		}
		else if (x > y) {
			System.out.println("3");
		}
		else if (x == 4) {
			System.out.println("4");
		}
		else {
			System.out.println("5");
		}
		
		
		
		if (x == y) {
			System.out.println("1");
		}
		else if (x == 8) {
			System.out.println("2");
		}
		else if (x != 4) {
			System.out.println("3");
		}
		else if (x == z) {
			System.out.println("4");
		}
		else {
			System.out.println("5");
		}
		
	}
	
	
	
	
	
	/*
	 * Else Statement
	 * 
	 * Goes after
	 * 
	 * 
	 */
	public static void elseStatements() {
		int x = 4, y = 9, z = 15;
		String word = "Apples";
		
		System.out.println("\n\n\n\nElse Statements:");
		
		
	}
	
	
	
	/*
	 * Comparing Strings
	 * 
	 * .equals(<String>) = exactly the same
	 * .equalsIgnoreCase(<String>) = same except for capitalization
	 * 
	 * DO NOT USE ==  !!!!!
	 * 
	 */
	public static void comparingStrings() {
		int x = 4, y = 9, z = 15;
		String word = "Apples";
		
		System.out.println("\n\n\n\nComparing Strings:");
		
		if (word.equals("apples")) {
			System.out.println("Test #1");
		}
		
		if (word.equalsIgnoreCase("apples")) {
			System.out.println("Test #2");
		}
		
		if ("apples".equalsIgnoreCase(word)) {
			System.out.println("Test #3");
		}
		
		
	}
	
	
	
	/*
	 * Boolean Operators
	 * 
	 * !  = Not = it flips true and false
	 * && = And = are both sides true
	 * || = Or = is one or the other side true
	 * ^  = XOR
	 * 
	 * Precedence (order of operations)
	 *    1st - Normal PEMDAS
	 *    2nd - && operators
	 *    3rd - || operators
	 * 
	 */
	public static void booleanOperators() {
		int x = 4, y = 9, z = 15;
		String word = "Apples";
		
		System.out.println("\n\n\n\nBoolean Operators:");
		
		if (x == 4 && x > z) {
			System.out.println("1");
		}
		
		if (y != 9 && y == -5 || x == y || x == 4 || x > z) {
			System.out.println("2");
		}
		
		
		
		
		//is something between 2 numbers
		//is x between 0 and 10 inclusive (including 0 and 10)
		if (x >= 0 && x <= 10) {
			System.out.println("x is between 0 and 10 inclusive");
		}
		else {
			System.out.println("x is NOT between 0 and 10 inclusive");
		}
		
		
		//is something outside of 2 numbers
		//is z outside of 0 and 10 exclusive (not including 0 and 10)
		if (z < 0 || z > 10) {
			System.out.println("z is outside 0 and 10 exclusive");
		}
		else {
			System.out.println("z is NOT outside 0 and 10 exclusive");
		}
		
		
		
		
		//Check for divisibility
		//is 20 divisible by 5
		if (20 % 5 == 0) {
			System.out.println("20 is divisible by 5");
		}
		
		//is x even?
		if (x % 2 == 0) {
			System.out.println("x is even");
		}
		
		//is y odd?
		if (y % 2 == 1) {
			System.out.println("y is odd");
		}
		else {
			System.out.println("y is even");
		}
		
		
		
	}

	
	
	
	
	/*
	 * Boolean Variables
	 * 
	 * DO NOT NEED OPERATORS!!
	 *   != or ==
	 * They are inherently true or false. (In their core they are true or false)
	 * 
	 * 
	 */
	public static void booleanVariables() {
		
		boolean isTrue = true;
		boolean isFalse = false;
		boolean isRaining = false;
		
		System.out.println("\n\n\n\nBoolean Variables:");
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	/*
	 * If Else Strategy
	 * 
	 * Start with the EASIEST to check for
	 * End with the HARDEST to check for
	 * As you move down the statements,
	 *    you don't need to check the conditions above it.
	 *    You've already ruled them out. 
	 * 
	 * if      - Easiest to check
	 * else if
	 * else if
	 * else    - Hardest to check
	 * 
	 * 
	 */
	public static void ifElseStrategy() {
		
		System.out.println("\n\n\n\nIf Else Strategy:");
		
		/*
		 * Situation:
		 * Based on the temperature outside, you need to decide
		 * how warm you should dress today.
		 * 
		 * Build an if statement that would tell you what type
		 * of clothes to wear.
		 */
		
		
		int outsideTemp = 51;
		
		
		
	}
	
	
}
