package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import labs.Lab01;

class Tests_Lab01 {

public static InOutMimic inOut;
	
	@BeforeAll
	static void beforeAll() {
		inOut = new InOutMimic();
	}
	
	@Test
	@DisplayName("Test Problem #1")
	void test1() {
		String problemNumber = "problem01()";
		String[] inputs = {"happy", "parameter", "blueberries"};
		String[] expectedOutputs = {"There are 5 letters in happy", 
									"There are 9 letters in parameter", 
									"There are 11 letters in blueberries"};
		int i = 0;
		
		try {
			for (; i < inputs.length; i++) {
				inOut.resetOutputStream();
				inOut.overridePrintStatements();
				inOut.provideInput(inputs[i]);
				Lab01.problem01();
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
		String[] inputs = {"yellow submarine", "lemonaide pink", "happy apple"};
		String[] expectedOutputs = {"The longer word is submarine",
									"The longer word is lemonaide",
									"Words are the same length"};
		int i = 0;
		
		try {
			for (; i < inputs.length; i++) {
				inOut.resetOutputStream();
				inOut.overridePrintStatements();
				inOut.provideInput(inputs[i]);
				Lab01.problem02();
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
		String random = "";
		for (int i = 0; i < (int) (Math.random() * 21 + 10); i++) {
			char letter = (char) (int) (Math.random() * 26 + 97);
			random += letter;
		}
		String[] inputs = {"The fox is red",
						   "Happiness is finding a quarter",
						   random};
		String[] expectedOutputs = {"he fox is red\nThe fox is re\nhe fox is re",
									"appiness is finding a quarter\nHappiness is finding a quarte\nappiness is finding a quarte",
									random.substring(1) + "\n" + random.substring(0, random.length() - 1) + "\n" + random.substring(1, random.length() - 1)};
		int i = 0;

		try {
			for (; i < inputs.length; i++) {
				inOut.resetOutputStream();
				inOut.overridePrintStatements();
				inOut.provideInput(inputs[i]);
				Lab01.problem03();
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
		String[] inputs = {"palindromes", "happy", "ate", "iaeurhksfjdvnkjadbirsuerojlkfnadhbv"};
		String[] expectedOutputs = {"The middle three characters are \"ndr\"",
									"The middle three characters are \"app\"",
									"The middle three characters are \"ate\"",
									"The middle three characters are \"dbi\""};
		int i = 0;
		
		try {
			for (; i < inputs.length; i++) {
				inOut.resetOutputStream();
				inOut.overridePrintStatements();
				inOut.provideInput(inputs[i]);
				Lab01.problem04();
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
		String[] inputs = {"mamma", "player", "friasdfr"};
		String[] expectedOutputs = {"The first and last two letters are the same.", 
									"The first and last two letters are not the same.", 
									"The first and last two letters are the same."};
		int i = 0;
		
		try {
			for (; i < inputs.length; i++) {
				inOut.resetOutputStream();
				inOut.overridePrintStatements();
				inOut.provideInput(inputs[i]);
				Lab01.problem05();
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
