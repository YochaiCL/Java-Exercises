import java.util.Scanner;

import unit4.collectionsLib.Node;

/*
 * מגישים:
 * יוחאי חן לוי 
 * דוד ידוובסקי
 */
public class Ex_31 {

	// Time complixity is O(n) - becuse of the worst time scenerio is of the
	// function "rezrf"

	/**
	 * Description: This function create new integer list
	 * 
	 * @return: New list
	 */
	// Time complixity is O(1) - becuse we are entering new node values in knowing
	// fixed size of a list
	public static Node<Integer> creatListHead() {
		Scanner input = new Scanner(System.in);
		Node<Integer> h = null;

		for (int i = 0; i < 7; i++) {
			System.out.println("Please enter number " + (i + 1));
			// create the first value in the list
			if (h == null)
				h = new Node<Integer>(input.nextInt());
			else
				// create new list connect to the first list
				h = new Node<Integer>(input.nextInt(), h);

		}
		return h;
	}

	/**
	 * Description: This function check the amount of sequences of number in the
	 * list
	 * 
	 * @param l:      List of integer numbers
	 * @param number: Number to cheack in the list
	 * @return: Amount of sequences of number in the list
	 */
	// Time complixity is O(n) - becuse we are running through the entaire linked
	// list searching for continuity
	public static Integer rezrf(Node<Integer> l, int number) {

		Node<Integer> tmp = null;

		int countEvenEl = 0;
		boolean flag = false;

		for (tmp = l; tmp != null; tmp = tmp.getNext()) {
			if (tmp.getValue() == number && !flag)
				countEvenEl++;

			if (tmp.getNext() == null)
				break;

			if (tmp.getValue() == tmp.getNext().getValue())
				flag = true;

			else
				flag = false;
		}

		return countEvenEl;

	}

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

	public static void main(String[] args) {

		Node<Integer> h = null;

		h = creatListHead();

		printList(h);

		System.out.println(rezrf(h, 1));

	}

}
