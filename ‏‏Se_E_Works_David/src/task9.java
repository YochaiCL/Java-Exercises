import java.util.Random;

public class task9 {
	/**
	 * This method fills an array with random values This method moves iteratively
	 * through the array => Time complexity: O(n)
	 * 
	 * @param arr - a given array of integer numbers
	 */
	public static void fillArray(int[] arr) {
		Random rnd = new Random();
		for (int i = 0; i < arr.length; i++)
			arr[i] = rnd.nextInt(100);
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

			// System.out.printf(i < arr.length - 1 ? "%d, " : "%d]\n", arr[i]);
		}

	}

	/**
	 * This method divides the original array into it's two halfs Time complexity:
	 * O(n)
	 * 
	 * @param source     - a given input array of integer numbers
	 * @param sourceZise - the size of the input array
	 * @return the highest value out of the two divided arrays
	 */
	public static void fillHelfsArrays(int[] source, int sourceZise, int[] leftArray, int[] rightArray) {

		int midArray = sourceZise / 2;

		fillArray(leftArray.length - 1, midArray - 1, leftArray, source);

		fillArray(rightArray.length - 1, source.length - 1, rightArray, source);

	}

	/**
	 * In this function we fill in the halved arrays
	 * 
	 * @param indexfill     - Describes the index of the array we are filling
	 * @param indexFillFrom - Describes the index of the array we are filling from
	 * @param arrToFill     - An array that we fill with values
	 * @param arrToFillFrom - The source array from which the values are taken
	 * @return - An array with values
	 */
	public static void fillArray(int indexfill, int indexFillFrom, int[] arrToFill, int[] arrToFillFrom) {

		if (indexfill >= 0) {
			arrToFill[indexfill] = arrToFillFrom[indexFillFrom];
			fillArray(indexfill - 1, indexFillFrom - 1, arrToFill, arrToFillFrom);
		}

	}

//	public static void mergeSort(int[] arr, int startIndex, int sizeOfArray) {
//		if (startIndex < sizeOfArray) {
//			int midIndex = startIndex + (startIndex + sizeOfArray) / 2;
////			Sort/ Divide left side
//			mergeSort(arr, startIndex, midIndex - 1);
////			Sort/ Divide right side
//			mergeSort(arr, midIndex + 1, sizeOfArray);
////			Merge
//			//mergeArray(arr, startIndex, sizeOfArray);
//		}
//	}

//	public static void mergeArray(int[] inputArray, int leftSize, int rightSize) {
//		int middleIndex = (leftSize + rightSize) / 2;
//		int[] leftSide = new int[middleIndex];
//		int[] rightSide = new int[rightSize];
//		int i = 0, j = 0, k = 0;
////		Populate the array with both right and left side
//		while (i < leftSize && j < rightSize) {
//			if (leftSide[i] < rightSide[j])
//				inputArray[k] = leftSide[i++];
//			else
//				inputArray[k] = rightSide[j++];
//			k++;
//
////			Add the reminder values of the left side
//			while (i < leftSize)
//				inputArray[k++] = leftSide[i++];
////			Add the reminder values of the right side
//			while (j < rightSize)
//				inputArray[k++] = rightSide[j++];
//		}
//	}

	public static void main(String[] args) {
		int[] arr = new int[10];
		fillArray(arr);

		System.out.println("Original array before sorting:");
		printArray(arr);
		System.out.println();

		int sourceZise = arr.length;

		int midArray = sourceZise / 2;

		int[] leftArray = new int[midArray];
		int[] rightArray = new int[sourceZise - midArray];

		fillHelfsArrays(arr, arr.length, leftArray, rightArray);

		printArray(leftArray);
		System.out.println();
		printArray(rightArray);
		
		int[] leftArray1 = new int[midArray];
		int[] rightArray1 = new int[sourceZise - midArray];

		fillHelfsArrays(arr, arr.length, leftArray1, rightArray1);

		printArray(leftArray);
		System.out.println();
		printArray(rightArray);
		
		

//		mergeSort(arr, 0, arr.length - 1);

//		System.out.println("The array after sorting:");
//		printArray(arr);
	}
}
