
public class Ex_5_Data {

	private int id;
	private int firstMount;
	private int secondeMount;

	public Ex_5_Data(int tmpFirstMount, int tmpSecondeMount) {

		this.firstMount = tmpFirstMount;
		this.secondeMount = tmpSecondeMount;
	}

	public void setId(int tmpId) {
		this.id = tmpId;
	}

	public int getId() {
		return this.id;
	}

	public int getFirstMount() {
		return this.firstMount;
	}

	public int getSecondeMount() {
		return this.secondeMount;
	}

}
