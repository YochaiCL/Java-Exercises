import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex_Boom {

	public static void save(String fileName, int num) throws FileNotFoundException {

		File f = new File(fileName);

		PrintWriter pw = new PrintWriter(f);

		boolean result;

		for (int i = 0; i < num; i++) {

			result = isSeven(i);

			if (result)
				pw.println("BOOM");

			else
				pw.println(i);
		}

		pw.close();

	}

	public static boolean isSeven(int num) {

		boolean seven;

		seven = false;

		while (num > 0 && !seven) {

			if (num % 7 == 0 || num % 10 == 7)
				seven = true;

			num /= 10;

		}

		return seven;

	}

	public static void main(String[] args) throws FileNotFoundException {

		Scanner input = new Scanner(System.in);

		int num;

		String address = "c:\\tmp\\boom.txt";

		System.out.println("Please enter a number");

		num = input.nextInt();

		save(address, num);

	}

}
