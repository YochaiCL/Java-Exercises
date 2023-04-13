import java.util.Scanner;

public class Ex_9 {
	
	public static boolean chackOneArray(String str) { // result with one array
		
		int[] count = new int[26];
		
		for (int i = 0; i < str.length(); i++) {

			if ((int) str.charAt(i) >= 65 && (int) str.charAt(i) <= 90)

				count[(int) (str.charAt(i)) - 'A']++;

			if ((int) str.charAt(i) >= 97 && (int) str.charAt(i) <= 122)

				count[(int) (str.charAt(i)) - 'a']--;
			
		}
			
			boolean flag = true;

			for (int i = 0; i < count.length && flag; i++) {

				if (count[i] > 0 || count[i] <0)
					flag = false;
			}

			return flag;
		}
	

	public static boolean chack(String str) { // result with 2 arrays

		int[] small = new int[26];
		int[] big = new int[26];

		for (int i = 0; i < str.length(); i++) {

			if ((int) str.charAt(i) >= 65 && (int) str.charAt(i) <= 90)

				big[(int) (str.charAt(i)) - 'A']++;

			if ((int) str.charAt(i) >= 97 && (int) str.charAt(i) <= 122)

				small[(int) (str.charAt(i)) - 'a']++;
		}

		boolean flag = true;

		for (int i = 0; i < big.length && flag; i++) {

			if (big[i] != small[i])
				flag = false;
		}

		return flag;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("please enter string:");

		String str = input.next();

		System.out.println(chackOneArray(str));

	}

}
