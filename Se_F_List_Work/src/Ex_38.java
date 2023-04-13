import unit4.collectionsLib.Node;
import java.util.Scanner;

/*
 * מגישים:
 * יוחאי חן לוי 
 * דוד ידוובסקי
 */

public class Ex_38 {

	// Time complixity is O(n^3) - becuse of the worst time scenerio is of the
	// we using the both while in the same time

	/**
	 * Description: This function add a number to sorted list
	 * 
	 * @param h:   List of integer numbers
	 * @param num: Integer number
	 * @return: the list after adding the number
	 */
	// Time complixity is O(n^2) - becuse we are running through the entaire linked
	// list until the location of number in sorted list

	public static Node<Integer> addBYSort(Node<Integer> h, int num) {

		Node<Integer> tmp = h;

		Node<Integer> newList = new Node<Integer>(num);

		Node<Integer> continuList = null;

		Node<Integer> tmp2 = new Node<Integer>(tmp.getValue());

		Node<Integer> tmp3 = tmp2;

		if (h.getValue() == null) {
			h = newList;
			return h;
		}

		boolean flag = false;

		while (tmp != null && !flag) {

			if (tmp.getNext() == null) {
				if (num > tmp.getValue()) {
					tmp.setNext(newList);
				}

				flag = true;

			} else if (tmp.getNext().getValue() > newList.getValue()) {

				if (tmp.getValue() > newList.getValue()) {
					continuList = h;
					newList.setNext(continuList);
					h = newList;
					flag = true;
				} else {
					if (tmp.getValue() != tmp3.getValue()) {
						tmp3.setNext(new Node<Integer>(tmp.getValue()));
						tmp3 = tmp3.getNext();
					}
						

					tmp = tmp.getNext();
					

					while (tmp.getValue() < num) {
						tmp3.setNext(new Node<Integer>(tmp.getValue()));
						tmp = tmp.getNext();
						tmp3 = tmp3.getNext();
					}

					tmp3.setNext(newList);
					newList.setNext(tmp);
					flag = true;
					h = tmp2;

				}

			}

			else {
				tmp = tmp.getNext();
				tmp3.setNext(new Node<Integer>(tmp.getValue()));
				tmp3 = tmp3.getNext();
			}
				
		}

		return h;
	}
	/**
	 * Description: This function create new list by inputs number until we input
	 * -99
	 * 
	 * @return list of numbers
	 */

	// Time complixity is O(n) - becuse we are we input number in a while until -99
	public static Node<Integer> until99() {

		Node<Integer> listUntil99 = new Node<Integer>(null);

		Scanner input = new Scanner(System.in);

		int finalInput = -99;

		System.out.println("Please input a number (-99 to finish inputs):");

		int num = input.nextInt();

		while (num != finalInput) {
			listUntil99 = addBYSort(listUntil99, num);

			System.out.println("Please input a number (-99 to finish inputs):");
			num = input.nextInt();
		}

		return listUntil99;
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

		Node<Integer> result = new Node<Integer>(null);

		result = until99();

		printList(result);

	}

}
