package Cat;

public class StreetCat extends Cat {

	private int fight;

	StreetCat(String tmpName, double tmpLength, String tmpColor, int tmpFight) {
		super(tmpName, tmpLength, tmpColor);
		setFight(tmpFight);
	}

	public int getFight() {
		return fight;
	}

	public void setFight(int fight) {
		this.fight = fight;
	}

	@Override
	public String toString() {
		return super.toString() + " StreetCat [fight=" + fight + "]";
	}

}
