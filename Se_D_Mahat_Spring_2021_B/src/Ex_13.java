
public class Ex_13 {

	public static boolean what(String s1, String s2) {
		if (s1.length() == 0)
			return true;
		if (s2.length() == 0)
			return false;
		if (s1.charAt(0) == s2.charAt(0))
			return what(s1.substring(1), s2.substring(1));
		return what(s1, s2.substring(1));
	}

	public static void main(String[] args) {
		
		System.out.println(what("HELLO", "HERLOLOR"));//TRUE
		
		System.out.println(what("HELLO", "MPRUT"));//FALSE
		
		//The plan is chacking if all letters in s1 are in s2
		//If yes = True
		//If no = False

	}

}
