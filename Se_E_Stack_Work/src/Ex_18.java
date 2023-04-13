import unit4.collectionsLib.Stack;
/*
 * מגישים:
 * יוחאי חן לוי 
 * דוד ידוובסקי
 */

public class Ex_18 {

	/**
	 * Description: This function add a number to the stack and make it still sorted
	 * 
	 * @param st  - Sorted stack
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

		Stack<Integer> st = new Stack<Integer>();

		st.push(6);
		st.push(5);
		st.push(4);
		st.push(3);
		st.push(2);

		System.out.println(st);

		addNumber(st, 1);

		System.out.println(st);

	}

}
