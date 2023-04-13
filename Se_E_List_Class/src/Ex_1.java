
import unit4.collectionsLib.Node;

public class Ex_1 {

	public static Node<Integer> creatListHead() {

		Node<Integer> h = null;

		for (int i = 0; i < 4; i++) {

			// create the first value in the list
			if (h == null)
				h = new Node<Integer>(i + 1);
			else
				// create new list connect to the first list
				h = new Node<Integer>(i + 1, h);

		}
		return h;
	}

	public static void printList(Node<Integer> h) {

		Node<Integer> tmp = null;

		for (tmp = h; tmp != null; tmp = tmp.getNext())
			System.out.print(tmp.getValue() + "->");
		System.out.println("||");
	}

	public static void main(String[] args) {

		Node<Integer> h = null;

		h = creatListHead();

		printList(h);
	}
}
