import unit4.collectionsLib.Stack;

/*
 * מגישים:
 * יוחאי חן לוי 
 * דוד ידוובסקי
 */

public class Ex_17 {

	/**
	 * Description: This function chack if the two Stacks is equel
	 * 
	 * @param s1 - String Stack
	 * @param s2 - String Stack
	 * @return True if the stack are the same and false if not
	 */
	// Time Complexity O(n)

	public static boolean isSame(Stack<String> s1, Stack<String> s2) {
		Stack<String> tmp1 = new Stack<String>();

		Stack<String> tmp2 = new Stack<String>();

		if (s1.isEmpty() || s2.isEmpty())
			return true;

		boolean flag = true;

		while ((!s1.isEmpty() && flag) || ((!s2.isEmpty() && flag))) {
			tmp1.push(s1.pop());
			tmp2.push(s2.pop());

			if (!(tmp1.top().equals(tmp2.top())))
				flag = false;
		}

		if (!s1.isEmpty() || !s2.isEmpty())
			flag = false;

		while (!tmp1.isEmpty())
			s1.push(tmp1.pop());

		while (!tmp2.isEmpty())
			s2.push(tmp2.pop());

		return flag;
	}

	public static void main(String[] args) {

		Stack<String> s1 = new Stack<String>();

		Stack<String> s2 = new Stack<String>();

		s1.push("kuku");
		s1.push("lolo");
		s1.push("gogo");

		s2.push("kuku");
		s2.push("lolo");
	

		System.out.println(s1);
		System.out.println(s2);

		System.out.println(isSame(s1, s2));

	}

}
