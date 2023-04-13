import unit4.collectionsLib.Queue;

/*
 * מגישים:
 * יוחאי חן לוי 
 * דוד ידוובסקי
 */

public class Ex_26 {

	/**
	 * Description: This Function sorts the queue by dictionary value
	 * 
	 * @param s - Queue of strings
	 */

	// Time complexity O(max{n*m}) - if tmp1 is of size O(m) and tmp2 is of size
	// O(n)

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

	/**
	 * Description: This function receives 2 sorted queues and joins them into one
	 * sorted queue
	 * 
	 * @param s1 - sorted queue
	 * @param s2 - sorted queue
	 * @return - sorted queue of s1 and s2
	 */
	public static Queue<String> sortTwoQueue(Queue<String> s1, Queue<String> s2) {

		Queue<String> s = new Queue<String>();

		while (!s1.isEmpty())
			s.insert(s1.remove());

		while (!s2.isEmpty())
			s.insert(s2.remove());

		abc(s);

		return s;

	}

	public static void print(Queue<String> s) {
		while (!s.isEmpty())
			System.out.print(s.remove() + " ");
	}

	public static void main(String[] args) {

		Queue<String> s1 = new Queue<String>();

		Queue<String> s2 = new Queue<String>();

		String[] arr1 = { "Golan", "yyy", "Gomaz", "Gil" };

		String[] arr2 = { "Eyal", "Evyater", "Eli", "Eliran" };

		for (int i = 0; i < arr1.length; i++)
			s1.insert(arr1[i]);

		for (int i = 0; i < arr2.length; i++)
			s2.insert(arr2[i]);

		abc(s1);

		abc(s2);

		Queue<String> result = sortTwoQueue(s1, s2);

		print(result);

	}

}
