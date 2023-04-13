
public class Ex_Targil_Class {

	public static void printBy2(char ch, int num) {

		if (num > 0) {
			printBy(ch, num);
			System.out.println();
			printBy2(ch, num - 2);
			if (num == 1)
				return;

			printBy(ch, num);
			System.out.println();
		}

	}

	public static void printBy(char ch, int num) {

		if (num == 1) {
			System.out.print('#');
			return;
		}

		printBy(ch, num - 1);
		System.out.print('#');

	}

	public static void main(String[] args) {

		printBy2('@', 5);

	}

}
