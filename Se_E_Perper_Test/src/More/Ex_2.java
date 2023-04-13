package More;

import unit4.collectionsLib.Queue;

public class Ex_2 {

	public static Queue<Integer> moreThen2(Queue<Integer> q) {

		Queue<Integer> tmp = new Queue<Integer>();
		Queue<Integer> result = new Queue<Integer>();

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++)
			arr[i] = 0;

		while (!q.isEmpty()) {
			int num = q.head();

			arr[num]++;

			tmp.insert(q.remove());
		}

		for (int i = 0; i < arr.length; i++)
			if (arr[i] > 2)
				result.insert(i);

		return result;
	}

	public static void main(String[] args) {

		Queue<Integer> q = new Queue<Integer>();

		q.insert(2);
		q.insert(5);
		q.insert(5);
		q.insert(7);
		q.insert(2);
		q.insert(4);
		q.insert(1);
		q.insert(3);
		q.insert(2);
		q.insert(5);
		q.insert(5);
		q.insert(1);
		
		System.out.println(moreThen2(q));

	}

}
