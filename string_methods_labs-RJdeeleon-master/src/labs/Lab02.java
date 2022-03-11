package labs;

import java.util.Scanner;

public class Lab02 {

	public static void main(String[] args) {
		problem01();
		problem02();
		problem03();
		problem04();
		problem05();
		problem06();

	}


	public static void problem01() {
		Scanner inKey = new Scanner(System.in);
		System.out.print("Give me a word: ");
		String word = inKey.nextLine();
		int count = 0;
		String thing = word;
		for (int i = 0; i < thing.length(); i++) {
			if (thing.substring(i, i+1).equals("a")) {
				count++;
			}
		}
		System.out.println("There are " + count + 
				" a's in " + thing);
	}


	public static void problem02() {
		Scanner inKey = new Scanner(System.in);
		System.out.print("Give me a word: ");
		String word = inKey.nextLine();
		int count = 0;
		String thing = word;
		for (int i = 0; i < word.length(); i++) {
			if (word.substring(i, i+1).equals(" ")) {
				count++;
			}
			if (word.substring(i, i+1).equals(" ")) {
				System.out.println("There are double letters in " + word);
			}
			else {
				System.out.println("There are no double letters in " + word);
			}
		}
		System.out.println("\n\n");	
	}
	


	public static void problem03() {
		Scanner inKey = new Scanner(System.in);
		System.out.print("Give me a Sentence: ");
		String word = inKey.nextLine();
		int count = 0;
		String thing = word;
		String betterThing = ""; 
		for (int i = 0; i < thing.length(); i++) {
			if (thing.substring(i, i+1).equals("a")) {
				
				betterThing += "@";
			}
				if (thing.substring(i, i+1).equals("s")) {
					betterThing += "$";
			}
				if (thing.substring(i, i+1).equals("e")) {
					betterThing += "#";
				}
			else {
				betterThing += thing.substring(i, i+1);
			}
		}
		System.out.println(betterThing);
		System.out.println("\n\n");
	}


	public static void problem04() {
		Scanner inKey = new Scanner(System.in);
		System.out.print("Give me a word: ");
		String word = inKey.nextLine();
		System.out.print("Give me a letter: ");
		String letter = inKey.nextLine();
		int count = 0;
		String thing = word;
		for (int i = 0; i < thing.length(); i++) {
			if (thing.substring(i, i+1).equals(letter)) {
				count++;
			}
		}
		System.out.print(letter + "'s occur at the following index ");
		for (int i = 0; i < thing.length(); i++) {
			if (thing.substring(i, i+1).equals(letter)) {
				System.out.print(i + " ");
			}
		}
		System.out.println("\n\n");
	}
	public static void problem05() {
		Scanner inKey = new Scanner(System.in);
		System.out.print("Spell out your first name: ");
		String word1 = inKey.nextLine();
		System.out.print("Spell out your last name: ");
		String word2 = inKey.nextLine();
		String betterThing = "";
		for (int i = 0; i < word1.length(); i++) {	
		if (word1.substring(1, 2).equals(" ")) {
				word1 = word1.toUpperCase();
			}
				System.out.println(word2);
		if (word2.substring(1, 4).equals(" ")) {
				word2 = word2.toUpperCase();
			}
					
		}
				
				
	}
				
				
				



	public static void problem06() {
		Scanner inKey = new Scanner(System.in);
		System.out.print("Give me a Sentence: ");
		String word = inKey.nextLine();
		String not = word.replace('a', 'A' );
		String in = not.replace('e', 'E' ); 
		String deca = not.replace('i', 'I' );
		String what = deca.replace('o', 'O' );
		String the = what.replace('u', 'U' );
		String hecka = the.replace('y', 'Y' );
		System.out.print(hecka);
	}

}