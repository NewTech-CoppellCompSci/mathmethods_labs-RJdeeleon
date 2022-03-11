package notes;

import java.util.Scanner;

/*
 * Sentinel Controlled are loops that wait for
 * and event to stop
 */

public class Notes10_Loops_SentinelControlled {

	public static void main(String[] args) {
		
		Scanner inKey = new Scanner(System.in);
		
		/*
		 * You need some type of boolean to control
		 * the loop
		 */
		
		/*
		 * Loop until user enters 10
		 */
		
		boolean isTen = false;
		int input = 0;
		int total = 0; //to sum up all inputs
		
		while(!isTen) {  //continue if isTen is false
			
			System.out.print("Enter and Number: ");
			input = inKey.nextInt();
			
			total += input;
			
			if (input == 10) {
				isTen = true;
			}
			
		}
		System.out.println("Input added to " + total);
		System.out.println("Loop is stopped\n");
		
		
		
		
		
		/*
		 * Stop when random number is 15
		 * 
		 * random numbers from 1 to 20
		 */
		
		
		boolean is15 = false;
		int randomNum = 0;
		int count = 0;
		while (!is15) {
			
			/*
			 * span = 20
			 * min = 1
			 * (int) turns it into an integer
			 */
			randomNum = (int) (Math.random() * 20 + 1);
			
			System.out.println(randomNum);
			count++;
			
			if (randomNum == 15) {
				is15 =  true;
			}
			
		}
		
		System.out.println("Number of Randoms: " + count);
		
		
		
		
		
		
		
		
		
	}
	
	
}
