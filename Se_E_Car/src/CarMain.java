import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Car car = new Car();

		boolean result;

		do {
			System.out.println("Please enter the car ID:");
			result = car.setCarId(input.nextInt());
		} while (result != true);

		System.out.println("Your car ID is: " + car.getCarId());

		do {
			System.out.println("Please enter how much speed do you wont to rise");
			result = car.speedUp(input.nextInt());
		} while (result != true);

		System.out.println("Your speed is: " + car.getSpeed());

		do {
			System.out.println("Please enter how much speed do you wont to low");
			result = car.speedDown(input.nextInt());
		} while (result != true);

		System.out.println("Your speed is: " + car.getSpeed());

		car.stopAndPrint();

	}

}
