
public class Appear {

	private String word;
	private int count;

	public Appear(String tmpWord, int tmpCount) {
		setWord(tmpWord);
		setCount(tmpCount);
	}

	public String getWord() {
		return this.word;
	}

	public int getCount() {
		return this.count;
	}

	public void setWord(String tmpWord) {
		this.word = tmpWord;
	}

	public void setCount(int tmpCount) {
		this.count = tmpCount;
	}

	public String toString() {
		return "(" + this.word + ":" + this.count + ")";
	}

}
