import unit4.collectionsLib.Stack;

public class MainAppear {

	public static Appear mostWords(Stack<Appear> s) {

		Stack<Appear> tmp = new Stack<Appear>();

		Appear tmpWord = s.top();

		int count = 0;

		int max = s.top().getCount();

		while (!s.isEmpty()) {

			if (s.top().getCount() == max)
				count++;

			else
				count = 0;

			if (s.top().getCount() > max)
				max = s.top().getCount();

			tmp.push(s.pop());
		}

		boolean flag = true;

		Appear temp;

		while (!tmp.isEmpty() && flag) {

			if (tmp.top().getCount() == max)

				if (count > 0) {
					temp = tmp.pop();

					if (!s.isEmpty())
						s.push(temp);

					else if (!tmp.isEmpty())
						s.push(temp);

					count--;
				}

				else {
					tmpWord = tmp.pop();
					flag = false;
				}
			if (!tmp.isEmpty())
				s.push(tmp.pop());
		}

		while (!tmp.isEmpty())
			s.push(tmp.pop());

		return tmpWord;

	}

	public static Stack<Appear> sortStack(Stack<Appear> s) {

		Stack<Appear> tmp = new Stack<Appear>();

		while (!s.isEmpty()) {
			tmp.push(mostWords(s));
		}

		return tmp;
	}

	public static void printStack(Stack<Appear> s) {
		Stack<Appear> tmp = new Stack<Appear>();

		while (!s.isEmpty()) {
			System.out.println(s.top());
			tmp.push(s.pop());
		}
	}

	public static void main(String[] args) {

		// A
		Stack<Appear> s = new Stack<Appear>();

		Appear a1 = new Appear("is", 6);
		s.push(a1);

		Appear a2 = new Appear("a", 1);
		s.push(a2);

		Appear a3 = new Appear("what", 4);
		s.push(a3);

		Appear a4 = new Appear("yes", 6);
		s.push(a4);

		Appear a5 = new Appear("no", 2);
		s.push(a5);

		Appear a6 = new Appear("why", 6);
		s.push(a6);

		System.out.println("//A");
		System.out.println(mostWords(s) + "\n"); // (yes:6)

		// B

		System.out.println("//B");
		Stack<Appear> tmp = sortStack(s);

		printStack(tmp);

	}

}
