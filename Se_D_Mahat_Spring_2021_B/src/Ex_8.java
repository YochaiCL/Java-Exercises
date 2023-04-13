
public class Ex_8 {

	// הפונקציה מחפשת מספר שגדול מ 2 מספרים וקטן מ 2 מספרים אחרת תחזיר -1
	public static int what(int[] arr) {
		int up, down;
		for (int i = 0; i < arr.length; i++) {
			up = 0;
			down = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] > arr[j])
					down++;
				if (arr[j] > arr[i])
					up++;
			}
			if (up == down)
				return arr[i];
		}

		return -1;
	}

	public static void main(String[] args) {

		int[] arr = { 5, 2, 10, 6, 12 };

		System.out.println(what(arr));

	}

}
