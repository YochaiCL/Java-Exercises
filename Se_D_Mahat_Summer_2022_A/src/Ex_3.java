
public class Ex_3 {

	public static boolean isPeak(int[] arr, int index) {

		boolean flag = false;

		if (index == 0 || index == arr.length - 1)
			return flag;

		if (arr[index - 1] < arr[index])

			if (arr[index + 1] < arr[index])

				return flag = true;

		return flag;

	}

	public static int countPeak(int[] arr) {

		int count = 0;

		int i = 1;

		while (i < arr.length - 1) {

			if (isPeak(arr, i))
				count++;
			i++;
		}

		return count;

	}

	public static void main(String[] args) {

		int[] arr = { 2, 5, 4, 3, 10, 7 };
		
		System.out.println(countPeak(arr));

	}

}
