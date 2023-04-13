
public class Ex_11 {

	public static void printArray(int[] arr) {

		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

	public static int[] buildSpecialArray(int[] arr1, int[] arr2) {

		int count = 0;

		int[] arr = new int[arr1.length + arr2.length];

		for (int i = 0; i < arr1.length; i++) {

			if (specialNumber(arr1[i]) == true)

				for (int j = 0; j < arr2.length; j++) {

					if (arr2[j] == arr1[i]) {

						arr[count] = arr2[j];
						count++;
						break;
					}
				}
		}

		int[] result = new int[count];

		for (int i = 0; i < result.length; i++)

			result[i] = arr[i];

		return result;

	}

	public static boolean isSpecialArray(int[] arr) {

		boolean flag = true;

		for (int i = 0; i < arr.length - 1 && flag; i++) {

			if (specialNumber(arr[i]) == true)

				if (specialNumber(arr[i + 1]) == false)

					flag = true;

				else

					flag = false;
			else if (specialNumber(arr[i]) == false)

				if (specialNumber(arr[i + 1]) == true)

					flag = true;

				else
					flag = false;

		}
		return flag;
	}

	public static boolean specialNumber(int num) {

		boolean flag = true;
		boolean check = false;

		while (num > 99 && flag) {

			if (num % 10 < num / 10 % 10)
				flag = false;

			else if (num % 10 > num / 10 % 10)
				check = true;

			num /= 10;
		}
		if (num % 10 == num / 10 % 10 && !check)
			flag = false;

		return flag;

	}

	public static void main(String[] args) {

		int[] arr1 = { 111, 23, 6215, 379, 4254, 26, -561 };

		int[] arr2 = { 21, 72, 15, 1227, 23, 579, 4254, 26, -561 };

		int[] arr3 = buildSpecialArray(arr1, arr2);

		printArray(arr3);

	}

}
