package Cat;

public class SiamiCat extends Cat {

	private String food;

	public SiamiCat(String tmpName, double tmpLength, String tmpColor, String food) {
		super(tmpName, tmpLength, tmpColor);
		setFood(food);
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	@Override
	public String toString() {
		return super.toString()+" SiamiCat [food=" + food + "]";
	}

}
