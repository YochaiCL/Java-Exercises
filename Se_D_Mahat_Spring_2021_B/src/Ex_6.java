import java.util.Scanner;

public class Ex_6 {
	// הפונקציה בודקת אם ספרות האחדות של n1 שווה לספרות המאות של n2
	public static boolean what(int n1, int n2) {
		while (n2 > 9) {
			n2 = n2 / 10;
		}
		if (n1 % 10 == n2)
			return true;
		return false;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println(what(183, 39));
		
		//255,526,621,222,221

		System.out.println("enter a number:");
		int n1 = input.nextInt();
		boolean ok = true;
		int n2, count = 1;
		while (ok == true) {
			System.out.println("enter a number:");
			n2 = input.nextInt();
			count++;
			ok = what(n1, n2);
			n1 = n2;
		}
		System.out.println(count);

	}

}
