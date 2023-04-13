
public class Car {

	private int carId;
	private int speed;

	// Get
	public int getCarId() {
		return this.carId;
	}

	public int getSpeed() {
		return this.speed;
	}

	// Set
	public boolean setCarId(int tmpCarId) {

		int count = 0;
		int checkAmount = tmpCarId;

		while (checkAmount > 0) {
			checkAmount /= 10;
			count++;
		}

		if (count == 7 || count == 8) {
			this.carId = tmpCarId;
			return true;
		}

		else {
			System.out.println("Car ID need to be 7 or 8 numbers");
			return false;
		}

	}

	public boolean speedUp(int tmpSpeed) {

		if (tmpSpeed > 0) {
			while (tmpSpeed > 0) {
				speed++;
				tmpSpeed--;
			}

			return true;
		}
		System.out.println("Please enter positive number");
		return false;

	}

	public boolean speedDown(int tmpSpeed) {

		if (tmpSpeed > 0)

			if (this.speed >= tmpSpeed) {

				while (tmpSpeed > 0) {
					speed--;
					tmpSpeed--;
				}
				return true;
			} else
				System.out.println("Please enter bigger number then "+this.speed);

		else
			System.out.println("Please enter positive number");

		return false;

	}

	public void stopAndPrint() {
		speed = 0;
		System.out.println("Emergency stop !!!, your speed is: " + speed);
	}

}
