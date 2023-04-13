import unit4.collectionsLib.Node;
import java.util.Scanner;

public class Ex_9 {
	// create a list from start to tail
	public static Node<String> creatListHead(int amount) {

		Scanner input = new Scanner(System.in);

		Node<String> h = null;

		for (int i = 0; i < amount; i++)

			// create the first value in the list
			if (h == null) {
				System.out.println("please enter String number " + (i + 1));
				h = new Node<String>(input.next());
			} else {
				System.out.println("please enter String number " + (i + 1));
				h = new Node<String>(input.next(), h);
			}
		// create new list connect to the first list

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

		if (h1 != null) {
			newList = new Node<String>(h1.getValue());
			tmp1 = h1.getNext();
		} else {
			newList = new Node<String>(h2.getValue());
			tmp2 = h2.getNext();
		}

		tmpNew = newList;

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

		if (h1 != null) {

			tmp1 = h1.getNext();
			newList = h1;
		} else {
			tmp2 = h2.getNext();
			newList = h2;
		}

		tmpNew = newList;

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

		return newList;

	}

	public static void main(String[] args) {

		Node<String> s1 = null;
		Node<String> s2 = null;
		s1 = creatListHead(3); // cc->bb->aa->||
		s2 = creatListHead(1); // dd->||

		printList(s1);
		printList(s2);

		Node<String> s3 = mergeList1(s1, s2); // cc->bb->aa->dd->||

		System.out.println("without disraction");
		printList(s3);

		Node<String> s4 = mergeList2(s1, s2); // cc->bb->aa->dd->||

		System.out.println("with disraction");
		printList(s4);

	}

}
