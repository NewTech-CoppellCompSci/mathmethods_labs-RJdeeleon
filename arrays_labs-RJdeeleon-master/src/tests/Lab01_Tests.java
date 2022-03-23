package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import labs.Lab01;

class Lab01_Tests {

	public static InOutMimic inOut;
	
	@BeforeAll
	static void beforeAll() {
		inOut = new InOutMimic();
	}
	
	@Test
	@DisplayName("Test Problem #1")
	void test1() {
		
		System.out.println("No Tests for problem #1 or #2\n\n\n\n");
	
	}
	
	@Test
	@DisplayName("Test Problem #3")
	void test3() {
		String problemNumber = "problem03()";
		
		Lab01 lab = new Lab01();
		lab.populateNums();
		
		try {
			assertTrue(lab.nums[3] == lab.problem03());
			System.out.println("Test " + problemNumber + ": Passed all inputs\n\n\n\n");
		}
		catch (Error e) {
			System.out.println("Error " + problemNumber + ": "
					 + "\n   Expected return should be: " + lab.nums[3] 
					 + "\n   Your return: " + lab.problem03()
					 + "\n\n\n\n");
			fail();
		}
		
	}
	
	
	@Test
	@DisplayName("Test Problem #4")
	void test4() {
		String problemNumber = "problem04()";
		
		String[] inputs = {"3", "0", "10", "50"};
		int i = 0;
		
		Lab01 lab = new Lab01();
		lab.populateNums();
		int yourReturn = 0;
		
		try {
			
			for (; i < inputs.length; i++) {
				inOut.resetOutputStream();
				inOut.overridePrintStatements();
				inOut.provideInput(inputs[i]);
				yourReturn = lab.problem04();
				if (Integer.valueOf(inputs[i]) < lab.nums.length) {
					assertTrue(lab.nums[Integer.valueOf(inputs[i])] == yourReturn);
				}
				else {
					
					assertTrue(-50 == yourReturn);
				}
				
			}
			
			inOut.resetSystem();
			System.out.println("Test " + problemNumber + ": Passed all inputs\n\n\n\n");
		}
		catch (Error e) {
			inOut.resetSystem();
			System.out.println("Error " + problemNumber + ": "
					 + "\n   Input(s):  " + inputs[i] 
					 + "\n   Expected return should be: " + lab.nums[Integer.valueOf(inputs[i])] 
					 + "\n   Your return: " + yourReturn
					 + "\n   nums array: " + Arrays.toString(lab.nums)
					 + "\n\n\n\n");
			fail();
		}
		
		inOut.resetOutputStream();
		
	}
	
	
	
	@Test
	@DisplayName("Test Problem #5")
	void test5() {
		String  problemNumber = "problem05()";
		
		Lab01 lab = new Lab01();
		lab.populateNums();
		
		int yourReturn = 0;
		
		try {
			yourReturn = lab.problem05();
			assertTrue(lab.nums[lab.nums.length - 1] == yourReturn);
			System.out.println("Test " + problemNumber + ": Passed all inputs\n\n\n\n");
		}
		catch (Error e) {
			System.out.println("Error " + problemNumber + ": "
					 + "\n   Expected return should be: " + lab.nums[lab.nums.length - 1]
					 + "\n   Your return: " + yourReturn
					 + "\n   nums array: " + Arrays.toString(lab.nums)
					 + "\n\n\n\n");
			fail();
		}
		
	}
	
	

	@Test
	@DisplayName("Test Problem #6")
	void test6() {
		String problemNumber = "problem06()";
		
		Lab01 lab = new Lab01();
		lab.populateNums();
		
		boolean yourReturn = true;
		boolean expectedReturn = false;
		
		try {
			
			for (int j = 0; j < 50; j++) {
				lab = new Lab01();
				lab.populateNums();
				yourReturn = true;
				expectedReturn = false;
				yourReturn = lab.problem06();
				for (int num : lab.nums) if (num > 10) expectedReturn = true;
				assertTrue(expectedReturn == yourReturn);
			}
			
			System.out.println("Test " + problemNumber + ": Passed all inputs\n\n\n\n");
		}
		catch (Error e) {
			System.out.println("Error " + problemNumber + ": "
					 + "\n   Expected return should be: " + expectedReturn
					 + "\n   Your return: " + yourReturn
					 + "\n   nums array: " + Arrays.toString(lab.nums)
					 + "\n\n\n\n");
			fail();
		}
		
	}
	
	
	@Test
	@DisplayName("Test Problem #7")
	void test7() {
		String problemNumber = "problem07()";
		
		Lab01 lab = new Lab01();
		lab.populateNums();
		
		int yourReturn = -1;
		int expectedReturn = -2;
		
		try {
			
			for (int j = 0; j < 50; j++) {
				lab = new Lab01();
				lab.populateNums();
				yourReturn = -1;
				expectedReturn = 0;
				yourReturn = lab.problem07();
				for (int num : lab.nums) if(num < 0) expectedReturn++;
				assertTrue(expectedReturn == yourReturn);
			}
			
			System.out.println("Test " + problemNumber + ": Passed all inputs\n\n\n\n");
		}
		catch (Error e) {
			System.out.println("Error " + problemNumber + ": "
					 + "\n   Expected return should be: " + expectedReturn
					 + "\n   Your return: " + yourReturn
					 + "\n   nums array: " + Arrays.toString(lab.nums)
					 + "\n\n\n\n");
			fail();
		}
		
	}
	
	
	
	@Test
	@DisplayName("Test Problem #8")
	void test8() {
		String problemNumber = "problem08()";
		
		Lab01 lab = new Lab01();
		lab.populateNums();
		
		int yourReturn = 50;
		int expectedReturn = 60;
		
		try {
			
			for (int j = 0; j < 50; j++) {
				lab = new Lab01();
				lab.populateNums();
				yourReturn = 50;
				expectedReturn = 60;
				yourReturn = lab.problem08();
				for (int num : lab.nums) expectedReturn = Math.min(num, expectedReturn);
				assertTrue(expectedReturn == yourReturn);
			}
			
			System.out.println("Test " + problemNumber + ": Passed all inputs\n\n\n\n");
		}
		catch (Error e) {
			System.out.println("Error " + problemNumber + ": "
					 + "\n   Expected return should be: " + expectedReturn
					 + "\n   Your return: " + yourReturn
					 + "\n   nums array: " + Arrays.toString(lab.nums)
					 + "\n\n\n\n");
			fail();
		}
		
	}
	
	
	
	
}
