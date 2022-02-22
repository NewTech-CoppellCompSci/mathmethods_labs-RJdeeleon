package labs;

import java.util.Scanner;

public class Lab01 {

	public static void main(String[] args) {
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		
		Scanner inKey = new Scanner(System.in);
		System.out.println("Enter a Positive Integer");
		int input1 = inKey.nextInt();
		System.out.println("Enter another Positive Integer");
		int input2 = inKey.nextInt();
		
		double power = Math.pow(input1, input2);
		
		System.out.println(input1 + "^" + input2 + "=" + power);
	}
	
	
	
	
	public static void problem02() {
		
		Scanner inKey = new Scanner(System.in);
		System.out.println("Enter a possitive integer: ");
		int input1 = inKey.nextInt();
		double root = Math.sqrt(input1);
		
		System.out.println("The square root of " + input1 + " is " + root );
		
	}

	
	

	public static void problem03() {
		
		Scanner inKey = new Scanner(System.in);
		System.out.println("Choose 2 positive integers");
		double input1 =  inKey.nextDouble();
		double input2 =  inKey.nextDouble();
		double input1bac =  input1;
		double input2bac =  input2;
		input1 = input1 * input1;
		input2 = input2 * input2;
		double total = input1 + input2;
		
		total =	Math.sqrt(total);
		System.out.println("Length of side A: " + input1bac);
		System.out.println("Length of side B: " + input2bac);
		System.out.println("Hypotenuse: " + total);

	}


	
	
	public static void problem04() {
		
	
		
		Scanner inKey = new Scanner(System.in);
		System.out.println("Enter a Integer (Enter 0 to End.)");
		int loop = 1; 
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		while (loop > 0) { 
			
			int input = inKey.nextInt();
			System.out.println("You entered: " + input);
			
			max = Math.max(max, input);
			min = Math.min(min, input);
				
			if (input == 0) {
				loop = 0;
			}

		}
	
		 System.out.println("Max = " + max);
		 System.out.println("Min = " + min);

}
}