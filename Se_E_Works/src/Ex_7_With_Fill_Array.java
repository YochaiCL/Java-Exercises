/**
 * 
 * @author Yochai Hen Levi and David Jedwabsky
 *
 */
public class Ex_7_With_Fill_Array {
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
	 * @param arr - a given input array of integer numbers
	 * @param sizeOfArray - the size of the input array
	 * @return the highest value out of the two divided arrays
	 */
	public static int maxOfTwoArrays(int[] arr, int sizeOfArray) {

		if (sizeOfArray == 1)
			return arr[0];

		int midArray = sizeOfArray / 2;

		int[] leftArray = new int[midArray];

		fillArray(leftArray.length - 1, midArray - 1, leftArray, arr);

		int[] rightArray = new int[sizeOfArray - midArray];

		fillArray(rightArray.length - 1, arr.length - 1, rightArray, arr);

		return Math.max((maxValue(rightArray, rightArray.length)), maxValue(leftArray, leftArray.length));

	}

	/**
	 * In this function we fill in the halved arrays
	 * @param indexfill - Describes the index of the array we are filling
	 * @param indexFillFrom - Describes the index of the array we are filling from
	 * @param arrToFill - An array that we fill with values
	 * @param arrToFillFrom - The source array from which the values are taken
	 * @return - An array with values
	 */
	public static int[] fillArray(int indexfill, int indexFillFrom, int[] arrToFill, int[] arrToFillFrom) {

		if (indexfill < 0) {
			return arrToFill;
		}

		arrToFill[indexfill] = arrToFillFrom[indexFillFrom];
		return fillArray(indexfill - 1, indexFillFrom - 1, arrToFill, arrToFillFrom);
	}

	public static void main(String[] args) {
		int[] arr = { -1, 5, 2, 3,6 };
		int sizeOfArray = arr.length;
//		Part A
		System.out.println(maxValue(arr, sizeOfArray));
//		Part B
		System.out.println(maxOfTwoArrays(arr, sizeOfArray));
	}
}
