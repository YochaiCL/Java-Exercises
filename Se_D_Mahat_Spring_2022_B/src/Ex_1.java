import java.util.Random;

public class Ex_1 {

	public static void rndZero() {

		int rnd1, rnd2, count = 0, countPos = 0;
		Random rnd = new Random();

		do {

			rnd1 = rnd.nextInt() % 16;
			rnd2 = rnd.nextInt() % 16;
			count += 2;

			if (rnd1 > 0)
				countPos++;

			if (rnd2 > 0)
				countPos++;
			
			System.out.print(rnd1+" "+rnd2+"\n");
			

		} while (rnd1 != 0 || rnd2 != 0); // until the test condition evaluates to false. 
		/*
		 * (rnd1 != 0 && rnd2 != 0);
		 * true && false ==> false
		 * 
		 * (rnd1 != 0 || rnd2 != 0);
		 * true || false ==> true
		 * false || false ==>false
		 */

		System.out.println("The amount of numbers that created are: " + count);

		System.out.println("The amount of positive numbers that created are: " + countPos);

	}

	public static void main(String[] args) {

		rndZero();

	}

}
