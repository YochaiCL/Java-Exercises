import unit4.collectionsLib.Stack;

public class Secret_1_2 {

	/**
	 * Description: The function checks if the parity of the number digit is equal
	 * to the parity of one of the digits of num
	 * 
	 * @param num   - number of 3 digits
	 * @param digit - digit number
	 * @return true if parity of the number digit is equal of false if not
	 */
	public static boolean secret1(int num, int digit) {

		if (num < 10)
			return (num % 2 == digit % 2);

		if (num % 2 != digit % 2)
			return false;

		return secret1(num / 10, digit);
	}

	/**
	 * Description: This function checks the secret1 function for each element in
	 * the stack
	 * 
	 * @param s - Stack of Integer numbers
	 * @return - (!(True))--> false --- (!(False))-->true
	 */
	public static boolean secret2(Stack<Integer> s) {
		boolean ok;
		int x;
		if (s.isEmpty())
			ok = true;

		else {
			x = s.pop();
			if (!(secret1(x, x % 10)))
				ok = false;
			else
				ok = secret2(s);

		}
		return ok;
	}

	public static void main(String[] args) {

		// Secret 1
		System.out.println(secret1(937, 5)); // return true
		System.out.println(secret1(639, 5)); // return false

		// Secret2
		Stack<Integer> s = new Stack<Integer>();
		s.push(321);
		s.push(531);
		s.push(25);
		s.push(426);

		System.out.println(secret2(s)); // false

	}

}
