package notes;

/*
 * Notes: String Methods
 * 
 * .toUpperCase()
 * .toLowerCase()
 * 
 * .length()
 * 		how many characters are in the String
 * 
 * .substring
 * 
 */

public class Notes15_String_Methods {

	public static void main(String[] args) {
		
		String word1 = "apples";
		String word2 = "bananas!!";
		System.out.println(word1.length());
		System.out.println(word2.length());
		
		
		System.out.println("there are " + word1.length() + 
				" letters in the word " + word1);
		
		
		/*
		 * To get PART of a string
		 * .substring(<int>)
		 * 		Starts at that index and goes to the end
		 * .substring(<int>, <int>)
		 * 
		 * 
		 * Indexing
		 * apples
		 * 012345
		 * 
		 */
		
		System.out.println("word1.substring(2) = " + word1.substring(2));
		System.out.println("word1.substring(4) = " + word1.substring(4));
		System.out.println();
		System.out.println("word1.substring(1, 4) = " + word1.substring(1, 4));
		System.out.println("word1.substring(1, 5) = " + word1.substring(1, 5));
		System.out.println("word1.substring(1, 6) = " + word1.substring(1, 6));
		System.out.println("word1.substring(1, 2) = " + word1.substring(1, 2));
		
		
		System.out.println();
		
		/*
		 * Grab the last letter
		 * Print ONLY the last letter
		 */
		String garbage = "jkxbnvcv .jsbdfnlvgkhakjdf;kjgbfn.ksdfjzhbflliajdfnzlgkdfjhsd;lfjhdjklsjhaflvjskdhrjdfvliudbflvsueajnsbvlidjnfglvaifejkbrfdouviijndsbfgildafgjnvsjd,havdljhsfajskcvls fkhddjkshdgjfadjsvlfuhdajidjvlsufidasjdfjlsfhduaijrfvblsaeirjsbjlesiwejrhfblsvaoisdjbilsd;o'asrjfbls;veaiorjbl;eoir'hbs;voeai'rhbv;oad'ifbav;ois'ldjbvjlsadilfjskdvc5";
		System.out.println("Last letter of \"garbage\" = " 
						+ garbage.substring(garbage.length() - 1));
		
		
		
		String word3 = new String("apples");
		int x = 2;
		if (word1 == word3) {
			System.out.println("They're the same");
		}
		else {
			System.out.println("They're different");
		}
		if (word1.equals(word3)) {
			System.out.println("They're the same");
		}
		else {
			System.out.println("They're different");
		}
		
		
	}
	
}
