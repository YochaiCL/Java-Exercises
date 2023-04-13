
public class Ex_1 {
	
	public static int print_number (int num) {
		
		int count=0;
		
		for (int i=10; i<=num; i+=10) {
			count++;
			System.out.println(i);
		}
		return count;
	}

	public static void main(String[] args) {
		
		int x;
		
		x=print_number(60);
		
		System.out.println("the amount of numbers is:"+x);
	}
}
