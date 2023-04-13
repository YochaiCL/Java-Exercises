
public class Adult {

	// Privates
	private String name;
	private int id;
	private String profession;

	// Constractors
	public Adult(String tmpName, int tmpId, String tmpProfession) {
		setName(tmpName);
		setId(tmpId);
		setProfession(tmpProfession);
	}

	public Adult(String tmpName, int tmpId) {
		this(tmpName, tmpId, "");
	}

	public Adult(Adult other) {
		this.name = other.name;
		this.id = other.id;
		this.profession = other.profession;
	}

	// Get
	public String getName() {
		return this.name;
	}

	public int getId() {
		return this.id;
	}

	public String getProfession() {
		return this.profession;
	}

	// Set
	public boolean setName(String tmpName) {
		if (tmpName.length() > 0) {
			this.name = tmpName;
			return true;
		}
		return false;

	}

	private boolean setId(int tmpId) {
		int count = 0;
		int checkId = tmpId;
		while (checkId > 0) {
			checkId /= 10;
			count++;
		}
		if (count == 9) {
			this.id = tmpId;
			return true;
		}
		return false;

	}

	public boolean setProfession(String tmpProfession) {
		if (tmpProfession.length() > 0) {
			this.profession = tmpProfession;
			return true;
		}
		return false;
	}

	// Show
	public void show() {
		if (this.profession == "")
			System.out.println("name: " + this.name + " id: " + this.id);

		else
			System.out.println("name: " + this.name + " id: " + this.id + " Profession: " + this.profession);
	}

}
