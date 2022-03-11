package notes;


/*
 * Notes printf() = print format
 * 
 * printf(<String>, args...)
 *    <String> = The string you want to print with specifier
 *    args = the variable(s) you want to print in the String
 *    
 * 
 * Specifier
 *    %[flags][width][.precision]conversion-character
 * 
 * 	  - Bracketed items are optional
 * 
 * Flags
 *    - : left-justify the variable (default is to right-justify)
 *    + : adds a plus (+) or minus (-) to the numerical value (all negatives get a minus)
 *    0 : forces all values to be zero-padded (add zeros to left of number) (default is blanks)
 *    , : adds commas to large numbers (numbers >= 1,000)
 *      : space will display a minus sign if negative or space if positive
 * 	
 * Width = Specifies how many characters to use.
 * 
 * .precesion = what to round to
 * 
 * 
 * Conversion Characters
 *    What kind of variable are you printing?
 *    d : decimal integer (int, long)
 *    f : floating-point number (float, double)
 *    c : char – Capital C will uppercase the letter
 *    s : string – Capital S will uppercase all letters in the string
 *    h : hashcode – prints the memory reference for the variable
 *    n : newline – printf() specific newline character- use %n instead of \n
 *    %% : Use this to print a percent (or \% works as well). Otherwise it expects a variable.
 * 
 * 
 * 
 */


public class Notes05_printf {

	public static void main(String[] args) {
		
		String first = "Fred", last = "Jones";
		int x = 5, y = 15, z = 123345678;
		double a = 10.5, b = 2.57392857292, c = 2435.95709234;
		
		System.out.printf("%s %s is %d years old.\n", first, last, y + x - 2 * y + 3);
		System.out.printf("%s %s is %d years old.%n", first, last, y);
		
		
		//Add commas to large numbers
		System.out.printf("%,d\n", z);  	//add commas to int
		System.out.printf("%,f\n", c);  	//add commas to double
		System.out.printf("words %,.2f words\n\n", c);  	//add commas and round to 100ths 
		
		
		//width precision
		System.out.printf("%-10s %-10.2f %-10.3f\n", first, b, c);
		System.out.printf("%-10.2f %-10.3f %-10s\n", b, c, first);
		System.out.printf("%-10.3f %-10s %-10.2f\n", c, first, b);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
