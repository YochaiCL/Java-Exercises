
public class Ex_8_Buyer {

	private int count;
	private double sum;
	private boolean bigBuy;

	public Ex_8_Buyer() {

		count = 0;
		sum = 0;
		bigBuy = false;
	}

	public boolean isConstantBuyer() {

		if (this.count > 15 && this.bigBuy == true) {

			return true;
		}

		else if (this.count > 15 && this.sum > 4000) {

			return true;
		}

		else if (this.bigBuy == true && this.sum > 4000) {

			return true;
		}

		return false;
	}

	public void setData(double num) {

		this.sum += num;
		count++;

	}

	public double getSum() {
		return this.sum;
	}

}
