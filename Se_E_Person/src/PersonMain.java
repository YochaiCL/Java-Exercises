import java.util.Scanner;

public class PersonMain {

	public static void fillArray(Person[] arr) {

		Scanner input = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {

			System.out.println("Please enter the name of person " + (i + 1));
			String name = input.next();
			System.out.println("Please enter the height of person " + (i + 1));
			double height = input.nextDouble();
			System.out.println("Please enter the weight of person " + (i + 1));
			int weight = input.nextInt();

			arr[i] = new Person(name, height, weight);

		}
	}

	public static void printArr(Person[] arr) {

		for (int i = 0; i < arr.length; i++)

			System.out.println("Data of person " + (i + 1) + " " + arr[i].getName() + " " + arr[i].getHeight() + " "
					+ arr[i].getWeight());
	}

	public static void skinToFat(Person[] tmpPersons) {

		Person tmp;

		for (int i = 0; i < tmpPersons.length; i++)

			for (int j = 0; j < tmpPersons.length - 1; j++)

				if (tmpPersons[j].getWeight() > tmpPersons[j + 1].getWeight()) {
					tmp = tmpPersons[j];
					tmpPersons[j] = tmpPersons[j + 1];
					tmpPersons[j + 1] = tmp;
				}
	}

	public static void tallToSmall(Person[] tmpPersons) {

		Person tmp;

		for (int i = 0; i < tmpPersons.length; i++)

			for (int j = 0; j < tmpPersons.length - 1; j++)

				if (tmpPersons[j].getHeight() < tmpPersons[j + 1].getHeight()) {
					tmp = tmpPersons[j];
					tmpPersons[j] = tmpPersons[j + 1];
					tmpPersons[j + 1] = tmp;
				}
	}

	public static void main(String[] args) {

		Person[] persons = new Person[3];

		fillArray(persons);
		printArr(persons);

		skinToFat(persons);

		System.out.println("Show by weight:");

		printArr(persons);

		tallToSmall(persons);

		System.out.println("Show by height:");

		printArr(persons);

	}

}
