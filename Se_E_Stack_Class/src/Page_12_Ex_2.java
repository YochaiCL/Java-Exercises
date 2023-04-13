import unit4.collectionsLib.Stack;

public class Page_12_Ex_2 {

	// The complicity in o(n)

	public static void printInK(Stack<Character> s, int k) {

		Stack<Character> tmp = new Stack();

		if (k > 0) {
			while (!s.isEmpty() && k > 1) {
				tmp.push(s.pop());
				// If k is bigger then the Stack, so there will not be a print
				k--;
			}
			// If k is 1 so we can print the result
			// K cant be 0 becuse the Stack start with 1 and not 0
			if (k == 1)
				System.out.println(s.top());
			else
				System.out.println("k is bigger then the stack size");
			// Return the s Stack to original state
			while (!tmp.isEmpty())
				s.push(tmp.pop());
		}
	}
	public static void main(String[] args) {

		Stack<Character> s = new Stack();

		char[] arr = { 'a', 'b', 'c', 'd', 'e' };

		int k = 3;

		for (int i = 0; i < arr.length; i++)
			s.push(arr[i]);

		printInK(s, k);

		k = 7;

		printInK(s, k);
//		c
//		k is bigger then the stack size
	}
}