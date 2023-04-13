
public class Crocodile extends Reptile {

	private boolean hasDoneTitCare;

	// Constractor
	public Crocodile(String tmpName, int tmpAge, boolean tmpPredetor, double tmpCal, double tmpLengthTail,
			boolean tmpHasDoneTitCare) {
		super(tmpName, tmpAge, tmpPredetor, tmpCal, tmpLengthTail);
		setHasDoneTitCare(tmpPredetor);
	}

	// get
	public boolean getHasDoneTitCare() {
		return hasDoneTitCare;
	}

	// set
	public void setHasDoneTitCare(boolean tmpHasDoneTitCare) {
		this.hasDoneTitCare = tmpHasDoneTitCare;
	}

	// print
	@Override
	public String toString() {
		return super.toString() + " Crocodile [hasDoneTitCare=" + hasDoneTitCare + "]";
	}
	
	// eat
	public double eat() {
		return super.eat()*2;
	}

}
