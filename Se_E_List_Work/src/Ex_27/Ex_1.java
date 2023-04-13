package Ex_27;

import unit4.collectionsLib.Queue;
import unit4.collectionsLib.Stack;

public class Ex_1 {

	public static int sum(Stack<Integer> s) {

		if (s.isEmpty())
			return 0;

		int x = s.pop();

		if (x % 6 == 0)
			return x + sum(s);

		return sum(s);
	}

	public static void sod(Queue<Stack<Integer>> qq, Queue<Integer> qm) {

		if (!qq.isEmpty()) {
			int x = sum(qq.remove());
			qm.insert(x);
			sod(qq, qm);
		}
	}

	public static void main(String[] args) {

		Stack<Integer> s1 = new Stack<Integer>();
		Stack<Integer> s2 = new Stack<Integer>();
		Queue<Stack<Integer>> q1 = new Queue<Stack<Integer>>();

		s1.push(0);
		s1.push(30);
		s1.push(6);
		s1.push(33);
		s1.push(4);
		s1.push(12);
		s2.push(23);
		s2.push(36);
		s2.push(1);
		q1.insert(s1);
		q1.insert(s2);

		Queue<Integer> qr = new Queue<Integer>();

		sod(q1, qr);
		
		System.out.println(qr);

	}

}
