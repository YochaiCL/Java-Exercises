
public class Clock {
	private int hours;
	private int minutes;
	private int seconds;

//	public Clock(int tmpHours, int tmpMinutes, int tmpSeconds) {
//		setHours(tmpHours);
//		setMinutes(tmpMinutes);
//		setSeconds(tmpSeconds);
//	}

	// This function add soconds to the clock
	public void tack() {

		// Every time we activate the function, the seconds will advance by one
		seconds++;

		if (seconds == 60)
			tick();

		// 60%60 => 0 Only if seconds=60 so the result will be 0
		// 24%60 => will sty 24
		seconds %= 60;

	}

	// This function add minutes to the clock
	public void tick() {

		minutes++;

		if (minutes == 60)
			tock();

		minutes %= 60;

	}

	// This function add hours to the clock
	public void tock() {

		hours++;

		hours %= 24;
	}

	// This function print the time in the clock
	public void show() {

		if (hours < 10)
			System.out.print("0");
		System.out.print(hours + ":");

		if (minutes < 10)
			System.out.print("0");
		System.out.print(minutes + ":");

		if (seconds < 10)
			System.out.print("0");
		System.out.print(seconds);

		System.out.println();
	}

	// Gets functions

	public int getMinutes() {
		return minutes;
	}

	public int getHours() {
		return hours;
	}

	public int getSeconds() {
		return seconds;
	}

	// Sets functions

	public boolean setSeconds(int tmpSeconds) {

		if (tmpSeconds < 0 || tmpSeconds >= 60) {
			seconds = 0;
			return false;
		} else {
			seconds = tmpSeconds;
			return true;
		}
	}

	public boolean setMinutes(int tmpMinutes) {

		if (tmpMinutes < 0 || tmpMinutes >= 60) {
			minutes = 0;
			return false;
		} else {
			minutes = tmpMinutes;
			return true;
		}
	}

	public boolean setHours(int tmpHours) {

		if (tmpHours < 0 || tmpHours >= 24) {
			hours = 0;
			return false;
		}

		else {
			hours = tmpHours;
			return true;
		}
	}

	// Reset function
	public void reset() {
		hours = 0;
		minutes = 0;
		seconds = 0;
	}

	// Show pm/am function
	public void showPm() {

		if (hours < 12) {

			if (hours < 10)
				System.out.print("0");
			System.out.print(hours + "AM:");
		}

		else {
			if (hours < 10)
				System.out.print("0");
			int pmHour = pmHours(hours);
			System.out.print(pmHour + "PM:");
		}
		if (minutes < 10)
			System.out.print("0");
		System.out.print(minutes + ":");

		if (seconds < 10)
			System.out.print("0");
		System.out.print(seconds);

		System.out.println();

	}

	// Function convert regolar hours to pm hours
	public int pmHours(int regolarH) {

		int[] regH = { 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23 };

		int[] pmH = { 12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };

		boolean flag = false;

		int i = 0;

		while (flag == false) {

			if (regolarH == regH[i])
				flag = true;

			else
				i++;
		}

		return pmH[i];
	}

}
