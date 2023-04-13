import java.util.Scanner;

public class Ex_2_A {

	public static boolean allSame(int num) {

		boolean flag = true;
		int first = num % 10;

		num /= 10;

		while (num > 0) {
			if (first != num % 10)
				return flag = false;
			first = num % 10;
			num /= 10;
		}
		return flag;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a number between 100-999");

		int in = input.nextInt();

		System.out.println("are the all numbers are the same? " + allSame(in));

	}

}
