import unit4.collectionsLib.Stack;

public class Page_15_Ex_2 {

	public static int countX(Stack<Integer> s, int x) {

		if (s.isEmpty())
			return 0;

		int count = s.pop() == x ? 1 : 0;

		return count + countX(s, x);
	}

	public static void main(String[] args) {

	}

}
