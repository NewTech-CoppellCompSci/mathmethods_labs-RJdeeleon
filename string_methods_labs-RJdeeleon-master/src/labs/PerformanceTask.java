package labs;

import java.util.Scanner;

public class PerformanceTask {

	public static void main(String[] args) {
		Scanner inKey = new Scanner(System.in);
		System.out.println("Type in a Password: ");
		String password = inKey.next();
		int length = password.length();
			String numb[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
			String specC[] = {"!","@","#","$","%","^","&","*","?"};
	String OspecC[]  = {",",".",";","/","'","{","[","]","}","\"","-","+","=",")","&","`", "~","<",">",};
			boolean uppercase = false, lowercase = false, longs = false, shorts = false, specChar = false, num = false, pv = false;
			if (password.length()>20) {
			longs = true;
			System.out.println("Password is too long");
			}
			if (password.length()<8) {
		shorts = true;
		System.out.println("Password is too short");
			}
			for (int i = 0; i < length; i++) {
		if(Character.isUpperCase(password.charAt(i))) {
					uppercase = true;
				}
		if (Character.isLowerCase(password.charAt(i))) {
					lowercase = true;
				}
			}
			for (int i = 0; i < length; i++) {
				for (int j = 0; j< numb.length; j++) {
					if (password.substring(i, i+1).equals(numb[j])) {
						num = true;
					}
				}
			}
			for (int i = 0; i < length; i++) {
				for (int j = 0; j< specC.length; j++) {
					if (password.substring(i, i+1).equals(specC[j])) {
						specChar = true;
					}
				}
			}
			for (int i = 0; i < length; i++) {
				for (int j = 0; j< OspecC.length; j++) {
			if (password.substring(i, i+1).equals(OspecC[j])) {
					System.out.println("Special Character not recognized: " + password.substring(i));
						break;
					}
				}
			}
			if (uppercase == true && lowercase == true && specChar == true && num == true) {
				System.out.println("Password is Valid!");
		pv = true;
			}
			else {
				System.out.println("Password does not meet requirements");
			}
		}
	}
