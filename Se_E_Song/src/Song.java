
public class Song {

	private String name;
	private String performer;
	private int length;

	public Song(String tmpName, int tmpLength, String tmpPerformer) {

		setName(tmpName);
		setLength(tmpLength);
		setPerformer(tmpPerformer);

		// this.name = tmpName;
		// this.length = tmpLength;
		// this.performer = tmpPerformer;

	}

	public String getName() {
		return this.name;
	}

	public String getPerformer() {
		return this.performer;
	}

	public int getLength() {
		return this.length;
	}

	public void setName(String tmpName) {
		this.name = tmpName;
	}

	public void setPerformer(String tmpPerformer) {
		this.performer = tmpPerformer;
	}

	public void setLength(int tmpLength) {

		if (tmpLength > 0)
			this.length = tmpLength;
	}

	public String toString() {
		return "Ex_Mahat_Spring_2022_A_5 [name=" + name + ", performer=" + performer + ", length=" + length + "]";
	}

	public String status() {
		// Buku/Ququ:120

		String res = "";

		res += getPerformer() + "/";
		res += getName() + ":" + getLength();
		
		// res += getPerformer() + "//";
		// res += getName() + ":" + getLength();

		return res;
	}

}
