
public class Ex_4_Actor {

	private String name;
	private int age;
	private int numAct;

	public Ex_4_Actor(String name, int age, int numAct) {

		setName(name);
		setAge(age);
		setNumAct(numAct);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNumAct() {
		return numAct;
	}

	public void setNumAct(int numAct) {
		this.numAct = numAct;
	}

}
