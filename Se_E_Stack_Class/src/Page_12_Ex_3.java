import unit4.collectionsLib.Stack;
import java.util.Scanner;

public class Page_12_Ex_3 {
	
	// The complicity in O(n)

	public static void isPolindrom(Stack<Character> s, int n) {

		Scanner input = new Scanner(System.in);

		char ch;
		int i;
		boolean flag = true;

		// We import characters until n/2
		for (i = 0; i < n / 2; i++) {
			System.out.println("PLease enter character number " + (i + 1));
			ch = input.next().charAt(0);
			s.push(ch);
		}

		// If n is odd so we know that the middale character is unrelevent
		if (n % 2 == 1) {
			System.out.println("PLease enter character number " + (i + 1));
			ch = input.next().charAt(0);
			i++;
		}

		// We are checking if the next inputs are equal to the helf of Stack
		for (; i < n && flag; i++) {
			System.out.println("PLease enter character number " + (i + 1));
			ch = input.next().charAt(0);

			if (ch != s.pop())
				flag = false;
		}

		if (flag)
			System.out.println("This is polindrom");

		else
			System.out.println("This is NOT polindrom");

	}

	public static void main(String[] args) {

		int n = 5;

		Stack<Character> s = new Stack();

		isPolindrom(s, n);

//		PLease enter character number 1
//		a
//		PLease enter character number 2
//		b
//		PLease enter character number 3
//		c
//		PLease enter character number 4
//		a
//		This is NOT polindrom

//		PLease enter character number 1
//		a
//		PLease enter character number 2
//		b
//		PLease enter character number 3
//		c
//		PLease enter character number 4
//		b
//		PLease enter character number 5
//		a
//		This is polindrom

	}

}
