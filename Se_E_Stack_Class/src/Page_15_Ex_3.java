import unit4.collectionsLib.Stack;

public class Page_15_Ex_3 {

	public static boolean isHave(Stack<Integer> s, int x) {

		if (s.isEmpty())
			return false;

		if (s.pop() == x)
			return true;

		else
			return isHave(s, x);
	}

	public static void main(String[] args) {

	}

}
