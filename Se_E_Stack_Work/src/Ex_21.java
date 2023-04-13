import unit4.collectionsLib.Stack;

/*
 * מגישים:
 * יוחאי חן לוי 
 * דוד ידוובסקי
 */

public class Ex_21 {

	/**
	 * Description: This function sort the numbers by size
	 * 
	 * @param s - Stack of double numbers
	 * @return - Sorted Stack by big to small
	 */
	// Time Complexity O(n)
	public static Stack<Double> sortByMax(Stack<Double> s) {

		Stack<Double> temp = new Stack<Double>();

		while (!s.isEmpty()) {

			temp.push(findMax(s));
		}

		return temp;

	}

	/**
	 * Description: This function find the max number in the stack
	 * 
	 * @param s - Stack of Double numbers
	 * @return - The max number in the Stack
	 */
	// Time Complexity O(n^2)

	public static double findMax(Stack<Double> s) {

		Stack<Double> temp = new Stack<Double>();

		double max = s.top();

		while (!s.isEmpty()) {

			if (max < s.top())
				max = s.top();

			temp.push(s.pop());

		}

		boolean flag = true;

		while (!temp.isEmpty()) {

			if (temp.top() == max && flag) {

				temp.pop();

				flag = false;
			}

			if (!temp.isEmpty())
				s.push(temp.pop());
		}

		return max;

	}

	public static void main(String[] args) {

		Stack<Double> s = new Stack<Double>();

		s.push(1.5);
		s.push(1.2);
		s.push(1.1);
		s.push(1.9);
		s.push(1.7);
		s.push(1.3);

		System.out.println("Before Sorting: " + s);

		if (!s.isEmpty())
			System.out.println("After sorting" + sortByMax(s));

	}

}
