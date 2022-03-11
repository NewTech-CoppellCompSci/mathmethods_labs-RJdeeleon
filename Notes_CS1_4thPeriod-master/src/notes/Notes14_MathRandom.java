package notes;

/*
 * MAth.Random
 */
public class Notes14_MathRandom {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {

			double num = Math.random();
			System.out.println(num);

		}

		System.out.println();

		/*
		 * Need 2 things
		 * 
		 * Scope = how many numbers to choose from min = what number are you starting
		 * with?
		 * 
		 */

		// Random number from 1 to 10
		int scope = 10;
		int min = 1;

		for (int i = 0; i < 30; i++) {
			int num = (int) (Math.random() * scope + min);
			System.out.println(num);

		}

		System.out.println("\n\n");
		
		
		// Random number from 13 to 28
		//scope = max - min + 1
		scope = 28 - 13 + 1;
		min = 13;

		for (int i = 0; i < 30; i++) {
			int num = (int) (Math.random() * scope + min);
			System.out.println(num);

		}

	}

}
