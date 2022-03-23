package notes;

import java.util.Scanner;

public class Notes17_Return_Types {

	public static double[] numbers = {1.2, 2.7, 3.9};
	
	
	public static void main(String[] args) {
		
		problem01();
		System.out.println(problem02());
		System.out.println(return1());
		
		System.out.println(isPositive());
		
	}
	
	/*
	 * void method returns nothing
	 */
	public static void problem01() {
		
		
		
	}
	
	
	/*
	 * return an int
	 */
	public static int problem02() {
		
		int x = 2;

		return x;
		
	}
	
	
	/*
	 * returns index 1 of numbers
	 */
	public static double return1() {
		return numbers[1];
	}
	
	
	
	
	/*
	 * ask the user for a number
	 * returns true if positive
	 */
	public static boolean isPositive() {
		Scanner inKey = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int x = inKey.nextInt();
		
		if (x > 0) {
			return true;
		}
		
		return false;
		
	}
	
	
	
	
	
	
	
	
}
