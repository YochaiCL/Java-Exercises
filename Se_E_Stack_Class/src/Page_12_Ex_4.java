import unit4.collectionsLib.Stack;

public class Page_12_Ex_4 {

	// Complicity is o(n)
	public static boolean numIsInStack(Stack<Integer> s, int k) {

		Stack<Integer> tmp = new Stack<Integer>();

		boolean result = false;

		while (!s.isEmpty() && !result) {

			tmp.push(s.pop());

			if (tmp.top() == k)
				result = true;
		}
		while (!tmp.isEmpty())

			s.push(tmp.pop());

		return result;
	}

	public static void main(String[] args) {

		Stack<Integer> s = new Stack<Integer>();

		int[] arr = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < arr.length; i++)

			s.push(arr[i]);

		int k = 3;

		System.out.println(numIsInStack(s, k));

		// true

		k = 7;

		System.out.println(numIsInStack(s, k));

		// false
	}
}
