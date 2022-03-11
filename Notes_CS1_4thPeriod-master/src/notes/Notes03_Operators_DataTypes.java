package notes;

/*
 * Operators and Data Types
 * 
 * Data Types:  w3schools link:  https://www.w3schools.com/java/java_data_types.asp
 *    int = integers: about -2.14 billion to + 2.14 billion
 *    long = int: integer but WAY bigger range
 *    double = fractional numbers up to 15 digits
 *    
 *    String: Stores text 
 *    	Technically it's an object NOT a data type.
 *      That's why it's capitalized.
 *    
 *    
 *    
 * Operators
 *    + = adds
 *    - = subtracts
 *    * = multiplies
 *    / = divides
 *    % = Modulus: the remainder after division
 *    
 *    
 *    
 */

public class Notes03_Operators_DataTypes {

	public static void main(String[] args) {
		
		// declare and initialize an integer
		int num = 57;

		// declare and initialize a long
		// add an L to designate it as a long
		long num1 = 85000000000L;

		// declare and initialize a double
		double num2 = 5.7;

		System.out.println("DATA TYPES:");
		System.out.println(num);
		System.out.println(num1);
		System.out.println(num2);
		
		
		
		System.out.println("\n\nBASIC OPERATORS");
		int a = 5, b = 7, c = 33;
		double g = 3.5, h = 5.0;
		
		System.out.println(c / a);  //integer devision
		System.out.println(c / h);  //double division
		System.out.println(a / c);  //integer division
		
		System.out.println(c / a * b);  //same precedence goes left to right
		System.out.println(c / (a * b));
		
		
		double i = a + b / 2;
		System.out.println(i);
		i = a + b / 2.0;
		System.out.println(i);
	}
	
}
