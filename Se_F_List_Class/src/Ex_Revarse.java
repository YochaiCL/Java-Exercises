import unit4.collectionsLib.Node;

// Targil change the list to revars list

public class Ex_Revarse {
	
	// Time complecity O(n) becuse we run over the list only one time

	public static Node<Integer> revares(Node<Integer> h) {

		Node<Integer> h1 = h;

		Node<Integer> tmp = null;

		Node<Integer> t1 = null;

		if (h != null)
			tmp = h.getNext();

		h1.setNext(null);

		while (tmp != null) {
			t1 = tmp.getNext();
			tmp.setNext(h1);
			h1 = tmp;
			tmp = t1;
		}

		return h1;

	}

	public static void printList(Node<Integer> h) {

		Node<Integer> tmp = null;

		for (tmp = h; tmp != null; tmp = tmp.getNext())

			System.out.print(tmp.getValue() + "->");

		System.out.println("||");
	}

	public static void main(String[] args) {
		Node<Integer> l = new Node<Integer>(10);

		l = new Node<Integer>(6, l);

		l = new Node<Integer>(5, l);

		l = new Node<Integer>(3, l);

		l = new Node<Integer>(1, l);

		printList(l);
		
		Node <Integer> result=revares(l);
		
		
		printList(result);

	}

}
