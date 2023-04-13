import java.util.Scanner;

import unit4.collectionsLib.Node;

/*
 * מגישים:
 * יוחאי חן לוי 
 * דוד ידוובסקי
 */
public class Ex_33 {

	// Time complixity is O(n^2) - becuse we are running "newListDuplicate" function
	// in the worst time comlexity scenerio

	/**
	 * Description: This function create new double list
	 * 
	 * @return: New list
	 */

	// Time complixity is O(1) - becuse we are entering new node values in knowing
	// fixed size of a list
	public static Node<Double> creatListHead() {
		Scanner input = new Scanner(System.in);
		Node<Double> h = null;

		for (int i = 0; i < 4; i++) {
			System.out.println("Please enter number " + (i + 1));
			// create the first value in the list
			if (h == null)
				h = new Node<Double>(input.nextDouble());
			else
				// create new list connect to the first list
				h = new Node<Double>(input.nextDouble(), h);

		}
		return h;
	}

	/**
	 * Description: This function print the list
	 * 
	 * @param h: List of double numbers
	 */
	// Time complixity is O(n) - becuse we are printing the values of the whole
	// list.
	public static void printList(Node<Double> h) {

		Node<Double> tmp = null;

		for (tmp = h; tmp != null; tmp = tmp.getNext())
			System.out.print(tmp.getValue() + "->");
		System.out.println("||");
	}

	/**
	 * Description: This function create new list without duplicated numbers of the
	 * original list
	 * 
	 * @param h: List of double numbers
	 * @return: New list withount duplicated numbers
	 */
	// Time complixity is O(n^2) - becuse we are running through the entaire linked
	// list searching for duplicates values in decresing sequence
	public static Node<Double> newListDuplicate(Node<Double> h) {

		Node<Double> newList = null;
		Node<Double> tmpRun1 = null;
		Node<Double> tmpRun2 = null;

		if (h != null)
			tmpRun1 = h;
		else
			return newList;

		while (tmpRun1 != null) {

			boolean flag = true;

			tmpRun2 = tmpRun1.getNext();

			while (tmpRun2 != null && flag) {

				if (tmpRun2.getValue().equals(tmpRun1.getValue()))
					flag = false;
				tmpRun2 = tmpRun2.getNext();
			}

			if (flag)
				newList = new Node<Double>(tmpRun1.getValue(), newList);

			tmpRun1 = tmpRun1.getNext();
		}

		return newList;
	}

	public static void main(String[] args) {

		Node<Double> h = null;

		h = creatListHead();

		printList(h);

		Node<Double> duplicate = null;

		duplicate = newListDuplicate(h);

		printList(duplicate);

	}

}
