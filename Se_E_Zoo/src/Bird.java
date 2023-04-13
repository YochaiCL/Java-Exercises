
public abstract class Bird extends Animal {

	protected double flyHight;
	protected double lengthWings;

	// Constractor
	public Bird(String tmpName, int tmpAge, boolean tmpPredetor, double tmpCal, double tmpFlyHight,
			double tmpLengthWings) {
		super(tmpName, tmpAge, tmpPredetor, tmpCal);
		setFlyHight(tmpFlyHight);
		setLengthWings(tmpLengthWings);
	}

	// get
	public double getFlyHight() {
		return flyHight;
	}

	public double getLengthWings() {
		return lengthWings;
	}

	// set

	public void setLengthWings(double tmpLengthWings) {
		if (tmpLengthWings >= 0)
			this.lengthWings = tmpLengthWings;
	}

	public void setFlyHight(double tmpFlyHight) {
		if (tmpFlyHight >= 0)
			this.flyHight = tmpFlyHight;
	}

	// print
	@Override
	public String toString() {
		return super.toString() + " Bird [flyHight=" + flyHight + ", lengthWings=" + lengthWings + "]";
	}

	// eat
	public double eat() {
		return super.eat() / 2;
	}

	// sing
	public void sing() {
		System.out.println("zip zip zip"); 
	}
	
	// dance
	public void dance() {
		System.out.println("dancing with the stars");
	}

}
