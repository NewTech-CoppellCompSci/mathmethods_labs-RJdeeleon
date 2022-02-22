package labs;

import java.util.Scanner;

public class PerformanceTask {

		
		public static double launchVelocity;
		public static double launchAngle;
		public static double time = 0;
		public static double xPos;
		static double yPos;
		public static void main(String[] args) {
			Scanner inKey = new Scanner(System.in);
			System.out.println("What is the T-Shirt launcher's initial velocity? (m/s)");
			launchVelocity = inKey.nextDouble();
			System.out.println("What is the T-Shirt launcher's an launch angle? (degrees)");
			launchAngle = inKey.nextDouble();
			while (time < 100) {
				xPos = Math.cos(Math.toRadians(launchAngle)) * time * launchVelocity;
				yPos = Math.sin(Math.toRadians(launchAngle)) * time * launchVelocity - 0.5 * 9.8 * Math.pow(time, 2);
				if(yPos < 0) {
					yPos = 0;
				}
				System.out.println("Time: " + time + "s");
				System.out.println("The X-Position is: " + xPos + "m");
				System.out.println("The Y-Position is: " + yPos + "m");
				if(yPos == 0 && time > 0){
					break;
				}
				time++;
			}
		}

		
	}
	
	

