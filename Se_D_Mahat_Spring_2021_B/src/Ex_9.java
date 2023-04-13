
public class Ex_9 {

	public static int countBlocks(int[] arr, int num) {

		int count = 0, countBlocks = 0;

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] == arr[i - 1]) {
				count++;

				if (count == (num-1))
					countBlocks++;
			}
			else
				count = 0;
		}
		return countBlocks;
	}

	public static void main(String[] args) {

		int[] arr = { 3, 2, 2, 2, 5, 6, 6, 1, 3, 3, 3, 3, 1, 2 };

		System.out.println(countBlocks(arr, 2));
	}
}
