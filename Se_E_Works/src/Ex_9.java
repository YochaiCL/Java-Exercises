// Made by Hodaya & Ezra Chayo
public class Ex_9 {

//	A function to merge two sorted arrays - into one sorted array
	public static int[] mergeSortedArrays(int arr1[], int arr2[]) {
		int res[] = new int[arr1.length + arr2.length];
		int i;
		int i1 = 0;
		int i2 = 0;

		for (i = 0; i < res.length && i1 < arr1.length && i2 < arr2.length; i++) {
			if (arr1[i1] < arr2[i2])
				res[i] = arr1[i1++];
			else
				res[i] = arr2[i2++];
		}

		while (i1 < arr1.length)
			res[i++] = arr1[i1++];

		while (i2 < arr2.length)
			res[i++] = arr2[i2++];

		return res;

	}

//	Merge sort function
//	Complications - O(N*LOGn) because you divide each half in the array until you get one cell, then sort each of the divisions
	public static int[] sortArr(int[] arr) {

		if (arr.length == 1)
			return arr;

		else {
			int laft[] = new int[arr.length / 2];
			int right[] = new int[arr.length - laft.length];

			for (int i = 0; i < arr.length; i++) {

				if (i < laft.length)
					laft[i] = arr[i];

				else
					right[i - laft.length] = arr[i];
			}

			laft = sortArr(laft);
			right = sortArr(right);

			int res[] = new int[arr.length];
			res = mergeSortedArrays(laft, right);

			return res;
		}

	}

	public static void printArr(int arr[]) {

		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

	public static void main(String[] args) {

//		int arr1[] = new int[] { 7, 9, 20, 34, 39, 60, 67 };
//		int arr2[] = new int[] { 3, 22, 32, 41, 45, 55 };
//
//		 printArr(mergeSortedArrays(arr1, arr2));

		int arr[] = new int[] { 4, 12, 5, 13, 22, 50, 2, 32, 17 };
		printArr(sortArr(arr));

	}

}
