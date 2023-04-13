
/*
 * Targil 27
 * מגישים:
 * יווחאי חן לוי 303157952
 * צח ברק 300096245
 * ליאור אזולאי 314782715
 */

public class Ex_1_To_5 {

	// 1
	public static void printRevStr(String str) { // Function get string print in the opposite direction

		if (str.length() == 1)
			System.out.print(str.charAt(0));

		else {
			System.out.print(str.charAt(str.length() - 1));
			printRevStr(str.substring(0, str.length() - 1));
		}

	}

	// 2
	public static String returnRevStr(String str) { // Function get string return in the opposite direction

		if (str.length() == 1)
			return str.substring(0);

		else {
			return ((str.charAt(str.length() - 1)) + returnRevStr(str.substring(0, str.length() - 1)));
		}
	}

	// 3

	public static boolean arePulindrom(String str) { // Function get string and return true or false if its pilundrom

		boolean flag = true;

		if (str.length() <= 1)
			return flag;

		else {
			return ((str.charAt(0) == str.charAt(str.length() - 1) ? true : false)
					&& (arePulindrom(str.substring(1, str.length() - 1))));
		}
	}

	// 4

	public static int countCh(String str, char ch) { // Function get char and string return the amount of ch appears in string

		if (str.length() <= 0)
			return 0;

		return (str.charAt(str.length() - 1) == ch ? 1 : 0) + countCh(str.substring(0, str.length() - 1), ch);

	}

	public static void main(String[] args) {

		// 5

		String str = "abbcbba";

		printRevStr(str);

		System.out.println("");

		System.out.println(returnRevStr(str));

		System.out.println(arePulindrom("abcba"));

		System.out.println(countCh(str, 'b'));
	}
}
