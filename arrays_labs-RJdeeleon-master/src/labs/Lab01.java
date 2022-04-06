package labs;

import java.util.Arrays;
import java.util.Scanner;

public class Lab01 {

	public static int[] nums;
	
	
	public static void problem01() {
		String[] word = new String[8];
	}


	public static int[] problem02() {
		int[] num = new int[5];
		int[] numbers = {2,4,5,8,16,2,-3,5,-9,0,9,6};
		
		return numbers;
	}


	public static int problem03() {
		return nums[3];
	}


	public static int problem04() {
		 Scanner inKey = new Scanner(System.in);
         System.out.println("Enter an integer");
         int num = inKey.nextInt();
         
         if (num < 0 || num >= nums.length)
         {
         return -50;
         }
         else {
                 return nums[num];
         }
         
	}


	public static int problem05() {
		return nums[nums.length-1];
	}


	public static boolean problem06() {
		boolean f = false; 
		for (int i = 0; i < nums.length; i++)
		{
			if (nums[i] > 10)
			{
				f = true;
			}
		}
		return f;
	}


public static int problem07() {
		
		int negNum = 0;
		for (int i = 0; i < nums.length; i++ ) {
			if (nums[i] < 0)
				negNum++;
	}
		return negNum;
	}

	public static int problem08() {
		
		
		
		return -50;
	}
	
	
	
	
	//DO NOT mess with this method!!
	public static void main(String[] args) {
		
		populateNums();
		
		//#1
		problem01();
		
		//#2
		//This will print out the return in a default format
		System.out.println(Arrays.toString(problem02()));
		
		//#3
		System.out.println("Index #3 = " + problem03());
		
		//#4
		System.out.println("That index = " + problem04());
		
		//#5
		System.out.println("The last value = " + problem05());
		
		//#6
		if (problem06()) {
			System.out.println("There are numbers larger than 10.");
		}
		else {
			System.out.println("There are not numbers larger than 10.");
		}
		
		//#7
		System.out.println("Number of negatives = " + problem07());
		
		//#8
		System.out.println("Min = " + problem08());
		
		
	}
	
	//do not change this
	//it populates nums to a random size with random values
	public static void populateNums() {
		
		nums = new int[(int) (Math.random() * 10 + 5)];
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 23 - 10);
		}
		
		
	}
	
	
	
}
