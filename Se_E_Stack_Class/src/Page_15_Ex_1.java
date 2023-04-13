import unit4.collectionsLib.Stack;

public class Page_15_Ex_1 {

	public static int sumStack(Stack<Integer> s) {

		if (s.isEmpty())
			return 0;

		int num = s.pop();

		return num + sumStack(s);
	}

	public static void main(String[] args) {

	}

}
