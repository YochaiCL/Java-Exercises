
public class BrownCow extends Cow {

	private boolean isMedCow;

	// constractor
	public BrownCow(String tmpName, int tmpAge, boolean tmpPredetor, double tmpCal, double tmpCalMilk,
			int tmpPregnentMount, int tmpNumberOfBirths, boolean tmpIsMedCow) {
		super(tmpName, tmpAge, tmpPredetor, tmpCal, tmpCalMilk, tmpPregnentMount, tmpNumberOfBirths);
		setMedCow(tmpIsMedCow);
	}

	// get
	public boolean isMedCow() {
		return isMedCow;
	}

	// set
	public void setMedCow(boolean tmpIsMedCow) {
		this.isMedCow = tmpIsMedCow;
	}

	// print
	@Override
	public String toString() {
		return super.toString() + " BrownCow [isMedCow=" + isMedCow + "]";
	}

}
