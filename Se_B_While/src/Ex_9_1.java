import java.util.Scanner;
public class Ex_9_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int num, sum=0, dig;
		
		System.out.println("enter a number:");
		num = input.nextInt();
		
		while (num !=0) {
			dig =num%10;
			num /=10;
			sum+=dig;
		}
		System.out.println("the sum is "+sum);
	}

}
