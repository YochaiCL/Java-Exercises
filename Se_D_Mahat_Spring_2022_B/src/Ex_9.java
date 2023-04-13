
public class Ex_9 {

	public static int numOfk(String s1, String s2) {

		int k = 0;

		while (!s1.equals(s2)) {

			s2 = rightRotation(s2);
			k++;
		}

		if (k == 0)
			return -1;

		return k;

	}

	public static boolean isRollingK(String s1, String S2, int k) {

		while (k > 0) {
			s1 = rightRotation(s1);
			k--;
		}

		if (s1.equals(S2))
			return true;

		else
			return false;

	}

	public static String rightRotation(String s) {

		String newStr = "";
		String sub = s.substring(0, s.length() - 1);

		char tmp;

		tmp = s.charAt(s.length() - 1);

		newStr += tmp;
		newStr += sub;

		return newStr;

	}

	public static void main(String[] args) {

		System.out.println(isRollingK("ABCD", "CDAB", 2));

		System.out.println(isRollingK("ABCD", "DABC", 2));

		System.out.println(numOfk("ABCD", "CDAB"));

		System.out.println(numOfk("ABCD", "ABCD"));

	}

}
