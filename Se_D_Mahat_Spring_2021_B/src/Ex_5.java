import java.util.Scanner;

public class Ex_5 {

	public static boolean fill(int[] arr) {

		int i = 0, number, lastNumber, min = 10, max = 99, range = max - min + 1;

		boolean flag = true;

		lastNumber = (int) (Math.random() * range) + min;

		arr[i] = lastNumber;

		i++;

		while (i < arr.length && flag) {

			number = (int) (Math.random() * range) + min;

			if (number > lastNumber) {
				
				arr[i] = number;
				
				lastNumber=number;
			}

			else
				flag = false;

			i++;
		}

		return flag;
	}

	public static void print(int[] arr) {

		for (int i = 0; i < arr.length; i++)

			System.out.print(arr[i] + " ");
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter how many numbers:");

		int num = input.nextInt();

		int[] arr = new int[num];

		if (fill(arr))

			print(arr);

		else
			System.out.println("not realy rises");

	}

}
