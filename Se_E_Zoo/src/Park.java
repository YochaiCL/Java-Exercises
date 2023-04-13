import java.util.Arrays;

import unit4.collectionsLib.Stack;

public class Park {

	private final int DEFAULT_SIZE = 1000;
	private Animal[] park;
	private int count;

	public Park() {
		park = new Animal[DEFAULT_SIZE];

	}

	public void addAnimalToPark(Animal a) {
		for (int i = 0; i < this.park.length; i++) {
			if (this.park[i] == null) {
				this.park[i] = a;
				this.count++;
				break;
			}
		}

	}

	public void deleteFromArr(int index) {

		park[index] = null;

		for (int i = index; i < this.park.length - 1; i++) {

			park[i] = park[i + 1];

		}
	}

	public Animal[] aboveAge10AndPredetor() {
		Stack<Animal> st = new Stack<Animal>();

		int count10 = 0;
		for (int i = 0; i < this.park.length; i++) {
			if (this.park[i] != null)
				if (this.park[i].getAge() > 10 && this.park[i].isPredetor() == true) {
					st.push(this.park[i]);
					count10++;
				}
		}

		Animal[] arr = new Animal[count10];
		int index = 0;

		while (!st.isEmpty()) {
			arr[index++] = st.pop();
		}

		return arr;

	}

	public int countOfPredetorsReptilesAndBirds() {

		int count = 0;

		for (int i = 0; i < this.park.length; i++) {
			if (this.park[i] != null) {

				if (this.park[i] instanceof Bird) {

					if (this.park[i].isPredetor() == true)

						count++;
				}

				else if (this.park[i] instanceof Reptile) {

					if (this.park[i].isPredetor() == true)

						count++;
				}
			} else
				break;
		}

		return count;

	}

	public int getCount() {
		return this.count;
	}

	public Animal getAnimal(int index) {
		return this.park[index];
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(park);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Park other = (Park) obj;
		return Arrays.equals(park, other.park);
	}

}
