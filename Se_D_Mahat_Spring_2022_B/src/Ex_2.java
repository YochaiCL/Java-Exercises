
public class Ex_2 {

	public static void swap(int[] arr, int i, int j) { // function reaplace the liction of two numbers

		int tmp;
		tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;

	}

	public static void rises(int[] arr) { // function sort the array from small to big

		int i, j, tmp;

		for (i = 1; i < arr.length; i++) {
			tmp = arr[i];

			for (j = i - 1; j >= 0 && arr[j] > tmp; j--) {
				swap(arr, j, j + 1);
			}
			arr[j + 1] = tmp;
		}
	}

	public static void printArray(int[] arr) {

		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

	public static void printMissing(int[] arr) {
		int max = arr[arr.length - 1];
		int min = arr[0];
		int print;
		int i = 1;

		while (min != max) {
			print = min + 1;

			while (print != arr[i])
				System.out.print(print++ + " ");

			min = print;
			i++;
		}
	}

	public static void main(String[] args) {

		int[] arr = { 13, 11, 19, 15 };

		printArray(arr);
		rises(arr);
		System.out.println();
		printArray(arr);
		System.out.println();
		printMissing(arr);

	}

}
