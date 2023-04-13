import java.util.Scanner;
import unit4.collectionsLib.Stack;
/*
 * מגישים:
 * יוחאי חן לוי 
 * דוד ידוובסקי
 */




public class Ex_14 {

	/**
	 * Description: This function Check if the numbers sorted by big to small
	 * @param s - Stack of Integer numbers
	 * @return - True if it sorted and False if it not
	 */
	
	//The complexity is o(n)
	public static boolean bigToSmall(Stack<Integer> s) {

		Stack<Integer> s1 = new Stack<Integer>();

		boolean flag = true;

		while (!s.isEmpty() && flag) {

			s1.push(s.pop());

			if (!s.isEmpty())

				if (s1.top() < s.top())
					flag = false;
		}

		while (!s1.isEmpty())
			s.push(s1.pop());

		return flag;
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
		System.out.println("Are Stock is sorted (top to small)? "+bigToSmall(s));

		

	}

}
