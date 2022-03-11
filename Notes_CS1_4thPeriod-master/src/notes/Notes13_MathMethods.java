package notes;

/*
 * Math Methods
 * 
 * 
 * 
 * 
 * 
 * 
 */

public class Notes13_MathMethods {

	public static void main(String[] args) {
		
		/*
		 * Constants
		 * 
		 * Math.PI
		 * Math.E
		 */
		
		System.out.println(Math.PI);
		System.out.println(Math.E + "\n");
		
		
		/*
		 * Exponents
		 * Math.pow(base, exponent)
		 */
		
		double num1 = Math.pow(8, 5);
		System.out.println("8^5 = " + num1 + "\n");
		
		
		
		/*
		 * Max and Min
		 * See Notes09_Accumulation
		 * 
		 * 
		 * When find a max or a min, you want to start
		 * at the extremes
		 * 
		 * Integer.MAX_VALUE
		 * Integer.MIN_VALUE
		 * 
		 * Math.max(num, num)
		 * Math.min(num, num)
		 * 
		 */ 
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		System.out.println(max);
		System.out.println(min + "\n");
		//Now loop to find max and mins
		
		int x1 = 7, x2 = -3, x3 = 12, x4 = -5;
		
		System.out.println(max);  //1st
		
		max = Math.max(max, x1);
		System.out.println(max);  //2nd
		
		max = Math.max(max, x2);
		System.out.println(max);  //3rd
		
		max = Math.max(max, x3);
		System.out.println(max);  //4th
		
		max = Math.max(max, x4);
		System.out.println(max + "\n");  //5th
		//You'd never do it like that, it just acts like a loop
		
		
		
		/*
		 * Square Root
		 * 
		 * Math.sqrt(number)
		 */
		
		double num2 = Math.sqrt(26);
		System.out.println(num2 + "\n");
		
		
		/*
		 * Trig Functions
		 * sin cos tan
		 * 
		 * Math.sin(angle)
		 * Math.cos(angle)
		 * Math.tan(angle)
		 * 
		 * These are IN RADIANS!!!!!!!!
		 * 
		 * Math.toRadians(angle in degrees)
		 * Math.toDegrees(angle in radians)
		 * 
		 * 
		 */
		
		
		
		
		
		
	}
	
	
}
