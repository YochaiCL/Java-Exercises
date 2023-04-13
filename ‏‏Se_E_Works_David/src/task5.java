/**
 * 
 * @author Yochai Hen Levi and David Jedwabsky
 *
 */
public class task5 {
	/**
	 * This method prints all the numbers which their previous number is negative and Subsequent number is positive
	 * This method moves iteratively through the given array minus the first and last values => Time complexity: O(n) 
	 * @param arr - a given input array of integer numbers
	 * @param sizeOfArray - the size of the input array
	 */
	public static void printValues(int[] arr, int sizeOfArray) {
		if (sizeOfArray < 3)
			return;
		if (arr[sizeOfArray - 3] < 0 && arr[sizeOfArray - 1] > 0)
			System.out.println(arr[sizeOfArray - 2]);
		printValues(arr, sizeOfArray - 1);
	}

	public static void main(String[] args) {
		int[] arr = { -1, 2, 3, -13, 4, 7, -7, 2, 9 };
		int sizeOfArray = arr.length;
		printValues(arr, sizeOfArray);
	}
}
