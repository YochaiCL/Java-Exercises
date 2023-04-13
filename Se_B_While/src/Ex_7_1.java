import java.util.Scanner;

public class Ex_7_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int num1, num2, i=1,sum=0;
		
		while (i<=10) {
			System.out.println("enter two numbers:");
			num1 = input.nextInt();
			num2 = input.nextInt();
			
			sum+=num1*num2;
			
			i++;
		}
		System.out.println("the result is: "+sum);
		
		if(sum>100)
			System.out.println("the sqrt is: "+Math.sqrt(sum));
		
		else
			System.out.println("the abs is: "+Math.abs(sum));
	}

}
