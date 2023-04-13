import java.util.Scanner;

public class Ex_8_Test {

	public static void printResult(Ex_8_Buyer[] arr) {
		Scanner input = new Scanner(System.in);

		double sum = 0;
		double buy;

		for (int i = 0; i < arr.length; i++) {

			System.out.println("For cutomer number " + (i + 1) + " please enter amount of perchese");
			arr[i] = new Ex_8_Buyer();

			buy = input.nextDouble();

			while (buy > 0) {

				arr[i].setData(buy);

				System.out.println("For cutomer number " + (i + 1) + " please enter amount of perchese");

				buy = input.nextDouble();

			}
			if (arr[i].isConstantBuyer() == true) {
				System.out.println("The customer " + (i + 1) + " is the perfect buyer");
				sum += 50;
			}

			else
				System.out.println("The customer " + (i + 1) + " is Not the perfect buyer");

		}

		System.out.println("The amount of all gifts are " + sum);
	}

	public static void main(String[] args) {

		Ex_8_Buyer[] arr = new Ex_8_Buyer[500];

		printResult(arr);

	}

}
