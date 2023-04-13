import unit4.collectionsLib.Queue;

/*
 * מגישים:
 * יוחאי חן לוי 
 * דוד ידוובסקי
 */

public class Ex_24 {

	/**
	 * Description: This function sum all numbers in Queue
	 * 
	 * @param s - Queue of Integers numbners
	 * @return - Sum of Queue numbers
	 */

	// time comlixcity O(n) - becuse we run in all queue with while
	public static int sum(Queue<Integer> s) {

		int sum = 0;

		while (!s.isEmpty())
			sum += s.remove();

		return sum;
	}

	public static void main(String[] args) {

		Queue<Integer> s = new Queue<Integer>();

		int[] arr = { 1, 2, 3, 4 };

		for (int i = 0; i < arr.length; i++)
			s.insert(arr[i]);

		System.out.println(sum(s));

	}

}
