
public class Ex_1_B {

	public static boolean sod(String st) {

		int n = 0;

		for (int t = 0; t < st.length(); t++) {

			if (st.charAt(t) == 'A')
				n++;
			else
				n--;
		}
		if (n == 0)
			return true;

		else
			return false;
	}

	public static void main(String[] args) {

		System.out.println(sod("ABBABBA"));
		
		System.out.println(sod("ABABABBAA"));

	}

}
