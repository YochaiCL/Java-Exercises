
public class Ex_4 {

	public static int sumOfTen(int[] arr, int n) {

		if (n < 0)
			return 0;

		return (arr[n] % 10 == 0 ? arr[n] : 0) + sumOfTen(arr, n - 1);

	}

//	public static void blabla(int[] arr, int n) {
//
//		if (n > 0)
//			blabla(arr, n - 1);
//
//		for (int i = n - 1; i >= 0; i--)
//
//			if ((arr[n] + arr[i]) % 10 == 0)
//
//				System.out.println(arr[n] + arr[i]);
//
//	}

	public static void main(String[] args) {

		int[] arr = { 20, 2, 60, 7, 40, 1 ,8};

		System.out.println(sumOfTen(arr, arr.length - 1));
		
		//blabla(arr, arr.length-1);

	}
}
