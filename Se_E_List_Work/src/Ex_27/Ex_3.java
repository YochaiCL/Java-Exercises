package Ex_27;

import unit4.collectionsLib.Queue;
import unit4.collectionsLib.Stack;

public class Ex_3 {

	public static int sod1(Queue<Integer> q) {

		int i = q.remove();
		int result = i;

		if (!(q.isEmpty())) {
			int j = sod1(q);
			if (result > j)
				result = j;
		}

		q.insert(i);
		return result;
	}

	public static int sod2(int i) {

		if (i == 0)
			return 0;

		int a = i % 10;
		int b = sod2(i / 10);

		if (a > b)
			return a;
		return b;
	}

	public static void main(String[] args) {

		Queue<Integer> myQueue = new Queue<Integer>();

		myQueue.insert(53);
		myQueue.insert(17);
		myQueue.insert(43);
		myQueue.insert(31);
		myQueue.insert(24);

		System.out.println(sod1(myQueue));
		System.out.println(myQueue);
		
		System.out.println(sod2(17852));
		
		System.out.println(sod2(sod1(myQueue)));

	}

}
