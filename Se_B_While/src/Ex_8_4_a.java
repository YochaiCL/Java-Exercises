import java.util.Scanner;
public class Ex_8_4_a {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int sum=0, num, a;
		
		System.out.println("enter a:");
		a = input.nextInt();
		
		System.out.println("enter a num:");
		num = input.nextInt();
		
		sum+=num;
		
		while (sum<a) {
			System.out.println("enter a num:");
			num = input.nextInt();
			
			sum+=num;
		}
		System.out.println("the sum is: "+sum);
	}
}
