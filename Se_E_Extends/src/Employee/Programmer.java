package Employee;

public class Programmer extends Employee {

	public Programmer(String tmpName, int tmpId, double tmpSellary) {
		super(tmpName, tmpId, tmpSellary);
	}

	public void calcBonus() {
		this.sellary *= 1.5;
	}

}
