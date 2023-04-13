
public class Pigeon extends Bird {

	private boolean inLove;

	// constractor
	public Pigeon(String tmpName, int tmpAge, boolean tmpPredetor, double tmpCal, double tmpFlyHight,
			double tmpLengthWings, boolean tmpInLove) {
		super(tmpName, tmpAge, tmpPredetor, tmpCal, tmpFlyHight, tmpLengthWings);
		setInLove(tmpInLove);
	}

	// get
	public boolean getInLove() {
		return inLove;
	}

	// set
	public void setInLove(boolean tmpInLove) {
		this.inLove = tmpInLove;
	}

	// print
	@Override
	public String toString() {
		return super.toString() + " Pigeon [inLove=" + inLove + "]";
	}

}
