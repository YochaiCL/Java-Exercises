import unit4.collectionsLib.Node;

/*
 * מגישים:
 * יוחאי חן לוי 
 * דוד ידוובסקי
 */

public class Ex_36 {

	// Time complixity is O(n) - becuse of the worst time scenerio is of the
	// function "printList"

	/**
	 * Description: This function print the list
	 * 
	 * @param h: List of Integer numbers
	 */

	// Time complixity is O(n) - becuse we are printing the values of the whole
	// list.

	public static void printList(Node<Integer> h) {

		Node<Integer> tmp = null;

		for (tmp = h; tmp != null; tmp = tmp.getNext())
			System.out.print(tmp.getValue() + "->");
		System.out.println("||");
	}

	/**
	 * Description: This function add a number to the start of list
	 * 
	 * @param h:   List of integer numbers
	 * @param num: Integer number
	 * @return: the list after adding the number
	 */
	// Time complixity is O(1) - becuse we are adding number in the start of the
	// list

	public static Node<Integer> addToFirst(Node<Integer> h, int num) {

		Node<Integer> newList = new Node<Integer>(num);

		if (h.getValue() == null) {
			h = newList;
			return h;
		}

		h = new Node<Integer>(num, h);

		return h;

	}

	public static void main(String[] args) {

		Node<Integer> l = new Node<Integer>(5);

		l = new Node<Integer>(2, l);

		l = new Node<Integer>(6, l);

		l = new Node<Integer>(7, l);

		l = new Node<Integer>(9, l);

		printList(l);

		Node<Integer> listAfterChange = addToFirst(l, 4);

		printList(listAfterChange);
	}

}
