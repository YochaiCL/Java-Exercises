
public class Ex_6 {

	public static void what(int[] arr) {
		int m = arr.length / 2;
		int temp = arr[0];
		for (int i = 1; i < m; i++)
			arr[i - 1] = arr[i];
		arr[m - 1] = temp;
		if (arr.length % 2 == 0)
			m = m - 1;
		temp = arr[arr.length - 1];
		for (int i = arr.length - 1; i > m + 1; i--)
			arr[i] = arr[i - 1];
		arr[m + 1] = temp;
	}
	
	public static void printArr (int [] arr) {
		
		for (int i=0; i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}

	public static void main(String[] args) {

		int[] arr = { 913, 29, 721, 681, 856, 58, 123, 71, 57 };

		what(arr);
		printArr(arr);

	}

}
