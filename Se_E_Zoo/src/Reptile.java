
public abstract class Reptile extends Animal {

	protected double lengthTail;

	// Constractor
	public Reptile(String tmpName, int tmpAge, boolean tmpPredetor, double tmpCal, double tmpLengthTail) {
		super(tmpName, tmpAge, tmpPredetor, tmpCal);
		setLengthTail(tmpLengthTail);
		;
	}

	// get
	public double getLengthTail() {
		return lengthTail;
	}

	// set
	public void setLengthTail(double tmpLengthTail) {
		if (tmpLengthTail >= 0)
			this.lengthTail = tmpLengthTail;
	}

	// print
	@Override
	public String toString() {
		return super.toString() + " Reptile [lengthTail=" + lengthTail + "]";
	}
	
	public String toString(Reptile[] reptile) {
		String str=" ";
		for(int i=0;i<reptile.length;i++) {
			str+=reptile[i]+" ";
		}
		
		return str;
	}

}
