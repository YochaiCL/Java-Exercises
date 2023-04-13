import unit4.collectionsLib.Stack;

public class Main_TwoItems {

	public static int lastAndRemove(Stack<Integer> s) {

		Stack<Integer> tmp = new Stack<Integer>();

		while (!s.isEmpty())
			tmp.push(s.pop());

		int lastNumber = tmp.pop();

		while (!tmp.isEmpty())
			s.push(tmp.pop());

		return lastNumber;
	}

	public static Stack<TwoItems> stackTwoItems(Stack<Integer> stk1) {
		Stack<TwoItems> s = new Stack<TwoItems>();

		while (!stk1.isEmpty()) {
			int bottom = lastAndRemove(stk1);
			int top = stk1.pop();
			TwoItems ss = new TwoItems(top, bottom);
			s.push(ss);
		}

		return s;
	}

	public static void main(String[] args) {

		Stack<Integer> s = new Stack<Integer>();

		int[] arr = { 5, 6, 7, 1 };

		if (arr.length % 2 == 0) {
			for (int i = 0; i < arr.length; i++)
				s.push(arr[i]);
		}

		stackTwoItems(s);

	}

}
