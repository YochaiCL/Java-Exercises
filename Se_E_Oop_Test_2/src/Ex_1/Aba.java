package Ex_1;

public class Aba extends Saba {

	public static String str;
	private int s;

	public Aba(int s) {
		str = super.str;
		s += str.length();
	}

	public String toString() {
		return str + super.s;
	}

}
