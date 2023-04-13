import java.util.Scanner;

public class Ex_5_New {

	public static int replaceNum(int num, int count) {

		int number = 0;

		int innerCount, beforCount;

		while (num > 0) {
			innerCount = count;
			beforCount = 1;
			while (innerCount > 1) {
				beforCount *= 10;
				innerCount--;
			}

			number += num % 10 * beforCount;
			count--;
			num /= 10;
		}

		return number;
	}

	public static int countNum(int number) {
		int count = 0;
		while (number > 0) {
			number /= 10;
			count++;
		}

		return count;

	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("please enter a number:");
		int num = input.nextInt();

		int counter = countNum(num);

		int result = replaceNum(num, counter);

		System.out.println(num + "-" + result + "=" + Math.abs(num - result));
	}
}
