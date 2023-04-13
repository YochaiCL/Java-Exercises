package Ex_27;

import unit4.collectionsLib.Queue;
import unit4.collectionsLib.Stack;

public class Ex_2 {

	public static void sod1(Queue<Integer> qu, Stack<Integer> st) {

		if (!(qu.isEmpty())) {
			int x = qu.remove();
			sod1(qu, st);
			st.push(x);
			qu.insert(x);
		}
	}

	public static void sod2(Queue<Integer> qu, Stack<Integer> st) {

		if (!(qu.isEmpty())) {
			int x = qu.remove();
			sod2(qu, st);
			int y = st.pop();
			qu.insert(x + y);
		}
	}

	public static void main(String[] args) {

		Queue<Integer> myQueue = new Queue<Integer>();

		myQueue.insert(4);
		myQueue.insert(3);
		myQueue.insert(1);
		myQueue.insert(8);
		myQueue.insert(9);

		Stack<Integer> myStack = new Stack<Integer>();

		sod1(myQueue, myStack);

		System.out.println(myQueue);
		System.out.println(myStack);

		sod2(myQueue, myStack);

		System.out.println(myQueue);
		System.out.println(myStack);

	}

}
