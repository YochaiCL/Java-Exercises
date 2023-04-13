import unit4.collectionsLib.Node;

public class Ex_10 {

	// create a list from start to tail
	public static Node<String> creatListHead() {

		Node<String> h = null;

		for (int i = 0; i < 5; i++)
			// create the first value in the list
			if (h == null)
				h = new Node<String>("ab");
			else
				// create new list connect to the first list
				h = new Node<String>("cd", h);

		return h;
	}

	// print the list
	public static void printList(Node<String> h) {

		Node<String> tmp = null;

		for (tmp = h; tmp != null; tmp = tmp.getNext())
			System.out.print(tmp.getValue() + "->");
		System.out.println("||");
	}

	public static Node<String> mergeList1(Node<String> h1, Node<String> h2) {

		Node<String> newList = null;
		Node<String> tmp1 = h1;
		Node<String> tmp2 = h2;
		Node<String> tmpNew;

		if (h1 != null && h2 != null) {
			newList = new Node<String>(h1.getValue());
			tmp1 = h1.getNext();
		} else {
			newList = new Node<String>(h2.getValue());
			tmp2 = h2.getNext();
		}

		tmpNew = newList;

		while (tmp1 != null && tmp2 != null) {
			if (tmp1.getValue().compareTo(tmp2.getValue()) < 0) {
				tmpNew.setNext(new Node<String>(tmp1.getValue()));
				tmp1 = tmp1.getNext();
			}

			else {
				tmpNew.setNext(new Node<String>(tmp2.getValue()));
				tmp2 = tmp2.getNext();
			}
		}

		while (tmp1 != null) {
			tmpNew.setNext(new Node<String>(tmp1.getValue()));
			tmp1 = tmp1.getNext();
			tmpNew = tmpNew.getNext();
		}

		while (tmp2 != null) {
			tmpNew.setNext(new Node<String>(tmp2.getValue()));
			tmp2 = tmp2.getNext();
			tmpNew = tmpNew.getNext();
		}

		return newList;
	}

	public static Node<String> mergeList2(Node<String> h1, Node<String> h2) {

		Node<String> newList = null;
		Node<String> tmp1 = h1;
		Node<String> tmp2 = h2;
		Node<String> tmpNew;

		if (h1 != null && h2 != null) {
			if (tmp1.getValue().compareTo(tmp2.getValue()) < 0) {
				tmp1 = h1.getNext();
				newList = h1;
			} else {
				tmp2 = h2.getNext();
				newList = h2;
			}

			tmpNew = newList;

			while (tmp1 != null && tmp2 != null) {
				if (tmp1.getValue().compareTo(tmp2.getValue()) < 0) {
					tmpNew.setNext(tmp1);
					tmp1 = tmp1.getNext();
				}

				else {
					tmpNew.setNext(tmp2);
					tmp2 = tmp2.getNext();
				}
				tmpNew = tmpNew.getNext();
			}

			while (tmp1 != null) {
				tmpNew.setNext(tmp1);
				tmp1 = tmp1.getNext();
				tmpNew = tmpNew.getNext();
			}

			while (tmp2 != null) {
				tmpNew.setNext(tmp2);
				tmp2 = tmp2.getNext();
				tmpNew = tmpNew.getNext();
			}

		}
		return newList;
	}

	public static void main(String[] args) {

		Node<String> s1 = null;
		Node<String> s2 = null;
		s1 = creatListHead();
		s2 = creatListHead();

		printList(s1);
		printList(s2 );
		
		Node<String> s3=mergeList1(s1, s2);
		
		printList(s3);

	}

}
