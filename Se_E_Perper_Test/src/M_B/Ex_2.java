package M_B;

import unit4.collectionsLib.Node;

public class Ex_2 {

	public static Node<Integer> change(Node<Integer> h) {

		Node<Integer> prev_ptr, ptr, next_ptr, new_h;

		prev_ptr = null;
		ptr = h;
		next_ptr = ptr.getNext();

		while (next_ptr != null) {
			ptr.setNext(prev_ptr);
			prev_ptr = ptr;
			ptr = next_ptr;
			next_ptr = ptr.getNext();
		}

		new_h = prev_ptr;

		return new_h;
	}

	public static void ex1(Node<Integer> head) {

		Node<Integer> tmp = head;

		for (; tmp != null; tmp = tmp.getNext())
			System.out.print(tmp + " ");
		System.out.println();
	}

	public static void main(String[] args) {

		Node<Integer> head = null;

		head = new Node<Integer>(34);
		head = new Node<Integer>(6, head);
		head = new Node<Integer>(5, head);
		head = new Node<Integer>(8, head);
		head = new Node<Integer>(6, head);
		head = new Node<Integer>(14, head);
		head = new Node<Integer>(8, head);

		ex1(head);

		head = change(head);
		ex1(head);

	}

}
