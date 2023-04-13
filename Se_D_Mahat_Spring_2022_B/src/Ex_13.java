
public class Ex_13 {

	public static String one(String s, char ch) {
		int i = 0;
		while (i < s.length() && s.charAt(i) != ch) {
			i++;
		}
		if (i < s.length())
			s = s.substring(0, i) + s.substring(i + 1) + ch;
		return s;
	}

	public static String two(String s1, String s2) {
		while (s1.length() > 0) {
			s2 = one(s2, s1.charAt(0));
			s1 = s1.substring(1);
		}
		return s2;
	}

	public static boolean three(String s1, String s2) {
		s2 = two(s1, s2);
		return s2.equals(s1);
	}

	public static void main(String[] args) {

		System.out.println(one("APPLE", 'L'));

		System.out.println(two("OPEN", "CLOSE"));

		System.out.println(three("LOSER", "CLOSE"));

		System.out.println(three("CLOSE", "CLSEO"));

	}

}
