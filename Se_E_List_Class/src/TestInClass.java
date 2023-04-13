import unit4.collectionsLib.Node;

public class TestInClass {

	// create a list from start to tail
	public static Node<Integer> creatListHead() {

		Node<Integer> h = null;

		for (int i = 0; i < 5; i++)
			// create the first value in the list
			if (h == null)
				h = new Node<Integer>(i + 1);
			else
				// create new list connect to the first list
				h = new Node<Integer>(i + 1, h);

		return h;
	}

	// create a list from tail to tail
	public static Node<Integer> createListTail() {
		Node<Integer> h = null;
		Node<Integer> tmp = null;
		Node<Integer> newNode = null;

		for (int i = 0; i < 5; i++) {
			// creat the first value in the list
			if (h == null) {
				h = new Node<Integer>(i + 1);
				tmp = h;
			} else {
				// creat new list wite value
				newNode = new Node<Integer>(i + 1);
				// set the list is location
				tmp.setNext(newNode);
				// save tmp as the newNode
				tmp = tmp.getNext();
			}

		}
		return h;
	}

	// print the list
	public static void printList(Node<Integer> h) {

		Node<Integer> tmp = null;

		for (tmp = h; tmp != null; tmp = tmp.getNext())
			System.out.print(tmp.getValue() + "->");
		System.out.println("||");
	}

	// sum elennt in the list
	public static int sumList(Node<Integer> h) {

		Node<Integer> tmp = null;

		int sum = 0;

		for (tmp = h; tmp != null; tmp = tmp.getNext())
			sum += tmp.getValue();

		return sum;
	}

	// how much el in the list
	public static int countElInLIst(Node<Integer> l) {

		Node<Integer> tmp = null;

		int countEl = 0;

		for (tmp = l; tmp != null; tmp = tmp.getNext())
			countEl += 1;

		return countEl;

	}

	// search value in the list
	public static Node<Integer> searchOfValue(Node<Integer> l, int x) {

		Node<Integer> tmp = null;

		for (tmp = l; tmp != null; tmp = tmp.getNext())
			if (tmp.getValue() == x)
				return tmp;

		return null;

	}

	// amount of even value in the list
	public static int amountEvenValue(Node<Integer> l) {

		Node<Integer> tmp = null;

		int countEvenEl = 0;

		for (tmp = l; tmp != null; tmp = tmp.getNext())
			if (tmp.getValue() % 2 == 0)
				countEvenEl++;

		return countEvenEl;

	}

	// add number to sorted list
	public static Node<Integer> addXtoList(Node<Integer> l, int x) {

		Node<Integer> tmp = null;
		Node<Integer> newNode = null;

		if (l == null || l.getValue() < x) {
			tmp = new Node(x, l);
			l = tmp;
		}

		else {
			for (tmp = l; tmp.getNext() != null && tmp.getNext().getValue() > x;)
				tmp = tmp.getNext();

			newNode = new Node(x);
			newNode.setNext(tmp.getNext());
			tmp.setNext(newNode);

		}

		return l;

	}

	public static void main(String[] args) {

		Node<Integer> h = null;

		h = creatListHead();

		printList(h);

		Node<Integer> t = null;

		t = createListTail();

		printList(t);

		System.out.println("The sum is: " + sumList(h));

		System.out.println("The number of element in list " + countElInLIst(t));
		System.out.println("The amount of even number in the list " + amountEvenValue(t));

		System.out.println("The refarance is: " + searchOfValue(t, 5));

		Node<Integer> addH = h;

		addH = addXtoList(addH, 3);

		printList(addH);
		
		
		// to activate need to change the 2 arrow in function
		
		Node<Integer> addT = t;

		addT = addXtoList(addT, 3);

		printList(addT);


	}

}
