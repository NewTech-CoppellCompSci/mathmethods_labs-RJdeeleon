package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

import labs.Lab01;
import labs.Lab02;

class Lab02_Tests {

	public static InOutMimic inOut;
	
	@BeforeAll
	static void beforeAll() {
		inOut = new InOutMimic();
	}
	
	@Test
	@Order(1)
	@DisplayName("Test Problem #1")
	void test1() throws Exception {
		String problemNumber = "problem01()";
		
		Lab02 lab = new Lab02();
		lab.problem02();
		
		try {
			assertTrue(Arrays.toString(lab.color).equals(
					"[White, Red, LightRed, DeepOrange, Orange, Amber, Yellow, Lime, LightGreen, Green, Teal, Indigo, LightBlue, Blue, Cyan, Purple, DeepPurple, Brown, DeepBrown, BlueGrey, Grey, Black]"
					));
			assertTrue(Arrays.toString(lab.hex).equals(
					"[#FFFFFF, #D40C00, #FF9A00, #FF5500, #FF9A00, #FFCD00, #FFEF00, #CDE000, #87C735, #32C12C, #009888, #3E49BB, #00A5F9, #526EFF, #00BCD9, #7F4FC9, #682CBF, #7C5547, #50342C, #5F7D8E, #9E9E9E, #000000]"
					));
			assertTrue(Arrays.toString(lab.isLiked).equals(
					"[false, true, true, true, false, true, true, false, false, false, true, false, false, true, true, false, false, true, false, true, false, false]"
					));
			System.out.println("Problem #1 & #2 work:\n  Declared and populated all 3 arrays correctly.\n\n\n\n");
		}
		catch (Error e) {
			System.out.println("Error problems #1 & #2: "
					 + "\n   The arrays were not populated correctly"
					 + "\n   This is what they should hold\n"
					 + "\n   expected color: [White, Red, LightRed, DeepOrange, Orange, Amber, Yellow, Lime, LightGreen, Green, Teal, Indigo, LightBlue, Blue, Cyan, Purple, DeepPurple, Brown, DeepBrown, BlueGrey, Grey, Black]"
					 + "\n   your color:     " + Arrays.toString(lab.color) + "\n"
					 + "\n   expected hex: [#FFFFFF, #D40C00, #FF9A00, #FF5500, #FF9A00, #FFCD00, #FFEF00, #CDE000, #87C735, #32C12C, #009888, #3E49BB, #00A5F9, #526EFF, #00BCD9, #7F4FC9, #682CBF, #7C5547, #50342C, #5F7D8E, #9E9E9E, #000000]"
					 + "\n   hex:          " + Arrays.toString(lab.hex) + "\n"
					 + "\n   expected isLiked: [false, true, true, true, false, true, true, false, false, false, true, false, false, true, true, false, false, true, false, true, false, false]"
					 + "\n   isLiked:          " + Arrays.toString(lab.isLiked)
					 + "\n\n\n\n");
			fail();
		}
	
	}

	
	@Test
	@Order(2)
	@DisplayName("Test Problem #3")
	void test3() throws Exception {
		String problemNumber = "problem03()";
		
		String[] inputs = {"0", "15", "19"};
		String[] expectedOutputs1 = {"White", "Purple", "BlueGrey"};
		String[] expectedOutputs2 = {"#FFFFFF", "#7F4FC9", "#5F7D8E"};
		String[] expectedOutputs3 = {"false", "false", "true"};
		Lab02 lab = new Lab02();
		lab.problem02();
		int i = 0;
		
		try {
			for (; i < inputs.length; i++) {
				inOut.resetOutputStream();
				inOut.overridePrintStatements();
				inOut.provideInput(inputs[i]);
				lab.problem03();
				assertTrue(inOut.getOutputStream().contains(expectedOutputs1[i])
						&& inOut.getOutputStream().contains(expectedOutputs2[i])
						&& inOut.getOutputStream().contains(expectedOutputs3[i])
						);
			}
			
			inOut.resetSystem();
			System.out.println("Test " + problemNumber + ": Passed all inputs\n\n\n\n");
			
		}
		catch (Error e) {
			inOut.resetSystem();
			System.out.println("Error " + problemNumber + ": "
					 + "\n   Input(s):  " + inputs[i] 
					 + "\n   Expected output: " + expectedOutputs1[i] + " " + expectedOutputs2[i] + " " + expectedOutputs3[i] 
					 + "\n   Your output: " + inOut.getOutputStream()
					 + "\n\n\n\n");
			fail();
		}
		
		inOut.resetOutputStream();
		
	}
	
	
	@Test
	@Order(3)
	@DisplayName("Test Problem #4")
	void test4() throws Exception {
		String problemNumber = "problem04()";
		
		String expectedReturn = "Red, LightRed, DeepOrange, Amber, Yellow, Teal, Blue, Cyan, Brown, BlueGrey";
		String yourReturn = "";
		
		Lab02 lab = new Lab02();
		lab.problem02();
		
		
		try {
			yourReturn = lab.problem04();
			assertTrue(yourReturn.equals(expectedReturn));
			System.out.println("Test " + problemNumber + ": Passed all inputs\n\n\n\n");
			
		}
		catch (Error e) {
			
			System.out.println("Error " + problemNumber + ": "
					 + "\n   Expected return: " + expectedReturn
					 + "\n   Your return:     " + yourReturn
					 + "\n\n\n\n");
			fail();
		}
		
		
		
	}
	
	
	@Test
	@Order(4)
	@DisplayName("Test Problem #5")
	void test5() throws Exception {
		String problemNumber = "problem05()";
		
		String[] inputs = {"white", "lightRed", "teal", "aquaMarine"};
		String[] expectedReturns = {"FFFFFF", "FF9A00", "009888", "That color is not on the list."};
		String yourReturn = "";
		
		Lab02 lab = new Lab02();
		lab.problem02();
		
		int i = 0;
		
		try {
			for (; i < inputs.length; i++) {
				inOut.resetOutputStream();
				inOut.overridePrintStatements();
				inOut.provideInput(inputs[i]);
				yourReturn = lab.problem05();
				assertTrue(expectedReturns[i].equals(yourReturn));
			}
			inOut.resetSystem();
			System.out.println("Test " + problemNumber + ": Passed all inputs\n\n\n\n");
			
		}
		catch (Error e) {
			inOut.resetSystem();
			System.out.println("Error " + problemNumber + ": "
					 + "\n   Input: " + inputs[i]
					 + "\n   Expected return: " + expectedReturns[i]
					 + "\n   Your return:     " + yourReturn
					 + "\n\n\n\n");
			fail();
		}
		
		inOut.resetOutputStream();
		
	}
	
	
	@Test
	@Order(5)
	@DisplayName("Test Problem #6")
	void test6() throws Exception {
		String problemNumber = "problem06()";
		
		int expectedReturn = 10;
		int yourReturn = -1;
		
		Lab02 lab = new Lab02();
		lab.problem02();
		
		int i = 0;
		
		try {
			yourReturn = lab.problem06();
			assertTrue(expectedReturn == yourReturn);
			System.out.println("Test " + problemNumber + ": Passed all inputs\n\n\n\n");
			
		}
		catch (Error e) {
			inOut.resetSystem();
			System.out.println("Error " + problemNumber + ": "
					 + "\n   Expected return: " + expectedReturn
					 + "\n   Your return:     " + yourReturn
					 + "\n\n\n\n");
			fail();
		}
		
		
		
	}
	
	@Test
	@Order(6)
	@DisplayName("Test Problem #7")
	void test7() throws Exception {
		String problemNumber = "problem07()";
		
		String expectedReturn = "White, Orange, Lime, LightGreen, Green, Indigo, LightBlue, Purple, DeepPurple, DeepBrown, Grey, Black";
		String yourReturn = "";
		
		Lab02 lab = new Lab02();
		lab.problem02();
		
		
		try {
			yourReturn = lab.problem07();
			assertTrue(yourReturn.equals(expectedReturn));
			System.out.println("Test " + problemNumber + ": Passed all inputs\n\n\n\n");
			
		}
		catch (Error e) {
			
			System.out.println("Error " + problemNumber + ": "
					 + "\n   Expected return: " + expectedReturn
					 + "\n   Your return:     " + yourReturn
					 + "\n\n\n\n");
			fail();
		}
		
		
		
	}
	
}
