
public class Ex_8_a {
	
	public static void time_sec (int sec) {
		
		int hours, minuts, seconds;
		
		hours = sec/3600;//60*60
		minuts = sec/60%60;
		seconds = sec%60;
		
		System.out.println(hours+":"+minuts+":"+seconds);
	}

	public static void main(String[] args) {
		time_sec(3887);
	}
}
