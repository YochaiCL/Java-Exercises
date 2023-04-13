package M_A;

import unit4.collectionsLib.Node;

public class Ex_2 {

	public static void printList(Node<Integer> h) {

		Node<Integer> tmp = null;

		for (tmp = h; tmp != null; tmp = tmp.getNext())
			System.out.print(tmp.getValue() + "->");
		System.out.println("||");
	}

	public static void delNumFromList(Node<Integer> h) {
		Node<Integer> t1 = h;
		if (t1.getValue() % 2 == 0) {
			while (t1.getNext().getValue() % 2 == 0) {
				t1 = t1.getNext();
			}
			h.setValue(t1.getNext().getValue());
			t1 = t1.getNext();
		}

		for (t1 = t1.getNext(); t1 != null; t1 = t1.getNext()) {
			if (t1.getValue() % 2 == 1) {
				h.setNext(t1);
				h = h.getNext();
			}
		}
		h.setNext(null);
	}

	public static void main(String[] args) {

		Node<Integer> l = new Node<Integer>(3);
		
		l = new Node<Integer>(2, l);
		l = new Node<Integer>(3, l);
		l = new Node<Integer>(3, l);
		l = new Node<Integer>(7, l);
		l = new Node<Integer>(3, l);
		l = new Node<Integer>(2, l);
		l = new Node<Integer>(3, l);
		l = new Node<Integer>(3, l);

		printList(l);
		delNumFromList(l);
		printList(l);

	}

}
