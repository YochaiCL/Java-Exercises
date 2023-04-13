import java.util.Scanner;
import unit4.collectionsLib.Stack;
/*
 * מגישים:
 * יוחאי חן לוי 
 * דוד ידוובסקי
 */


public class Ex_16 {
	
	/**
	 * Description: This function move the bottom number to the top of Stack
	 * @param s - Stack of Integer numbers
	 */

	//The time complexity is o(n)
	public static void downToTop(Stack<Integer> s) {

		Stack<Integer> temp = new Stack<Integer>();

		while (!s.isEmpty())

			temp.push(s.pop());

		int top = temp.pop();

		while (!temp.isEmpty())
			s.push(temp.pop());

		s.push(top);

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

		System.out.println("Original Stack: " +s);

		downToTop(s);

		System.out.println("Move bottom number to top: " +s);

	}

}
