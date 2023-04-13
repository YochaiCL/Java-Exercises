import java.util.Scanner;

public class Ex_5 {

	public static void fillData(Ex_5_Data[] arr) {

		Scanner input = new Scanner(System.in);
		int fMount;
		int sMount;
		int id;

		for (int i = 0; i < arr.length; i++) {

			System.out
					.println("Please enter amount of connection problems in the first mount of user " + (i+1));
			fMount = input.nextInt();
			System.out
					.println("Please enter amount of connection problems in the second mount of user " + (i+1));
			sMount = input.nextInt();

			arr[i] = new Ex_5_Data(fMount, sMount);

			System.out.println("Pleas enter ID of the user:");
			id = input.nextInt();

			arr[i].setId(id);

		}

	}

	public static void printData(Ex_5_Data[] arr) {

		int sumFM = 0;
		int sumSM = 0;
		int countSM = 0;
		int min = Math.abs((arr[0].getFirstMount() - arr[0].getSecondeMount()));
		int check;

		for (int i = 0; i < arr.length; i++) {

			sumFM += arr[i].getFirstMount();
			sumSM += arr[i].getSecondeMount();

			if (arr[i].getFirstMount() < arr[i].getSecondeMount())
				countSM++;

			check = Math.abs((arr[i].getFirstMount() - arr[i].getSecondeMount()));
			if (check < min)
				min = check;
		}

		if (sumFM > sumSM)
			System.out.println("Yes, in the first mount was more problems");
		else
			System.out.println("No, in the first mount was less problems");

		System.out
				.println("The number of costumers that in the was more problems in the second mounts are: " + countSM);

		System.out.println("The id numbers where was the less problems:");
		for (int i = 0; i < arr.length; i++) {
			check = Math.abs((arr[i].getFirstMount() - arr[i].getSecondeMount()));
			if (min == check)
				System.out.println(arr[i].getId());
		}
	}

	public static void main(String[] args) {

		Ex_5_Data[] arr = new Ex_5_Data[5];

		fillData(arr);

		printData(arr);

	}

}
