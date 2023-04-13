/**
 * 
 * @author Yochai Hen Levi and David Jedwabsky
 *
 */
public class Ex_8 {
	/**
	 * This method searches for a target number in a Ascending Binary Search This
	 * method moves through half of the given array each moment until finding the
	 * target => Time complexity: O(log(n))
	 * 
	 * @param arr         - a given array of integer numbers
	 * @param left        - highest range to search
	 * @param right       - lowest range to search
	 * @param numToSearch - the number to search for
	 * @return the index of the target number else -1
	 */
	public static int ascendingBinarySearch(int[] arr, int left, int right, int numToSearch) {
		int mid;
		if (right >= left) {
			mid = (left + right) / 2;
			if (arr[mid] == numToSearch)
				return mid;
			else if (arr[mid] > numToSearch)
				return ascendingBinarySearch(arr, mid+1, right, numToSearch);
			else
				return ascendingBinarySearch(arr, left, mid-1, numToSearch);
		}
		return -1;
	}

	/**
	 * This method searches for a target number in a descending Binary Search This
	 * method moves through half of the given array each moment until finding the
	 * target => Time complexity: O(log(n))
	 * 
	 * @param arr         - a given array of integer numbers
	 * @param right       - highest range to search
	 * @param left        - lowest range to search
	 * @param numToSearch - the number to search for
	 * @return the index of the target number else -1
	 */
	public static int descendingBinarySearch(int[] arr, int left, int right, int numToSearch) {
		int mid;
		if (left <= right) {
			mid = (left + right) / 2;
			if (arr[mid] == numToSearch)
				return mid;
			if (arr[mid] > numToSearch)
				return descendingBinarySearch(arr, left, mid - 1, numToSearch);
			else
				return descendingBinarySearch(arr, mid + 1, right, numToSearch);
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] ascendingArray = { 2, 4, 6, 8, 12, 14 };
		int right = ascendingArray.length - 1;
		int left = 0;
		int numToSearch = 0;

		// Search by Ascending Binary Search
		int result = ascendingBinarySearch(ascendingArray, left, right, numToSearch);
		System.out.println(result >= 0 ? "Ascending Binary Search: The number is at index:" + result
				: "Ascending Binary Search: The number isn't in the sequence");

		// Search by Descending Binary Search
		int[] descendingArray = { 17, 8, 6, 4, 2, 0 };
		right = descendingArray.length - 1;

		result = ascendingBinarySearch(descendingArray, left, right, numToSearch);
		System.out.println(result >= 0 ? "Descending Binary Search: The number is at index:" + result
				: "Descending Binary Search: The number isn't in the sequence");
	}

}
