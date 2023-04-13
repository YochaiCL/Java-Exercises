
public class Ex_3 {

	public static boolean sumOfTen(int[] arr, int n) {

		if (n < 1)
			return false;

		return ((arr[n] + arr[n - 1]) % 10 == 0 ? true : false) || sumOfTen(arr, n - 1);

	}

	public static void main(String[] args) {

		int[] arr = { 0, 3, 3, 7, 1, 1 };

		System.out.println(sumOfTen(arr, arr.length - 1));

		// The complexity is o(n) meaning that the loop ran over the entire array,
		// but the recursion process is not considered

	}

}
