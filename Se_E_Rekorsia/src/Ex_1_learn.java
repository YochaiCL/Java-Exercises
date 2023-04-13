public class Ex_1_learn {
	

	public static int mysterySum(int n) {

		if (n == 1)
			return 1;

		int sum = n;

		for (int i = 1; i < n; i++)
			sum = sum + mysterySum(i);

		return sum;
	}

	public static void main(String[] args) {
		
		System.out.println(mysterySum(3));

	}

}
