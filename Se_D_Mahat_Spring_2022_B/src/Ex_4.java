
public class Ex_4 {

	public static boolean ofki(int[][] arr) {

		boolean flag = true;

		if (arr.length % 2 != 0)
			return flag = false;

		for (int i = 0; i < arr[i].length; i++) {

			int sumFirstHelf = 0;
			int sumSecondHelf = 0;

			for (int j = 0; j < arr.length / 2; j++)

				sumFirstHelf += arr[j][i];

			for (int k = arr.length / 2; k < arr.length; k++)

				sumSecondHelf += arr[k][i];

			if (sumFirstHelf != sumSecondHelf)
				return flag = false;
		}
		return flag;
	}

	public static void main(String[] args) {

		int[][] arr = { { 7, 10, 8 }, { 2, -3, 0 }, { 4, 1, 2 }, { 5, 6, 6 } };

		System.out.println(ofki(arr));
	}

}
