import unit4.collectionsLib.Node;

public class Ex_2 {

	public static Node<Integer> creatListHead(int num) {

		Node<Integer> h = null;
		Node<Integer> tmp = null;
		Node<Integer> newNode = null;

		for (int i = 0; i < num; i++) {

			// create the first value in the list
			if (h == null) {
				h = new Node<Integer>(i + 1);
				tmp = h;
			}

			else {
				// create new list connect to the first list
				newNode = new Node<Integer>(i + 1);
				tmp.setNext(newNode);
				tmp = tmp.getNext();
			}

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

		int num = 6;

		h = creatListHead(num);

		printList(h);// 1->2->3->4->5->6->||

	}

}
