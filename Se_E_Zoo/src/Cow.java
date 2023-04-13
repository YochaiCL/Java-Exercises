
public abstract class Cow extends Mammal {

	protected int numberOfBirths;

	// Constractor
	public Cow(String tmpName, int tmpAge, boolean tmpPredetor, double tmpCal, double tmpCalMilk, int tmpPregnentMount,
			int tmpNumberOfBirths) {
		super(tmpName, tmpAge, tmpPredetor, tmpCal, tmpCalMilk, tmpPregnentMount);

		setNumberOfBirths(tmpNumberOfBirths);
	}

	// get
	public int getNumberOfBirths() {
		return numberOfBirths;
	}

	// set
	public void setNumberOfBirths(int tmpNumberOfBirths) {
		if (tmpNumberOfBirths >= 0)
			this.numberOfBirths = tmpNumberOfBirths;
	}

	// print
	@Override
	public String toString() {
		return super.toString() + " Cow [numberOfBirths=" + numberOfBirths + "]";
	}

	// eat
	public double eat() {
		return super.eat()*0.25;
	}
}
