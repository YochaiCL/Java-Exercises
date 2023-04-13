import unit4.collectionsLib.Stack;

public class Page_12_Ex_6 {
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

		Stack<Integer> tmp = new Stack<Integer>();

		while (!s1.isEmpty() && result) {

			tmp.push(s1.pop());

			result = numIsInStack(s2, tmp.top());
		}

		while (!tmp.isEmpty())
			s1.push(tmp.pop());

		return result;
	}

	public static boolean sameStack(Stack<Integer> s1, Stack<Integer> s2) {

		return equalStack(s1, s2);
	}

	public static void main(String[] args) {

		Stack<Integer> s1 = new Stack<Integer>();

		Stack<Integer> s2 = new Stack<Integer>();

		s1.push(1);
		s1.push(2);
		s1.push(3);
		s1.push(4);
		s1.push(5);

		s2.push(5);
		s2.push(4);
		s2.push(3);
		s2.push(2);
		s2.push(1);

		System.out.println(sameStack(s1, s2));
	}
}
