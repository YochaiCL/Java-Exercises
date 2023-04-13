import java.util.Scanner;

public class MainClock {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Clock c1 = new Clock();

		boolean result;

		// Input hours
		do {
			System.out.println("Please enter hours - between 0-23");
			result = c1.setHours(input.nextInt());

		} while (result != true);

		// Input minuts
		do {
			System.out.println("Please enter minutes  - between 0-60");
			result = c1.setMinutes(input.nextInt());

		} while (result != true);

		// Input seconds
		do {
			System.out.println("Please enter seconds - between 0-60");
			result = c1.setSeconds(input.nextInt());

		} while (result != true);

		// Show clock
		System.out.println("The time is:");
		c1.show();

		System.out.println("Please enter seconds/minutes/hours to add:");
		int sec=input.nextInt();
		
		for (int i=0;i<sec;i++) {
			
			// add 2 seconds
			c1.tack();
			
			// add 2 minuts
			c1.tick();
			
			// add 2 hours
			c1.tock();
		}
		
		c1.show();
		
		System.out.println("Show clock by pm and am");

		c1.showPm();
		
		System.out.println("Reset the clock");

		c1.reset();

		c1.show();

	}

}
