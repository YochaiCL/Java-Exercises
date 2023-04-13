import unit4.collectionsLib.Stack;
import java.util.Scanner;

/*
 * מגישים:
 * יוחאי חן לוי 
 * דוד ידוובסקי
 */

public class Ex_19 {
		
	/**
	 * Description: This function input numbers until we input -999
	 * @return Full Stack with sorted numbers that we input
	 */

	// Time Complexity O(n)
	public static Stack<Integer> inputNumbers() {
		Scanner input = new Scanner(System.in);

		Stack<Integer> result = new Stack<Integer>();

		System.out.println("Please enter a number");
		int number = input.nextInt();

		while (number != -999) {
			addNumber(result, number);
			System.out.println("Please enter a number");
			number = input.nextInt();
		}

		return result;

	}
	
	/**
	 * Description: This function add a number to the stack and make it still sorted
	 * @param st - Sorted stack
	 * @param num - Integet number
	 */
	// Time Complexity O(n)

	public static void addNumber(Stack<Integer> st, int num) {

		Stack<Integer> tmp = new Stack<Integer>();

		if (!st.isEmpty() && st.top() < num) {
			while (st.top() < num) {
				tmp.push(st.pop());
				if (st.isEmpty())
					st.push(num);
			}
			st.push(num);
			while (!tmp.isEmpty())
				st.push(tmp.pop());

		}

		else
			st.push(num);

	}

	public static void main(String[] args) {

		System.out.println(inputNumbers());

	}

}
