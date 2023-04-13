
public class Ex_Main {

	// C
	public static String largDiscName(Ex_Disk d1, Ex_Disk d2) {

		if (d1.getSongCount() >= d2.getSongCount()) {
			return d1.getDiskName();
		}

		return d2.getDiskName();
	}

	public static void main(String[] args) {

		Ex_Song s = new Ex_Song("The Wall", 231, "Pink Floyed");
		System.out.println(s.status());

	}

}
