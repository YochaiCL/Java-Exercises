
public class Ex_1_A {
	
	public static boolean sod (int a, int b) {
		
		if(a==b+1)
			return true;

		if (b==a+1)
			return true;
		
		return false;
	}

	public static void main(String[] args) {
		
		System.out.println(sod(7,4));
		
		System.out.println(sod(4,3));
		
		System.out.println(sod(3,4));

	}

}
