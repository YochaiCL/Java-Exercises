
public class Ex_10 {

	public static boolean shaveMehalek(int[] arr) {

		boolean flag = true;

		if (arr.length % 2 == 0)

			for (int i = 0; i < arr.length / 2 && flag; i++) {

				boolean check = false;

				for (int j = arr.length / 2; j < arr.length && !check; j++)

					if ((mehalek(arr[i], arr[j])) == true)
						check = true;

				if (check == false)
					flag = false;
			}

		else
			return false;

		return flag;
	}

	public static boolean mehalek(int num1, int num2) {

		int countNum1 = 0, countNum2 = 0;

		for (int i = num1; i > 0; i--) {
			if (num1 % i == 0)
				countNum1++;
		}

		for (int i = num2; i > 0; i--) {
			if (num2 % i == 0)
				countNum2++;
		}

		return countNum1 == countNum2;

	}

	public static void main(String[] args) {

		int[] arr1 = { 3, 4, 7, 7, 8, 5, 9, 5, 2, 6 };
		
		int [] arr2=  { 3, 4, 7, 7, 8, 5, 9, 5, 2, 0 };

		System.out.println(shaveMehalek(arr1));
		
		System.out.println(shaveMehalek(arr2));

	}

}
