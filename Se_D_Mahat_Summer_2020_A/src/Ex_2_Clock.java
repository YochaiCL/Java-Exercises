
public class Ex_2_Clock {

	private int hour; // שעה23-0

	private int min; // דקות59-0

	public Ex_2_Clock(int hour, int min) {

		this.hour = hour;
		this.min = min;
	}

	public int getInterval() {

		int hour = 23 - this.hour;

		int min = 60 - this.min;

		return 60 * hour + min;
	}

}
