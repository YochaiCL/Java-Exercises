import java.util.Scanner;

import unit4.collectionsLib.Node;

public class Ex_8 {

	public static Node<String> creatListHead() { // dd->cc->bb->aa->||
		Scanner input = new Scanner(System.in);
		Node<String> h = null;

		for (int i = 0; i < 4; i++) {
			System.out.println("Please enter string " + (i + 1));
			// create the first value in the list
			if (h == null)
				h = new Node<String>(input.next());
			else
				// create new list connect to the first list
				h = new Node<String>(input.next(), h);

		}
		return h;
	}

	public static Node<String> copyLIst(Node<String> h) { // aa->bb->cc->dd->||
		Node<String> newLIst = null;

		if (h == null)
			return newLIst;

		while (h != null) {

			if (newLIst == null) {
				newLIst = new Node<String>(h.getValue());
				h = h.getNext();

			} else {

				newLIst = new Node<String>(h.getValue(), newLIst);

				h = h.getNext();
			}
		}
		return newLIst;
	}

	public static void printList(Node<String> h) {

		Node<String> tmp = null;

		for (tmp = h; tmp != null; tmp = tmp.getNext())
			System.out.print(tmp.getValue() + "->");
		System.out.println("||");
	}

	public static void main(String[] args) {

		Node<String> h = null;
		Node<String> copy = null;

		h = creatListHead();

		System.out.println("Original list:");
		printList(h);

		copy = copyLIst(h);

		printList(copy);

	}

}
