package labs;

import java.util.Arrays;

public class Lab01 {

	public static int[] nums;
	
	
	public static void problem01() {
		
		
		
	}


	public static int[] problem02() {
		
		
		
		return null;
	}


	public static int problem03() {
		
		
		
		return 0;
	}


	public static int problem04() {
		
		
		
		return 0;
	}


	public static int problem05() {
		
		
		
		return 0;
	}


	public static boolean problem06() {
		
		
		
		return false;
	}


	public static int problem07() {
		
		
		
		return -1;
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
