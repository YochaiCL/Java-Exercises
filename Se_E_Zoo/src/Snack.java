
public class Snack extends Reptile {

	private boolean isPoisne;

	// constractor
	public Snack(String tmpName, int tmpAge, boolean tmpPredetor, double tmpCal, double tmpLengthTail,
			boolean tmpIsPoisne) {
		super(tmpName, tmpAge, tmpPredetor, tmpCal, tmpLengthTail);
		setIsPoisne(tmpPredetor);
	}

	// get
	public boolean getIsPoisne() {
		return isPoisne;
	}

	// set
	public void setIsPoisne(boolean tmpIsPoisne) {
		this.isPoisne = tmpIsPoisne;
	}

	// print
	@Override
	public String toString() {
		return super.toString() + " Snack [isPoisne=" + isPoisne + "]";
	}
	
	// dance
		public void dance() {
			System.out.println("dancing with the floor");
		}

}
