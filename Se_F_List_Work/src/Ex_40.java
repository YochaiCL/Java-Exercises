import unit4.collectionsLib.Node;

/*
 * מגישים:
 * יוחאי חן לוי 
 * דוד ידוובסקי
 */

public class Ex_40 {

	// Time complixity is O(n^2) - becuse of the worst time scenerio is of the
	// function "consecutiveNumbers"

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
	 * Description: This function check the list have consecutive numbers in the
	 * amount of n
	 * 
	 * @param h - List of original numbers
	 * @param n - Integer number to chack the amount of consecutive numbers
	 * @return True if the amount is equal and false otherwish
	 */

	// Time complixity is O(n^2) - becuse in the first while we run the all list and
	// the second while we check for consecutive numbers
	public static boolean consecutiveNumbers(Node<Integer> h, int n) {

		boolean flag = false;

		Node<Integer> tmp = h;

		int countAmount = 0, up, down;

		while (tmp.getNext() != null && !flag) {

			up = tmp.getValue() + 1;
			down = tmp.getValue() - 1;

			if (up == tmp.getNext().getValue()) {
				flag = true;
				while (tmp.getNext() != null && flag) {

					tmp = tmp.getNext();
					up = tmp.getValue() + 1;

					if (up != tmp.getNext().getValue())
						flag = false;
				}
				countAmount++;
			}

			else if (down == tmp.getNext().getValue()) {
				flag = true;
				while (tmp.getNext() != null && flag) {

					tmp = tmp.getNext();
					up = tmp.getValue() + 1;

					if (up != tmp.getNext().getValue())
						flag = false;
				}
				countAmount++;
			}

			if (countAmount == n)
				flag = true;

			tmp = tmp.getNext();
		}

		return flag;

	}

	public static void main(String[] args) {

		Node<Integer> l = new Node<Integer>(5);

		l = new Node<Integer>(1, l);

		l = new Node<Integer>(2, l);

		l = new Node<Integer>(3, l);

		l = new Node<Integer>(5, l);

		l = new Node<Integer>(4, l);

		l = new Node<Integer>(7, l);

		printList(l);

		System.out.println(consecutiveNumbers(l, 2));

	}

}
