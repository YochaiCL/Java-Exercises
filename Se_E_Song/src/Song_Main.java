
public class Song_Main {
	
	public static String largDiscName (Disk d1, Disk d2) {
		
		if (d1.getSongCount()>=d2.getSongCount()) {
			return d1.getDiskName();
		}
		
		return d2.getDiskName();
	}

	public static void main(String[] args) {

		Song s = new Song("The Wall", 231, "Pink Floyed");
		System.out.println(s.status());

	}

}
