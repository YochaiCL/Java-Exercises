
public class Ex_12_Time {

	private int hour;
	private int minute;

	public Ex_12_Time(int time) {

		int timeInH = time / 60;
		int tineInM = time % 60;
		setTime(timeInH, tineInM);
	}

	public void setTime(int h, int m) {

		hour = h;
		minute = m;

	}

	public int minFromMidnight() {
		return hour * 60 + minute;
	}

}
