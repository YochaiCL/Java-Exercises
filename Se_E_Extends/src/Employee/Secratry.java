package Employee;

public class Secratry extends Employee {

	private int words;

	public Secratry(String tmpName, int tmpId, double tmpSellary, int tmpWords) {
		super(tmpName, tmpId, tmpSellary);
		setWords(tmpWords);
	}

	public void calcBonus() {
		this.sellary += 500;
	}

	public int getWords() {
		return words;
	}

	public void setWords(int tmpWords) {
		this.words = tmpWords;
	}

}
