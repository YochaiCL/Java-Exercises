import java.util.Scanner;
public class Ex_7_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		double num1, num2, num3, avg, i=1;
		
		while (i<=100) {
			System.out.println("enter numbers");
			num1 = input.nextDouble();
			num2 = input.nextDouble();
			num3 = input.nextDouble();
			
			avg = (num1+num2+num3)/3;
			
			System.out.println("the avg is "+avg);
			
			System.out.println((num1==avg)?"yes":"no");
			i++;
		}

	}

}
