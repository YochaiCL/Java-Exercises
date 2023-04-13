
public abstract class Animal {

	protected String name;
	protected int age;
	protected boolean predetor;
	protected double cal;

	// constractor
	public Animal(String tmpName, int tmpAge, boolean tmpPredetor, double tmpCal) {

		setName(tmpName);
		setAge(tmpAge);
		setPredetor(tmpPredetor);
		setCal(tmpCal);
	}

	// get
	public String getName() {
		return name;
	}

	public int getAge() {

		return age;
	}

	public boolean isPredetor() {
		return predetor;
	}

	public double getCal() {
		return cal;
	}

	// set
	public void setAge(int tmpAge) {
		if (tmpAge >= 0)
			this.age = tmpAge;
	}

	public void setName(String tmpName) {
		this.name = tmpName;
	}

	public void setPredetor(boolean tmpPredetor) {
		this.predetor = tmpPredetor;
	}

	public void setCal(double tmpCal) {
		if (tmpCal >= 0)
			this.cal = tmpCal;
	}

	// print
	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + ", predetor=" + predetor + ", cal=" + cal + "]";
	}

	// eat
	public double eat() {
		return this.cal;
	}

}
