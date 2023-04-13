
package Customer;

import unit4.collectionsLib.Queue;

//After working on the queue, the queue will not return to normal because it is fifo
public class Page_18_Ex_1 {
	public static int count(Queue<Character> s) {

		if (s.isEmpty())
			return 0;

		s.remove();
		return count(s) + 1;
	}

	public static void main(String[] args) {
		Queue<Character> s = new Queue<Character>();

		s.insert('1');
		s.insert('2');
		s.insert('3');
		s.insert('4');
		s.insert('5');
		s.insert('6');

		System.out.println(count(s)); // 6
	}
}
