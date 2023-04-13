import unit4.collectionsLib.Stack;

/*
 * מגישים:
 * יוחאי חן לוי 
 * דוד ידוובסקי
 */

public class Ex_22 {
	
	// Time complexity is o(n^2) - because the 2 functions each execute o(n)

	/**
	 * Description: This function performs the validation if the number exists in
	 * the stack
	 * 
	 * @param s       - Stack of Integer numbers
	 * @param dig     - Stack on the number in digits
	 * @param digTemp - Empty Integer Stack
	 * @param tmp     - Empty Integer Stack
	 */
	
	// Time complexity is o(n) - because the loop runs until the end of the stack size
	public static void checkInStack(Stack<Integer> s, Stack<Integer> dig, Stack<Integer> digTemp, Stack<Integer> tmp) {

		while (!s.isEmpty()) {
			if (!dig.isEmpty())
				if (dig.top() == s.top())
					if (digTemp.isEmpty())
						digTemp.push(dig.pop());
					else if (digTemp.top() == tmp.top())
						digTemp.push(dig.pop());

			tmp.push(s.pop());
		}
	}

	/**
	 * Description: This function ceack if number appear consecutively on the stack
	 * in some order.
	 * 
	 * @param s   - Stack of Integer numbers
	 * @param num - Integer number to seek
	 * @return True if digits of the number appear consecutively on the stack in
	 *         some order and False otherwise.
	 */
	
	// Time complexity is o(n) - because loops in this function are independent of each other
	public static boolean haveTheNUmbers(Stack<Integer> s, int num) {

		Stack<Integer> tmp = new Stack<Integer>();

		Stack<Integer> digits = new Stack<Integer>();

		Stack<Integer> digitsTemp = new Stack<Integer>();

		while (num > 0) {
			digits.push(num % 10);
			num /= 10;
		}

		checkInStack(s, digits, digitsTemp, tmp);

		if (digits.isEmpty())
			return true;

		else {
			while (!digits.isEmpty())
				digitsTemp.push(digits.pop());

			while (!digitsTemp.isEmpty())
				digits.push(digitsTemp.pop());
		}

		checkInStack(tmp, digits, digitsTemp, s);

		if (digits.isEmpty())
			return true;

		return false;

	}

	public static void main(String[] args) {

		Stack<Integer> s = new Stack<Integer>();

		s.push(2);
		s.push(1);
		s.push(5);
		s.push(4);
		s.push(1);

		int numberToCheck = 54;

		System.out.println(haveTheNUmbers(s, numberToCheck));

	}

}
