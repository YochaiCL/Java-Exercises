import java.util.Scanner;
public class Ex_8_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int num, sum=0;
		
		System.out.println("enter a number:");
		num= input.nextInt();
		
		while (num>=0) {
			sum+=num;
			System.out.println("enter a number:");
			num= input.nextInt();
		}
		System.out.println("the sum is "+sum);
	}

}
