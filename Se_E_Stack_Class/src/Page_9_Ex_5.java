import unit4.collectionsLib.Stack;

public class Page_9_Ex_5 {

	public static boolean checkOpenBracket(char ch) {

		return ch == '{' || ch == '[' || ch == '(';
	}

	public static boolean checkCloseBraket(char ch) {

		return ch == '}' || ch == ']' || ch == ')';
	}

	public static boolean ifPair(char ch1, char ch2) {

		return ((ch1 == '(' && ch2 == ')') || (ch1 == '{' && ch2 == '}') || (ch1 == '[' && ch2 == ']'));
	}

	public static void main(String[] args) {

		Stack<Character> s = new Stack<Character>();

		String str = "{(a+b)+c}*[2*{5-a}]";

		int i;
		char ch;
		boolean flag = true;

		for (i = 0; i < str.length() && flag; i++) {

			if (checkOpenBracket(str.charAt(i)))

				s.push(str.charAt(i));

			else if (checkCloseBraket(str.charAt(i))) {

				if (!s.isEmpty()) {
					ch = s.pop();
					flag = ifPair(ch, str.charAt(i));
				}

				else
					flag = false;
			}
		}

		if (flag && s.isEmpty())
			System.out.println("GOOD");

		else
			System.out.println("NOT GOOD");

	}

}
