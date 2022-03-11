package notes;

/*
 * Traversing
 * going through something
 * 1 at a time
 * 
 * 
 */

public class Notes16_Traversing_Strings {

	public static void main(String[] args) {
		
		String word = "Fartknkocker...";
		
		for (int i = 0; i < word.length(); i++) {
			System.out.println(word.substring(i, i + 1));
			
		}
		
		
		
		/*
		 * count the number of "r"s in garbage
		 */
		String garbage = "kljsanfvlkajdhf;aksjnjr;kajdnf;akwejsnr;kfajdnfg;aksern;dksfjnrase;krh;aksjrhrjrlkrrr;kasner;knrr;lkrna;rkna;sekrn;askrn;askrfn;asjfhgaksytrduyasgfvjytaesgfjtcragsdfjythdfyryegrdsfjoeytvhesragtyufgdtrsaertydfdrewdjoe";
		int count = 0;
		for (int i = 0; i < garbage.length(); i += 1) {
			
			//check if that letter is an r
			if (garbage.substring(i, i + 1).equals("r")) {
				count++;
				
			}
			
		}
		
		System.out.println("There are " + count +
				" \"r\"s in garbage");
		System.out.println("\n");
		
		
		
		/*
		 * print where the rs are in garbage
		 */
		
		System.out.print("r locations: ");
		for (int i = 0; i < garbage.length(); i += 1) {
			
			//check if that letter is an r
			if (garbage.substring(i, i + 1).equals("r")) {
				System.out.print(i + " ");
			}
			
		}
		System.out.println("\n");
		
		
		
		
		/*
		 * What if i need MORE than 1 character?
		 * 
		 * Find "joe" in garbage
		 */
		System.out.print("joe's at: ");
		for (int i = 0; i < garbage.length() - 2; i++) {
			
			if (garbage.substring(i, i+3).equals("joe")) {
				System.out.print(i + " ");
			}
			
		}
		
		System.out.println("\n");
		
		
		
		/*
		 * How to change strings
		 * 
		 * replace all the r's with %
		 */
		String newGarbage = "";
		for (int i = 0; i < garbage.length(); i++) {
			
			if (garbage.substring(i, i+1).equals("r")) {
				newGarbage += "%";
			}
			else {
				newGarbage += garbage.substring(i, i+1);
			}
			
			
		}
		System.out.println(garbage);
		System.out.println(newGarbage);
		
		
		
		
		
		
		
		
	}
	
	
	
}
