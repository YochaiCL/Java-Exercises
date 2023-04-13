import unit4.collectionsLib.Node;

/*
 * מגישים:
 * יוחאי חן לוי 
 * דוד ידוובסקי
 */

public class Ex_39 {

	// Time complixity is O(n^2) - becuse of the worst time scenerio is of the
	// function "withoutDuplicateRezef"

	/**
	 * Description: This funcrion get original list with duplicate character and
	 * return list withote the duplicate rezrf
	 * 
	 * @param h - List with duplicate rezef of characthrs
	 * @return - Lits without Duplicate charcters
	 */

	// Time complixity is O(n^2) - becuse we are running the the whole
	// list and running with another while to the last value in the list

	public static Node<Character> withoutDuplicateRezef(Node<Character> h) {

		Node<Character> tmp = h;

		Node<Character> newList = new Node<Character>(null);

		if (tmp != null)
			newList = new Node<Character>(tmp.getValue());

		while (tmp.getNext() != null) {

			if (tmp.getValue() == tmp.getNext().getValue())
				tmp = tmp.getNext();

			else {
				tmp = tmp.getNext();

				newList = addCharacter(newList, tmp.getValue());

			}

		}

		return newList;
	}

	/**
	 * Description: This funcrion add new list to original list
	 * 
	 * @param h  - Original list
	 * @param ch - Character to add
	 * @return List after adding character
	 */

	// Time complixity is O(n) - becuse we are searchig the last values of the whole
	// list.

	public static Node<Character> addCharacter(Node<Character> h, char ch) {

		Node<Character> tmp = h;

		Node<Character> newList = new Node<Character>(ch);

		while (tmp.getNext() != null) {
			tmp = tmp.getNext();
		}

		tmp.setNext(newList);

		return h;
	}

	/**
	 * Description: This function print the list
	 * 
	 * @param h: List of Integer numbers
	 */

	// Time complixity is O(n) - becuse we are printing the values of the whole
	// list.

	public static void printList(Node<Character> h) {

		Node<Character> tmp = null;

		for (tmp = h; tmp != null; tmp = tmp.getNext())

			System.out.print(tmp.getValue() + "->");

		System.out.println("||");
	}

	public static void main(String[] args) {

		Node<Character> l = new Node<Character>('k');

		l = addCharacter(l, 'k');

		l = addCharacter(l, 'k');

		l = addCharacter(l, 'b');

		l = addCharacter(l, 'b');

		l = addCharacter(l, 'k');

		l = addCharacter(l, 'z');

		l = addCharacter(l, 'e');

		l = addCharacter(l, 'e');

		l = addCharacter(l, 'z');

		printList(l);

		Node<Character> listWithoutDup = withoutDuplicateRezef(l);

		printList(listWithoutDup);

	}

}
