import java.util.Scanner;

public class Ex_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num;
		
		do {
			System.out.println("please enter how much numbers do you want in the array, the number must be positive:");
			num = input.nextInt();
		} while (num < 0);

		int numbers, rang = 99 - 10 + 1;

		int[] arr = new int[num];

		for (int i = 0; i < arr.length;) {
			
			numbers = (int) (Math.random() * rang) + 10;
			
			if ((numbers % 10) > (numbers / 10)) {
				arr[i] = numbers;
				i++;
			}
		}
		for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
