package labs;

import java.util.Scanner;

public class Lab01 {

	public static void main(String[] args) {
		problem01();
		problem02();
		problem03();
		problem04();
		problem05();

	}


	public static void problem01() {
		Scanner inKey = new Scanner(System.in);
		System.out.println("Enter a single word: ");
		String word1 = inKey.nextLine();
		System.out.println("There are " + word1.length() + 
				" letters in " + word1);
	}


	public static void problem02() {
		Scanner inKey = new Scanner(System.in);
		System.out.println("Enter two words: ");
		String word1 = inKey.nextLine();
		String word2 = inKey.nextLine();
		if (word1.length() > word2.length()) {
			System.out.println("The longer word is " + word1);
		}
		if (word1.length() < word2.length()) {
			System.out.println("The longer word is " + word2);
		}
		if (word1.length() == word2.length()) {
			System.out.println("Words are the same length");
		}
	}


	public static void problem03() {
		Scanner inKey = new Scanner(System.in);
		System.out.println("Enter a short sentence (do not punctuate): ");
		String word1 = inKey.nextLine();
		System.out.println(word1.substring(1));
		System.out.println(word1.substring(0, word1.length() - 1));
		System.out.println(word1.substring(1, word1.length() - 1));
	}


	public static void problem04() {
		Scanner inKey = new Scanner(System.in);
		System.out.println("Enter a word with an odd number of characters: ");
		String word1 = inKey.nextLine();
		int wdaw = word1.length();
		System.out.println("The middle 3 letters are " + word1.substring(wdaw/2-1,wdaw/2+2));

	}


	public static void problem05() {
		Scanner inKey = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String word1 = inKey.nextLine();
		
		String letters = word1;
		
		if (word1.substring(0,1).equals(word1.substring(3,4))) {
			System.out.println("The first and last two letters match.");
			
		}
		else {
			System.out.println("The first and Last two letters dont match.");
		}
		
	}

}

