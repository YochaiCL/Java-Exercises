import java.util.Scanner;
public class Ex_8_7 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int num1, num2, sum, sumTotal;
		
		System.out.println("enter 2 numbers:");
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		sumTotal = num1 + num2;
		
		System.out.print("the resulte is: "+num1+" "+num2);
		//αμι ln

		while (sumTotal<2000) {
			sum = num1 + num2;
			
			System.out.print(" "+sum);
			//αμι ln
			
			sumTotal += sum;
			
			num1=num2;
			
			num2=sum;
		}
	}

}
