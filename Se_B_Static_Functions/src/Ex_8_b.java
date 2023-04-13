import java.util.Scanner;
public class Ex_8_b {
	
	public static void time_sec (int sec) {
		
		int hours, minuts, seconds;
		
		hours = sec/3600;//60*60
		minuts = sec/60%60;
		seconds = sec%60;
		
		System.out.println(hours+":"+minuts+":"+seconds);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int start_time, end_time;
		
		System.out.println("enter start time:");
		start_time=input.nextInt();
		
		System.out.println("enter end time:");
		end_time=input.nextInt();
		
		System.out.println("start time:");
		time_sec(start_time);
		
		System.out.println("end time:");
		time_sec(end_time);
		
		System.out.println("work time:");
		time_sec(end_time-start_time);
	}
}
