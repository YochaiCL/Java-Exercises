
public abstract class Mammal extends Animal {

	protected double calMilk;
	protected int pregnentMount;

	// Constractor
	public Mammal(String tmpName, int tmpAge, boolean tmpPredetor, double tmpCal, double tmpCalMilk,
			int tmpPregnentMount) {
		super(tmpName, tmpAge, tmpPredetor, tmpCal);
		setCalMilk(tmpCalMilk);
		setPregnentMount(tmpPregnentMount);
	}

	// get
	public double getCalMilk() {
		return calMilk;
	}

	public int getPregnentMount() {
		return pregnentMount;
	}

	// set

	public void setCalMilk(double tmpCalMilk) {
		if (tmpCalMilk >= 0)
			this.calMilk = tmpCalMilk;
	}

	public void setPregnentMount(int tmpPregnentMount) {
		if (tmpPregnentMount >= 0)
			this.pregnentMount = tmpPregnentMount;
	}

	// print

	@Override
	public String toString() {
		return super.toString() + " Mammal [calMilk=" + calMilk + ", pregnentMount=" + pregnentMount + "]";
	}
	
	// eat
	public double eat() {
		return super.eat()+calMilk;
	}
	
}
