/**
 * @author Yochai Hen Levi and David Jedwabsky
 */

/**
 * This function checks if the variables
 * num1 and num2 are next to each other
 * Time complexity: O(n)
 * @return true if yes and false if not
 */
public class Ex_6 {

	public static boolean aside(int[] arr, int n, int num1, int num2) {

		if (n <= 2)
			return false;

		return ((arr[n - 1] == num1 && arr[n - 2] == num2) || (arr[n - 1] == num2 && arr[n - 2] == num1))
				|| aside(arr, n - 1, num1, num2);
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
		int num1 = 3;
		int num2 = 4;

		boolean result = aside(arr, arr.length, num1, num2);

		System.out.println("The result is:" + result);

	}

}
