
public class Ex_7_With_Max {

	public static int maxValue(int[] arr, int n, int max) {

		if (n <= 0)
			return max;

		if (arr[n - 1] > max)
			max = arr[n - 1];

		return maxValue(arr, n - 1, max);

	}

	public static int max(int[] arr, int n) {
		if (n <= 1)
			return arr[0];

		return arr[n] > max(arr, n - 1) ? arr[n - 1] : max(arr, n - 1);

	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 10, 9, 5 };

		int n = arr.length - 1;
		int max = arr[n];

		int result = maxValue(arr, n, max);
		System.out.println(result);

		System.out.println(max(arr, n));

	}

}
