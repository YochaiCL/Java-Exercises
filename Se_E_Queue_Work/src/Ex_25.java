import unit4.collectionsLib.Queue;

/*
 * מגישים:
 * יוחאי חן לוי 
 * דוד ידוובסקי
 */

public class Ex_25 {

	/**
	 * Description: This Function sorts the queue by dictionary value
	 * 
	 * @param s - Queue of strings
	 */

	// Time complexity (n^2) - Because there is a loop within a loopAnd
	// And the loops are independent of each other

	public static void abc(Queue<String> s) {

		Queue<String> tmp1 = new Queue<String>();
		Queue<String> tmp2 = new Queue<String>();
		tmp1.insert(s.remove());

		while (!s.isEmpty()) {
			while (!tmp1.isEmpty() && s.head().compareTo(tmp1.head()) >= 0)

				tmp2.insert(tmp1.remove());

			tmp2.insert(s.remove());

			while (!tmp1.isEmpty())
				tmp2.insert(tmp1.remove());

			while (!tmp2.isEmpty())
				tmp1.insert(tmp2.remove());

		}

		while (!tmp1.isEmpty())
			s.insert(tmp1.remove());

	}

	public static void print(Queue<String> s) {
		while (!s.isEmpty())
			System.out.print(s.remove() + " ");
	}

	public static void main(String[] args) {

		Queue<String> s = new Queue<String>();

		String[] arr = { "abcd", "ggg", "abc", "hij", "klm" };

		for (int i = 0; i < arr.length; i++)
			s.insert(arr[i]);

		abc(s);
		print(s);
	}

}
