package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import labs.Lab02;

class Tests_Lab02 {

	public static InOutMimic inOut;
	
	@BeforeAll
	static void beforeAll() {
		inOut = new InOutMimic();
	}
	
	@Test
	@DisplayName("Test Problem #1")
	void test1() {
		String problemNumber = "problem01()";
		String[] inputs = {"parade", "apple", "banana", "pie"};
		String[] expectedOutputs = {"There are 2 a's in the word parade",
									"There is 1 a's in the word apple",
									"There are 3 a's in the word banana",
									"There are 0 a's in the word pie"};
		int i = 0;
		
		try {
			for (; i < inputs.length; i++) {
				inOut.resetOutputStream();
				inOut.overridePrintStatements();
				inOut.provideInput(inputs[i]);
				Lab02.problem01();
				assertTrue(inOut.getOutputStream().contains(expectedOutputs[i]));
			}
			
			inOut.resetSystem();
			System.out.println("Test " + problemNumber + ": Passed all inputs\n\n\n\n");
			
		}
		catch (Error e) {
			inOut.resetSystem();
			System.out.println("Error " + problemNumber + ": "
					 + "\n   Input(s):  " + inputs[i]
					 + "\n   Expected output should contain: " + expectedOutputs[i] 
					 + "\n   Your output: \n" + inOut.getOutputStream()
					 + "\n\n\n\n");
			fail();
		}

		inOut.resetOutputStream();
	}
	
	@Test
	@DisplayName("Test Problem #2")
	void test2() {
		String problemNumber = "problem02()";
		String[] inputs = {"happy", "problem", "Mississippi"};
		String[] expectedOutputs = {"There is a double letter in the word happy",
									"There is not a double letter in the word problem",
									"There is a double letter in the word Mississippi"};
		int i = 0;
		
		try {
			for (; i < inputs.length; i++) {
				inOut.resetOutputStream();
				inOut.overridePrintStatements();
				inOut.provideInput(inputs[i]);
				Lab02.problem02();
				assertTrue(inOut.getOutputStream().contains(expectedOutputs[i]));
			}
			
			inOut.resetSystem();
			System.out.println("Test " + problemNumber + ": Passed all inputs\n\n\n\n");
			
		}
		catch (Error e) {
			inOut.resetSystem();
			System.out.println("Error " + problemNumber + ": "
					 + "\n   Input(s):  " + inputs[i]
					 + "\n   Expected output should contain: " + expectedOutputs[i] 
					 + "\n   Your output: \n" + inOut.getOutputStream()
					 + "\n\n\n\n");
			fail();
		}

		inOut.resetOutputStream();
	}
	
	@Test
	@DisplayName("Test Problem #3")
	void test3() {
		String problemNumber = "problem03()";
		String[] inputs = {"Salisbury steak is delicious!",
						   "Blueberry pie is my favorite."};
		String[] expectedOutputs = {"S@li$bury $t#@k i$ d#liciou$!",
									"Blu#b#rry pi# i$ my f@vorit#."};
		int i = 0;
		
		try {
			for (; i < inputs.length; i++) {
				inOut.resetOutputStream();
				inOut.overridePrintStatements();
				inOut.provideInput(inputs[i]);
				Lab02.problem03();
				assertTrue(inOut.getOutputStream().contains(expectedOutputs[i]));
			}
			
			inOut.resetSystem();
			System.out.println("Test " + problemNumber + ": Passed all inputs\n\n\n\n");
			
		}
		catch (Error e) {
			inOut.resetSystem();
			System.out.println("Error " + problemNumber + ": "
					 + "\n   Input(s):  " + inputs[i]
					 + "\n   Expected output should contain: " + expectedOutputs[i] 
					 + "\n   Your output: \n" + inOut.getOutputStream()
					 + "\n\n\n\n");
			fail();
		}

		inOut.resetOutputStream();
	}
	
	@Test
	@DisplayName("Test Problem #4")
	void test4() {
		String problemNumber = "problem04()";
		String[] inputs = {"creepers\ne", "mississippi\ni", "zipper\nz"};
		String[] expectedOutputs = {"\"e\" occurs at the following index(s): 2 3 5",
									"\"i\" occurs at the following index(s): 1 4 7 10",
									"\"z\" occurs at the following index(s): 0"};
		int i = 0;
		
		try {
			for (; i < inputs.length; i++) {
				inOut.resetOutputStream();
				inOut.overridePrintStatements();
				inOut.provideInput(inputs[i]);
				Lab02.problem04();
				assertTrue(inOut.getOutputStream().contains(expectedOutputs[i]));
			}
			
			inOut.resetSystem();
			System.out.println("Test " + problemNumber + ": Passed all inputs\n\n\n\n");
			
		}
		catch (Error e) {
			inOut.resetSystem();
			System.out.println("Error " + problemNumber + ": "
					 + "\n   Input(s):  " + inputs[i]
					 + "\n   Expected output should contain: " + expectedOutputs[i] 
					 + "\n   Your output: \n" + inOut.getOutputStream()
					 + "\n\n\n\n");
			fail();
		}

		inOut.resetOutputStream();
	}
	
	@Test
	@DisplayName("Test Problem #5")
	void test5() {
		String problemNumber = "problem05()";
		String[] inputs = {"jeremy\nsmith",
						   "Bob Belcher"};
		String[] expectedOutputs = {"Jeremy Smith\njeremY smitH\njErEmY sMiTh",
									"Bob Belcher\nboB belcheR\nbOb BeLcHeR"};
		int i = 0;
		
		try {
			for (; i < inputs.length; i++) {
				inOut.resetOutputStream();
				inOut.overridePrintStatements();
				inOut.provideInput(inputs[i]);
				Lab02.problem05();
				assertTrue(inOut.getOutputStream().contains(expectedOutputs[i]));
			}
			
			inOut.resetSystem();
			System.out.println("Test " + problemNumber + ": Passed all inputs\n\n\n\n");
			
		}
		catch (Error e) {
			inOut.resetSystem();
			System.out.println("Error " + problemNumber + ": "
					 + "\n   Input(s):  " + inputs[i]
					 + "\n   Expected output should contain: " + expectedOutputs[i] 
					 + "\n   Your output: \n" + inOut.getOutputStream()
					 + "\n\n\n\n");
			fail();
		}

		inOut.resetOutputStream();
	}
	
	@Test
	@DisplayName("Test Problem #6")
	void test6() {
		String problemNumber = "problem06()";
		String[] inputs = {"He didn't fall? Inconceivable",
						   "Happiness is buying a quarter"};
		String[] expectedOutputs = {"hE dIdn't fAll? IncOncEIvAblE",
									"hAppInEss Is bUYIng A qUArtEr"};
		int i = 0;
		//hE dIdn’t fAll? IncOncEIvAblE!
		//hE dIdn't fAll? IncOncEIvAblE!
		try {
			for (; i < inputs.length; i++) {
				inOut.resetOutputStream();
				inOut.overridePrintStatements();
				inOut.provideInput(inputs[i]);
				Lab02.problem06();
				assertTrue(inOut.getOutputStream().contains(expectedOutputs[i]));
			}
			
			inOut.resetSystem();
			System.out.println("Test " + problemNumber + ": Passed all inputs\n\n\n\n");
			
		}
		catch (Error e) {
			inOut.resetSystem();
			System.out.println("Error " + problemNumber + ": "
					 + "\n   Input(s):  " + inputs[i]
					 + "\n   Expected output should contain: " + expectedOutputs[i] 
					 + "\n   Your output: \n" + inOut.getOutputStream()
					 + "\n\n\n\n");
			fail();
		}

		inOut.resetOutputStream();
	}

}
