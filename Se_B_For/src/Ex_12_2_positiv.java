import java.util.Scanner;

public class Ex_12_2_positiv {

	public static void main(String[] args) {
		
			Scanner input = new Scanner (System.in);
			
			double x, mult=1;
			int y;
			
			System.out.println("please enter x:");
			x= input.nextDouble();
			System.out.println("please enter y:");
			y= input.nextInt();
			
			for (int i=1; i<=y; i++)
				mult*=x;
			
			System.out.println("the result is "+mult); 
	}
}
