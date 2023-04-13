package Employee;

public class Employee {

	protected String name;
	protected int id;
	protected double sellary;

	public Employee(String tmpName, int tmpId, double tmpSellary) {

		setName(tmpName);
		setSellery(tmpSellary);
		setId(tmpId);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {

		if (id >= 1000)
			this.id = id;
	}

	public double getSellery() {
		return sellary;
	}

	public void setSellery(double sellery) {
		this.sellary = sellery;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", sellery=" + sellary + "]";
	}

	public void calcBonus() {
		this.sellary += 0;
	}

	public void updateSallery(double tmpSallery) {
		this.sellary = tmpSallery;
	}

}
