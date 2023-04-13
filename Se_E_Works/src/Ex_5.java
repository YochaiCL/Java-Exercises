/**
 * @author Yochai Hen Levi and David Jedwabsky
 */

/**
 * This function prints all the numbers in the array that are before negative
 * numbers and after positive numbers
 * Time complexity: O(n)
 * @param - arr - array full with integers numbers
 * @param - n - size of the array
 */
public class Ex_5 {

	public static void negetivAndPositive(int[] arr, int n) {

		if (n < 3) {
			return;
		}

		if (arr[n - 3] < 0 && arr[n - 1] > 0) {
			System.out.println(arr[n - 2]);
		}
		negetivAndPositive(arr, n - 1);
	}

	public static void main(String[] args) {

		int[] arr = { -5, 2, 5, -2, 5, 8 };

		negetivAndPositive(arr, arr.length);
	}
}
