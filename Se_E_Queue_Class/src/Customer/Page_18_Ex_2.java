package Customer;

import unit4.collectionsLib.Queue;

public class Page_18_Ex_2 {

	public static void revars(Queue<Integer> s) {

		if (s.isEmpty())
			return;

		int num = s.remove();

		revars(s);
		s.insert(num);
	}

	public static void main(String[] args) {

		Queue<Integer> s = new Queue<Integer>();

		s.insert(1);
		s.insert(2);
		s.insert(3);
		s.insert(4);
		s.insert(5);
		s.insert(6);

		System.out.println(s); // [1,2,3,4,5,6]

		revars(s);

		System.out.println(s); // [6,5,4,3,2,1]
	}
}