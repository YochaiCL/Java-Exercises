import java.util.Scanner;

public class Ex_1 {

	public static boolean areStartOrFinishZ(String str) {

		if (str.charAt(0) == 'Z' || str.charAt(str.length() - 1) == 'Z')

			return true;

		return false;
	}

	public static boolean areStartAndFinishX(String str) {

		if (str.charAt(0) == 'X' && str.charAt(str.length() - 1) == 'X')

			return true;

		return false;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int count = 0;

		String str;

		do {
			System.out.println("Please enter a String");
			str = input.next();

			if (areStartAndFinishX(str))
				count++;

		} while (!areStartOrFinishZ(str));
		
		System.out.println("The number of X strings are "+count);

	}

}
