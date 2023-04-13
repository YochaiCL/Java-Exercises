
public class Ex_11 {

	public static double check(int[] a, int p, int q) {
		if (p == q)
			return a[p];
		else if (p + 1 == q)
			return (double) (a[p] + a[q]) / 2;
		else
			return check(a, p + 1, q - 1);
	}

	public static boolean secret(int[] a, int p) {
		if (p == a.length - 1)
			return true;
		else
			return a[p] > check(a, p + 1, a.length - 1) && secret(a, p + 1);
	}

	public static void main(String[] args) {
		
		int [] a= {2,10,12,3,7,4,1};
		
		int [] b= {17,10,4,3,8};
		
		System.out.println(check(a,0,5));
		
		System.out.println(secret(b,0));

	}

}
