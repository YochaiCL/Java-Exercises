
import java.util.Scanner;
import unit4.collectionsLib.Stack;
/*
 * מגישים:
 * יוחאי חן לוי 
 * דוד ידוובסקי
 */

public class Ex_13 {

	/**
	 * Description: This function Copy the original Stack in revers
	 * @param s - Stack of Integer numbers
	 * @return - Revers original Stack
	 */
	
	//The complexity is o(n)
	public static Stack<Integer> ReverseCopy(Stack<Integer> s) {

		Stack<Integer> s1 = new Stack<Integer>();

		Stack<Integer> s2 = new Stack<Integer>();

		while (!s.isEmpty()) {

			int x = s.pop();

			s1.push(x);

			s2.push(x);
		}

		while (!s2.isEmpty())
			s.push(s2.pop());

		return s1;
	}

	public static void main(String[] args) {

		// Create new Stack and fill it with numbers
		Scanner input = new Scanner(System.in);

		Stack<Integer> s = new Stack<Integer>();

		int i = 0;

		while (i < 6) {

			System.out.println("Enter " + i);

			s.push(input.nextInt());

			i++;

		}

		System.out.println("Original Stack: " + s);
		System.out.println("Revers Stack: " + ReverseCopy(s));
	}
}
