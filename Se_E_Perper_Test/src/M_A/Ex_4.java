package M_A;

import unit4.collectionsLib.Stack;

public class Ex_4 {

	public static int func(Stack<String> s1) {
		int res = 0;
		int num = 0;
		String str = "";

		while (!s1.isEmpty()) {
			str = s1.pop();
			num += str.charAt(0) - '0';
			res = res * 10 + (str.charAt(0) - '0');
		}

		if (!(num % 3 != 0))
			System.out.println("Yes!");
		else
			System.out.println("No!");

		return res;
	}

	public static void main(String[] args) {

		Stack<String> s1 = new <String>Stack();

		s1.push("2");
		s1.push("5");
		s1.push("7");
		s1.push("3");
		s1.push("1");

		System.out.println(func(s1));

	}

}
