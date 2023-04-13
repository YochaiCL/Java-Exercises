
public class Ex_1 {

	public static int sumZugi(int[] arr, int n) {

		if (n <= 0)
			return 0;

		return sumZugi(arr, n - 1) + (arr[n] % 2 == 0 ? arr[n] : 0);
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6 };

		System.out.println(sumZugi(arr, arr.length - 1));
		
		// The complexity is o(n) meaning that the loop ran over the entire array, 
		//but the recursion process is not considered

	}

}
