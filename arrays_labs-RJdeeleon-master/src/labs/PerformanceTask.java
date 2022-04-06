package labs;
import java.util.Arrays;
import java.util.Scanner;
public class PerformanceTask {

	public static void main(String[] args) {
				int count = 6;
				boolean solve = false; 
				String incorrect = "";
				String[] word = {"a", "m", "a", "z", "i", "n", "g"};
				String[] hidden = {"_", "_", "_", "_", "_", "_", "_"};
				boolean letter = false;
				letter = false;
				while (solve == false) {
				System.out.println("Guess a letter");
				Scanner inKey = new Scanner(System.in);
				String input = inKey.next();	
				for (int i = 0; i < word.length; i++) {
					if (word[i].equals(input)) {
					hidden[i] = input;
					letter = true;
					}
					if (letter) {
					System.out.println("Good job, you got a letter!");
					System.out.println(Arrays.toString(hidden));
				}
				else {
					System.out.println("That letter is not part of the word, sorry");
					incorrect  += input;
					count--;
					System.out.println("You have " + count + " attempts left");
				}
				}
				if (count == 0) {
					System.out.println("You lost! The word was " + word);
				}
				if (Arrays.toString(hidden).equals(Arrays.toString(word))) {
					System.out.println("You did it! Great job!");
					solve = true;
				}
			}
		}	
	}

