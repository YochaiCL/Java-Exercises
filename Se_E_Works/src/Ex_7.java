/**
 * 
 * @author Yochai Hen Levi and David Jedwabsky
 *
 */
public class Ex_7 {
//	Part A
	/**
	 * This method searches for the highest value in the array This method moves
	 * iteratively through the given array => Time complexity: O(n)
	 * 
	 * @param arr         - a given input array of integer numbers
	 * @param sizeOfArray - the size of the input array
	 * @return highest value
	 */
	public static int maxValue(int[] arr, int sizeOfArray) {
		if (sizeOfArray == 1)
			return arr[0];
		return arr[sizeOfArray - 1] > maxValue(arr, sizeOfArray - 1) ? arr[sizeOfArray - 1]
				: maxValue(arr, sizeOfArray - 1);
	}

//	Part B
	/**
	 * This method divides the original array into it's two halfs and searches the
	 * highest value of the two halfs This method moves iteratively through the two
	 * halfs of given array each independent O(n/2) => Time complexity: O(n)
	 * 
	 * @param arr           - a given input array of integer numbers
	 * @param leftMaxValue  - this parameter hold maximum value of left side of the
	 *                      array
	 * @param rightMaxValue - this parameter hold maximum value of right side of the
	 *                      array
	 * @param index         - the first index of the given array
	 * @return The max value between two halfs of the array
	 */
	private static int maxOfTwoArrays(int[] arr, int leftMaxValue, int rightMaxValue, int index) {
		if (index + 1 < arr.length / 2) {
			leftMaxValue = Math.max(arr[index+1], leftMaxValue);
			return maxOfTwoArrays(arr, leftMaxValue, rightMaxValue, index + 1);
		} else if (index + 1 < arr.length) {
			rightMaxValue = Math.max(arr[index+1], rightMaxValue);
			return maxOfTwoArrays(arr, leftMaxValue, rightMaxValue, index + 1);
		}
		return Math.max(leftMaxValue, rightMaxValue);
	}

	/**
	 * This method overloads the function above - maxOfTwoArrays(using 4 local
	 * parameters) Time complexity: O(n)
	 * 
	 * @param arr - given array of integers
	 * @return The maximal value of the given array from it's two halfs
	 */
	public static int maxOfTwoArrays(int[] arr) {
		if (arr.length >= 2) {
			return maxOfTwoArrays(arr, arr[0], arr[arr.length - arr.length / 2], 0);
		}
		return arr[0];
	}

	/**
	 * This method prints out the array values This method moves iteratively through
	 * the array => Time complexity: O(n)
	 * 
	 * @param arr - a given array of integer numbers
	 */
	public static void printArray(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i < arr.length - 1)
				System.out.print(arr[i] + ", ");
			if (i == arr.length - 1)
				System.out.print(arr[i] + "]");
		}
		System.err.println();
	}

	public static void main(String[] args) {
		int[] arr = { -1, 1232, 1, 23};
//		Part A
		System.out.println("Displaying the array - arr:");
		printArray(arr);

		System.out.println("Using function maxValue(arr,arr.length) - The max value is:\n" + maxValue(arr, arr.length));
		System.out.println();

//		Part B
		System.out.println("Displaying the array - arr:");
		printArray(arr);

		System.out.println("The maximum value: " + maxOfTwoArrays(arr));
	}
}