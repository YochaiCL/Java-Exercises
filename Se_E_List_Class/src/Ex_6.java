import unit4.collectionsLib.Node;

public class Ex_6 {

	public static void printList(Node<Double> h) {

		Node<Double> tmp = null;

		for (tmp = h; tmp != null; tmp = tmp.getNext())
			System.out.print(tmp.getValue() + "->");
		System.out.println("||");
	}

	public static void delNumFromList(Node<Double> h, double num) {
		Node<Double> t1 = h;
		if (t1.getValue() == num) {
			while (t1.getNext().getValue() == num) {
				t1 = t1.getNext();
			}
			h.setValue(t1.getNext().getValue());
			t1 = t1.getNext();
		}

		for (t1 = t1.getNext(); t1 != null; t1 = t1.getNext()) {
			if (t1.getValue() != num) {
				h.setNext(t1);
				h = h.getNext();
			}
		}
		h.setNext(null);
	}

	public static void main(String[] args) {

		

		Node<Double> l = new Node<Double>(3.5);
		l = new Node<Double>(2.1, l);
		l = new Node<Double>(3.5, l);
		l = new Node<Double>(3.5, l);
		l = new Node<Double>(7.1, l);
		l = new Node<Double>(3.5, l);
		l = new Node<Double>(2.1, l);
		l = new Node<Double>(3.5, l);
		l = new Node<Double>(3.5, l);

		printList(l);
		delNumFromList(l, 3.5);
		printList(l);

	}

}
