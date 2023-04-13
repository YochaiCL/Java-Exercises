
public class Person {

	private String name;
	private Person couple;

	// Constractors

	public Person(String tmpName) {
		this(tmpName, null);
	}

	public Person(String tmpName, Person tmpCouple) {

		setName(tmpName);
		setCoupleOption2(tmpCouple);

	}

	// Get
	public String getName() {
		return name;
	}

	public Person getCouple() {
		return couple;
	}

	// Set this name
	public boolean setName(String tmpName) {
		if (tmpName.length() > 0) {
			this.name = tmpName;
			return true;
		}
		return false;
	}

	// Set couple option 1
	public boolean setCoupleOption1(Person tmpCouple) {
		// this.couple != tmpCouple for stop endless loop
		// if its != so we have a new couple
		if (this.couple != tmpCouple)
			// if both are not married / if thy are both singles
			if (this.couple == null && tmpCouple == null) {
				// get them both married 
				this.couple = tmpCouple;

				tmpCouple.couple = this;

				return true;

			} else {
				// if one of the people are married so we need to divorce them
				if (this.couple != null)
					this.couple.couple = null;

				if (tmpCouple.couple != null)
					tmpCouple.couple.couple = null;
				
				// get them both married 
				this.couple = tmpCouple;
				tmpCouple.couple = this;

				return true;
			}

		return false;
	}

	// Set couple option 2
	public void setCoupleOption2(Person tmpCouple) {
		// if thy let me know that i'm divorc so i going to be alone = null
		if (tmpCouple == null)
			this.couple = null;

		else {
			// if we dont send the same couple
			// and also is't not me - (marreid to myself)
			if (this.couple != tmpCouple && this != tmpCouple) {
				// if i'm marreid 
				if (this.couple != null)
					// set me single
					this.couple.setCoupleOption2(null);
				// marreid me to tmpcouple
				this.couple = tmpCouple;
				
				// we check the couple of couple
				// if its null send my data
				if (tmpCouple.getCouple() == null)
					tmpCouple.setCoupleOption2(this);

				// if its not null, make it null and marreid her
				else if (tmpCouple.getCouple() != this) {
					tmpCouple.getCouple().setCoupleOption2(null);
					this.setCoupleOption2(this);
				}
			}
		}

	}

	// Show
	public void show() {

		if (this.couple != null)
			System.out.println(this.name + " " + this.couple.name);
		else
			System.out.println(this.name);

	}

}
