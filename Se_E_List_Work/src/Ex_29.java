import unit4.collectionsLib.Node;
import java.util.Scanner;

/*
 * מגישים:
 * יוחאי חן לוי 
 * דוד ידוובסקי
 */
public class Ex_29 {

	// Time complixity is O(n) - becuse of the worst time scenerio is of the
	// function "bigAndSmallFromAvg"

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

		for (int i = 0; i < 6; i++) {
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
	 * Description: This function sum all numbers in the list
	 * 
	 * @param h: List of double numbers
	 * @return: Sum of the list
	 */
	public static Double sumList(Node<Double> h) {

		Node<Double> tmp = null;

		double sum = 0.0;

		for (tmp = h; tmp != null; tmp = tmp.getNext())
			sum += tmp.getValue();

		return sum;
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
	 * Desctiprion: This function check if the amount of numbers that large more
	 * than the avg is equals to the numbers that small from the avg
	 * 
	 * @param l:   List of double numbers
	 * @param avg: The avg of the numers in the list
	 * @return: True if the amount is equal and false otherwish
	 */

	// Time complixity is O(n) - becuse we are going through all the list values.
	public static boolean bigAndSmallFromAvg(Node<Double> l, double avg) {

		Node<Double> tmp = null;

		int countEvenEl = 0;

		for (tmp = l; tmp != null; tmp = tmp.getNext())
			if (tmp.getValue() > avg)
				countEvenEl++;
			else
				countEvenEl--;

		return countEvenEl == 0 ? true : false;

	}

	public static void main(String[] args) {

		Node<Double> h = null;

		h = creatListHead();

		printList(h);

		System.out.println(sumList(h));

		Double avg = sumList(h) / 6.0;

		System.out.println("The avg is: " + avg);

		System.out.println(bigAndSmallFromAvg(h, avg));

	}

}
