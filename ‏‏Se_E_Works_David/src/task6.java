/**
 * 
 * @author Yochai Hen Levi and David Jedwabsky
 *
 */
public class task6 {
	/**
	 * This method checks throughout the entire array's length and check if the two
	 * given values are near each other
	 * This method moves iteratively through the given array => Time complexity: O(n) 
	 * @param arr         - a given input array of integer numbers
	 * @param sizeOfArray - the size of the input array
	 * @param firstValue  - first value to check
	 * @param secondValue - second value to check
	 * @return true if the two array values are close to each other otherwise false
	 */
	public static boolean valuesAreNearby(int[] arr, int sizeOfArray, int firstValue, int secondValue) {
		if (sizeOfArray <= 1)
			return false;
		return (arr[sizeOfArray - 1] == firstValue && arr[sizeOfArray - 2] == secondValue)
				|| (arr[sizeOfArray - 1] == secondValue && arr[sizeOfArray - 2] == firstValue)
				|| valuesAreNearby(arr, sizeOfArray - 1, firstValue, secondValue);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 5, 3, 12, 7, 5 };
		int sizeOfArray = arr.length;
		int firstNumber = 7;
		int secondNumber = 12;

		if (valuesAreNearby(arr, sizeOfArray, firstNumber, secondNumber))
			System.out.println("The given values are consecutive numbers ");
		else
			System.out.println("The given values aren't consecutive numbers ");
	}
}
