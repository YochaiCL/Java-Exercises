package Ex_1;

public class Saba {

	public static int s = 1;
	protected String str;

	public Saba() {
		this.str = "SABA" + s++;
		s += str.length();
	}

	public String toSting() {
		return str.substring(2, 4) + "A" + str.substring(0, 2) + s++;
	}

}
