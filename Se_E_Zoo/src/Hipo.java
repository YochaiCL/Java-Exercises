
public class Hipo extends Mammal {

	private double fatPraceng;

	// Constaractor
	public Hipo(String tmpName, int tmpAge, boolean tmpPredetor, double tmpCal, double tmpCalMilk, int tmpPregnentMount,
			double tmpFatPraceng) {
		super(tmpName, tmpAge, tmpPredetor, tmpCal, tmpCalMilk, tmpPregnentMount);
		setFatPraceng(tmpFatPraceng);
	}

	// get
	public double getFatPraceng() {
		return fatPraceng;
	}

	// set
	public void setFatPraceng(double tmpFatPraceng) {
		if (tmpFatPraceng >= 0)
			this.fatPraceng = tmpFatPraceng;
	}

	// print
	@Override
	public String toString() {
		return super.toString() + "Hipo [fatPraceng=" + fatPraceng + "]";
	}

}
