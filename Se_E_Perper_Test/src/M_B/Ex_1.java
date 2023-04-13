package M_B;

import unit4.collectionsLib.Stack;

public class Ex_1 {

	public static void changeStack(Stack<Integer> s1, Stack<Integer> s2) {

		Stack<Integer> tmp = new Stack<Integer>();

		while (!s1.isEmpty() && !s2.isEmpty()) {

			if (s1.top() > s2.top())
				tmp.push(s2.pop());
			else
				tmp.push(s1.pop());
		}

		while (!s1.isEmpty())
			tmp.push(s1.pop());

		while (!s2.isEmpty())
			tmp.push(s2.pop());

		while (!tmp.isEmpty()) {
			if (tmp.top() % 2 == 0)
				s1.push(tmp.pop());

			else if (tmp.top() % 2 == 1)
				s2.push(tmp.pop());
		}

	}

	public static void main(String[] args) {

		Stack<Integer> s1 = new Stack<Integer>();
		Stack<Integer> s2 = new Stack<Integer>();

		s1.push(25);
		s1.push(21);
		s1.push(19);
		s1.push(17);
		s1.push(15);
		s1.push(9);
		s1.push(4);
		s1.push(2);

		s2.push(12);
		s2.push(11);
		s2.push(10);
		s2.push(7);
		s2.push(5);
		s2.push(1);

		System.out.println(s1); //[2,4,9,15,17,19,21,25]
		System.out.println(s2); //[1,5,7,10,11,12]

		changeStack(s1, s2);

		System.out.println(s1); //[2,4,10,12]
		System.out.println(s2); //[1,5,7,9,11,15,17,19,21,25]


	}

}
