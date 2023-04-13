import java.util.Scanner;

public class Ex_2_Test {

	public static int chackFlight(int hour, int min) {

		Ex_2_Clock flight = new Ex_2_Clock(hour, min);

		return flight.getInterval();

	}
	

	public static void main(String[] args) {

		Ex_2_Clock a = new Ex_2_Clock(20, 45);

		System.out.println(a.getInterval());

		Scanner input = new Scanner(System.in);

		int hour, min;
		int flight1 = 0, flight2 = 0;

		for (int i = 0; i < 2; i++) {

			do {
				System.out.println("please enter hour of flight " + (i + 1));
				hour = input.nextInt();

				if (hour < 0 || hour > 23)
					System.out.println("Error only between 0-23");
			} while (hour < 0 || hour > 23);

			do {
				System.out.println("please enter min of flight " + (i + 1));
				min = input.nextInt();

				if (min < 0 || min > 59)
					System.out.println("Error only between 0-59");
			} while (min < 0 || min > 59);

			if (i == 0)
				flight1 = chackFlight(hour, min);

			if (i == 1)
				flight2 = chackFlight(hour, min);

		}
		
		System.out.println("flight1: "+flight1 + " flight2: "+flight2);

		if (flight1 < flight2)
			System.out.println("flight1 " + flight1 + " Will arive sooner");

		else
			System.out.println("flight2 " + flight2 + " Will arive sooner");

	}

}
