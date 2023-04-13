
public class Ex_2_Snack {

	private String name;
	private int weight;
	private double price;
	private int kal;

	public Ex_2_Snack(String tmpName, int tmpWeight, double tmpPrice, int tmpKal) {

		this.name = tmpName;
		this.weight = tmpWeight;
		this.price = tmpPrice;
		this.kal = tmpKal;
	}
	
	//set

	public void setName(String tmpName) {

		this.name = tmpName;
	}

	public void setWeight(int tmpWeight) {

		this.weight = tmpWeight;
	}

	public void setPrice(double tmpPrice) {

		this.price = tmpPrice;
	}

	public void setKal(int tmpKal) {

		this.kal = tmpKal;
	}
	
	//get
	
	public String getName() {

		return this.name;
	}

	public int getWeight() {

		return this.weight;
	}

	public double getPrice() {

		return this.price;
	}

	public int getKal() {

		return this.kal;
	}
	
	
	

}
