package labs;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class Lab02 {

	//#1
	//instance variables
	public static String color[];
	public static String hex[];
	public static boolean liked[];
	
	
	public static void problem02() throws Exception {		
		Scanner File = new Scanner(new File("src/labs/input.txt")); 
		int elements = File.nextInt(); 
		color = new String[elements]; 
		hex = new String[elements]; 
		liked = new boolean[elements]; 
		for (int i = 0; i < color.length; i++) {
			color[i] = File.next();
		}
		for (int i = 0; i < hex.length; i++) { 
			hex[i] = File.next();
		}
		for (int i = 0; i < liked.length; i++) { 
			liked[i] = File.nextBoolean();
		}
	}

	public static void problem03() {
		Scanner inKey = new Scanner(System.in);
		System.out.println("Enter a number between 0 and 21");
		int num = inKey.nextInt(); 
		System.out.println(color[num]);
		System.out.println(hex[num]); 
		System.out.println(liked[num]); 
	}


	public static String problem04() {
		String reString = ""; 
		int num = color.length; 
		int count = 0; 
				
		for (int i = 0; i < liked.length; i++) { 
			if (liked[i] == true && count>=1) { 
				reString += ", " + color[i]; 
				count++; 
			}
			else if (liked[i] == true) { 
				reString += color[i]; 
				count++; 
			}	
		}
		return reString; 
	}


	public static String problem05() {
		Scanner inKey = new Scanner(System.in); 
		System.out.println("Enter the name of a color");
		String color2 = inKey.next(); 
		boolean nol = false; 
		String reString = "";
		for (int i = 0; i < color.length; i++) { 	
			if (color[i].equalsIgnoreCase(color2)) { 
				reString = (hex[i].substring(1)); 		
				nol = true; 
			}
		}
		if (nol == false) { 
			reString += "that color is not on the list ";
		}
 		return reString; 
	}

	public static int problem06() {
		int count = 0; 
		for (int i = 0; i < liked.length; i++) { 
			if (liked[i] == true) {
				count++; 
			}
		}
		return count; 
	}


	public static String problem07() {

		String stri = ""; 
		int num = color.length; 
		int count = 0; 
			for (int i = 0; i < liked.length; i++) { 
			if (liked[i] == false && count>=1) { 
			stri += ", " + color[i]; 
				count++;
			}
			else if (liked[i] == false) { 
			stri += color[i]; 
				count++;
			}
		}
		return stri; 
	}
	
	public static void main(String[] args) throws Exception{
		
		//#2
		problem02();
		
		//#3
		problem03();
		
		//#4
		System.out.println(problem04());
		
		//#5
		System.out.println(problem05());
		
		//#6
		System.out.println("They like " + problem06() + " colors.");
		
		//#7
		System.out.println(problem07());
		
	}
	
}
