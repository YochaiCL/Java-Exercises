import unit4.collectionsLib.Stack;

public class Page_12_Ex_5 {

	// Complicity is o(n)
	// From Page_12_Ex_4
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

	// Complicity is O(n*m) - For each element in stack S2 we go through the entire
	// stack of S1
	public static boolean equalStack(Stack<Integer> s1, Stack<Integer> s2) {

		boolean result = true;

		while (!s2.isEmpty() && result)

			result = numIsInStack(s2, s1.pop());

		return result;
	}

	public static void main(String[] args) {

		Stack<Integer> s1 = new Stack<Integer>();

		Stack<Integer> s2 = new Stack<Integer>();

		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 6, 2, 3, 4, 5 };

		for (int i = 0; i < arr1.length; i++)

			s1.push(arr1[i]);

		for (int i = 0; i < arr2.length; i++)

			s2.push(arr2[i]);

		System.out.println(equalStack(s1, s2));
	}
}
