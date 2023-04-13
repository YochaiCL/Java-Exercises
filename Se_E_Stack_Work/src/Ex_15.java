import java.util.Scanner;
import unit4.collectionsLib.Stack;
/*
 * מגישים:
 * יוחאי חן לוי 
 * דוד ידוובסקי
 */

public class Ex_15 {

	/**
	 * Description: This function move the top number to the bottom of Stack
	 * @param s - Stack of Integer numbers
	 */
	
	//The complexity is o(n)
	public static void upToDown(Stack<Integer> s) {

		Stack<Integer> temp = new Stack<Integer>();

		int top = s.pop();

		while (!s.isEmpty())

			temp.push(s.pop());

		s.push(top);

		while (!temp.isEmpty())
			s.push(temp.pop());

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

		upToDown(s);

		System.out.println("Move top number to bottom: " +s);

	}

}
