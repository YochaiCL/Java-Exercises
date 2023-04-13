import unit4.collectionsLib.Stack;

public class Page_15_Ex_4 {

	public static void changeOption1(Stack<Integer> s) {

		if (s.isEmpty())
			return;

		int num = s.pop();

		changeOption1(s);

		if (num % 2 == 0)
			num++;

		s.push(num);

	}

	public static void changeOption2(Stack<Integer> s) {

		if (s.isEmpty())
			return;

		int num = s.pop();

		if (num % 2 == 0)
			num++;

		changeOption2(s);

		s.push(num);

	}

	public static void printStack(Stack<Integer> s) {
		Stack<Integer> tmp = new Stack<Integer>();

		while (!s.isEmpty()) {
			System.out.print(s.top() + " ");
			tmp.push(s.pop());
		}

		while (!tmp.isEmpty()) {
			s.push(tmp.pop());
		}
	}

	public static void main(String[] args) {

		Stack<Integer> s = new Stack<Integer>();

		s.push(8);
		s.push(5);
		s.push(-4);
		s.push(2);

		changeOption1(s);
		printStack(s);

		changeOption2(s);
		printStack(s);

	}

}
