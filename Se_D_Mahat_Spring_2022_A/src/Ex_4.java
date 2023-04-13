import java.util.Scanner;

public class Ex_4 {

	public static int hallNumber() { // A customer arrives at the checkout and selects the hall

		Scanner input = new Scanner(System.in);

		int hall;

		System.out.println("Please enter Hall number:");

		hall = input.nextInt();

		if (hall >= 1 && hall <= 6)

			return hall;

		return 0;

	}

	public static int tickets() { // choose the number of tickets

		Scanner input = new Scanner(System.in);

		int myTickets = 0;

		do {

			System.out.println("please enter how much tickts do you want - max 200:");

			myTickets = input.nextInt();

			if (myTickets < 1 || myTickets > 200)

				System.out.println("Error, between 1-200");

		} while (myTickets < 0 || myTickets > 200);

		return myTickets;
	}

	public static void fillSeats(int[] arr) { // filling the seats in he hall

		Scanner input = new Scanner(System.in);

		int hall;

		for (hall = hallNumber(); hall >= 1 && hall <= 6;) {

			arr[hall - 1] += tickets();

			hall = hallNumber();

			if (hall == 0)
				break;
		}
	}

	public static void lassThen10(int[] arr) {

		int i;
		int min = 1, max = 6, range = max - min + 1, hall;

		for (i = 1; i < arr.length; i++) {

			if (arr[i] > 0 && arr[i] < 10) {

				hall = (int) (Math.random() * range) + min;

				System.out.println(
						"Sorry you are moved to hall number: " + hall + " do to lass people int hall " + (i + 1));

				arr[hall] += arr[i];

			}
		}
	}

	public static void emptySeats(int[] arr) { // empty seats

		int i;

		for (i = 0; i < arr.length; i++) {

			System.out.println("In hall " + (i + 1) + " there is " + (200 - arr[i]) + " empty seats ");
		}
	}

	public static void pizzaTropit(int[] arr) { // food for kids

		int pizza;

		pizza = arr[0];

		System.out.println("We need " + (pizza / 8) + " pizzas boxs and " + (pizza / 20) + " topits boxs");
	}

	public static void main(String[] args) {

		int[] arr = new int[6];

		fillSeats(arr);

		lassThen10(arr);

		emptySeats(arr);

		pizzaTropit(arr);

	}

}
