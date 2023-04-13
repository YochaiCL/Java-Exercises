
public class Person {

	private String name;
	private double height;
	private int weight;

	public Person(String tmpName, double tmpHeight, int tmpWeight) {
		setName(tmpName);
		setHeight(tmpHeight);
		setWeight(tmpWeight);
	}

	// Get
	public String getName() {
		return this.name;
	}

	public double getHeight() {
		return this.height;
	}

	public int getWeight() {
		return this.weight;
	}

	// Set
	public void setName(String tmpName) {
		this.name = tmpName;
	}

	public void setHeight(double tmpHeight) {
		this.height = tmpHeight;
	}

	public void setWeight(int tmpWeight) {
		this.weight = tmpWeight;
	}

	public void show() {
		System.out.println("name: " + this.name + " height: " + this.height + " weight:" + this.weight);
	}

}
