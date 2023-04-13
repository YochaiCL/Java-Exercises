
public class Ex_27 {

	public static void arrayOfMin(int[] arr) {

		int tmp1, tmp2, indexJ=0;

		int[] result = new int[5];

		result[0] = 0;// i=0 in arr will be first in result array

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] > arr[result[0]])
				result[i] = i;

			else {
				for (int j = 0; j <i-j-1; j++) {

					if (arr[i] < arr[result[j]]) {
						tmp1 = result[j];
						tmp2 = result[j + 1];
						result[j + 1] = tmp1;
						result[j + 2] = tmp2;
						
					}
				}
				result[indexJ] = i;
				
			}
		}
	}

	public static void main(String[] args) {

		int[] arr = { 2, 4, 1, 8, -4 };

		arrayOfMin(arr);

	}
}
