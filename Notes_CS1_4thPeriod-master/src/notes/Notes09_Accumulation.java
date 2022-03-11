package notes;

import java.util.Scanner;

/*
 * Accumulation: collecting data using a loop
 * This can include totals/summation, counter or
 * other data collection
 */

public class Notes09_Accumulation {

	public static void main(String[] args) {
		
		//Add all the numbers from 1 to 10
		int num = 1;
		int sum = 0;
		int count = 0; //to count the number of loops
		
		while (num <= 10) {
			
			sum += num;
			num++;
			count++;
		}
		System.out.println("The sum of all numbers from 1-10 is " + sum);
		System.out.println("It looped "+ count + " times.");
		
		
		
		//add only the even numbers
		int num1 = 1;
		int sum1 = 0;
		int count1 = 0; //to count the number of even numbers
		
		while (num1 <= 10) {
			
			if (num1 % 2 == 0) { //check if it's divisible by 2
				sum1 += num1;
				count1++;
			}
			num1++;
			
		}
		System.out.println("The sum of all even numbers from 1-10 is " + sum1);
		System.out.println("There were "+ count1 + " even numbers.");
		
		
		
		
		
		
		
		//add 5 user inputs together
		
		Scanner inKey = new Scanner(System.in); //create keyboard scanner
		int count3 = 0;
		int sum3 = 0;
		
		while (count3 < 5) {
			
			System.out.print("Enter an integer: ");
			sum3 += inKey.nextInt();
			
			count3++;
		}
		System.out.println("Your Total = " + sum3);
		
		
		
		
		
		/*
		 * How to calculate a max or a min
		 * Basically, figure out which number is bigger
		 * 
		 * Math.max(<input>, <input>)
		 * Math.min(<input>, <input>)
		 */
		
		System.out.print("Enter an integer: ");
		int input1 = inKey.nextInt();
		System.out.print("Enter an integer: ");
		int input2 = inKey.nextInt();
		
		int max = Math.max(input1, input2);
		int min = Math.min(input1, input2);
		
		System.out.println("Max = " + max);
		System.out.println("Min = " + min);
		
		//what if you have more than 2 numbers?
		//nest them
		System.out.print("Enter an integer: ");
		int input3 = inKey.nextInt();
		max = Math.max(input1, Math.max(input2, input3));
		System.out.println("Overall Max = " + max);
		
	}
	
	
}
