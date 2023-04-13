
public class Ex_2 {

	public static void bigNeighbors(int[] arr, int n) {

		if (n < 1) {
			System.out.println();
		}

		else {
			if (arr[n] > arr[n + 1] && arr[n] > arr[n - 1])
				System.out.println(arr[n]);
			bigNeighbors(arr, n - 1);
		}

	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 6, 5, 10 };

		bigNeighbors(arr, arr.length - 2);

		// The complexity is o(n) meaning that the loop ran over the entire array,
		// but the recursion process is not considered

	}

}
