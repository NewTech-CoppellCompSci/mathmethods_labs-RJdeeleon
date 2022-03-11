package notes;

import java.util.Scanner;


/*
 * Comments
 * 
 * Comments are parts of the code NOT read by the compiler
 * 
 * Why
 *    - So we remember what we did
 *    - So others know what you intended to do
 *    - This is All or at least the majority of your Written Communication grade
 * 
 * 
 * 
 * Block Comments
 *    Good when something needs a longer explanation or intro
 * 
 * 
 */

public class Notes06_Comments {

	public static void main(String[] args) {
		
		
		// This is an inline comment
		// everything after the // is commented out
		
		
		/*  <=Starts Here
		   This is a Block Comment
		 
		 Ends Here ==>  */
		
		
		
		//comment your variables
		int age = 0;  //stores user's age
		double height = 0;  //stores user's height
		
		
		//store all user inputs
		int input1 = 0;
		int input2 = 0;
		int input3 = 0;
		int input4 = 0;
		int input5 = 0;
		
		
		
		Scanner inKey = new Scanner(System.in);  //Scans from keyboard
		
		//Scan user's age
		System.out.print("How old are you? ");
		int ageUser = inKey.nextInt();
		
		
		
		
	}
	
	
	
	
}
