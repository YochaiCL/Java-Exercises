import java.util.Scanner;
public class Ex_8_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		double num, sum=0, count=0;
		
		System.out.println("enter a number ");
		num = input.nextDouble();
		
		while (num<=100) {
			sum+=num;
			count++;
			System.out.println("enter a number ");
			num = input.nextDouble();
		}
		System.out.println("the sum is "+sum);
		
		if(count != 0)
			System.out.println("the avg is "+sum/count);
	}

}
