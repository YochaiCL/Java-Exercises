import java.util.Scanner;

import unit4.collectionsLib.Node;

/*
 * מגישים:
 * יוחאי חן לוי 
 * דוד ידוובסקי
 */

public class Ex_34 {
	// Time complixity is O(n) - becuse we are running "copyLIstOriginal" function
	// in the worst time comlexity scenerio

	/**
	 * Description: This function create new String list
	 * 
	 * @return: New list
	 */
	// Time complixity is O(1) - becuse we are entering new node values in knowing
	// fixed size of a list
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

	/**
	 * Description: This function print the list
	 * 
	 * @param h: List of String numbers
	 */
	// Time complixity is O(n) - becuse we are printing the values of the whole
	// list.
	public static void printList(Node<String> h) {

		Node<String> tmp = null;

		for (tmp = h; tmp != null; tmp = tmp.getNext())
			System.out.print(tmp.getValue() + "->");
		System.out.println("||");
	}

	/**
	 * Description: This function copy the original list to a new list in reverse
	 * 
	 * @param h: List of Strings
	 * @return: List of Strings in mirror look to the original list
	 */
	// Time complixity is O(n) - becuse we are running through the entaire linked
	// list copy for new revers list
	public static Node<String> copyLIstReverse(Node<String> h) { // aa->bb->cc->dd->||
		Node<String> newLIst = null;
		Node<String> tmp = null;
		Node<String> newNode = null;

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

	/**
	 * Description: This function create exact look of the original list
	 * 
	 * @param h: List of Strings
	 * @return: :list of String look exactly like the original list
	 */
	// Time complixity is O(n) - becuse we are running through the entaire linked
	// list copy for new original list
	public static Node<String> copyLIstOriginal(Node<String> h) { // dd->cc->bb->aa->||

		Node<String> tmp = null;
		Node<String> newNode = null;
		Node<String> newLIst = null;

		if (h == null)
			return newLIst;

		while (h != null) {

			if (newLIst == null) {
				newLIst = new Node<String>(h.getValue());
				tmp = newLIst;
				h = h.getNext();

			} else {
				newNode = new Node<String>(h.getValue());
				tmp.setNext(newNode);
				tmp = tmp.getNext();
				h = h.getNext();
			}
		}
		return newLIst;
	}

	public static void main(String[] args) {

		Node<String> h = null;
		Node<String> copy = null;

		h = creatListHead();

		System.out.println("Original list:");
		printList(h);

		copy = copyLIstOriginal(h);

		System.out.println("Copyied list:");
		printList(copy);

	}

}
