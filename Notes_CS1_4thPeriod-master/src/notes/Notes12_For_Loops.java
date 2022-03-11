package notes;

import java.util.Scanner;

/*
 * For Loops
 * 
 * A more condensed loop
 * 
 * 3 sections
 * 
 * for (<initial>; <condition>; <end / increment>){
 * 		code block
 * }
 * 
 * 
 * Why a For Loop
 * - When I know how many times it loops
 * 
 * 
 * 
 * Why a While Loop
 * - When waiting for an event to occur
 * 
 * 
 * 
 */

public class Notes12_For_Loops {

	public static void main(String[] args) {

		// Print 1 to 9

		for (int i = 1; i < 10; i++) {

			System.out.print(i + " ");
		}

		System.out.println("\nDone\n\n");

		
		
		
		// Print 20 to 0 inclusive.  Count by 2's

		for (int i = 20; i >= 0; i-=2) {

			System.out.print(i + " ");
		}

		System.out.println("\nDone\n\n");

		
		
		
		
		/*
		 * Prime checker
		 * 
		 * What is Prime
		 *   a whole number with exactly 2 distince factors
		 *   1 and itself
		 * 
		 */
		
		
		Scanner inKey = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int input = inKey.nextInt();
		
		boolean isPrime = true;
		
		if (input <= 1) {
			isPrime = false;
		}
		
		//use for loop to divide it by EVERYTHING less that itself
		for (int i = 2; i <= input / 2; i++) {
			
			//check if input is divisible by i
			if (input % i == 0) {
				isPrime = false;
				break;
			}
			
		}
		
		//print results
		if(isPrime) {
			System.out.println(input + " is prime");
		}else {
			System.out.println(input + " is not prime");
		}
		
		
		
		//nested for loops
		
		
	}

}
