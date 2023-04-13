import java.util.Scanner;

public class Ex_12_2_negetiv {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		double x, mult=1;
		int y;
		boolean flag=false;
		
		System.out.println("please enter x:");
		x= input.nextDouble();
		System.out.println("please enter y:");
		y= input.nextInt();
		
		if (y<0) {
			flag = false;
			y=-y;//מעבירים את y לערך חיובי כי כבר בהדפסה עשינו את החישוב עבור חזקה שלילית
		}
		
		for (int i=1; i<=y; i++)
			mult*=x;
		
		if (flag)
			System.out.println("the result is "+mult); 
		else
			System.out.println("the result is "+1/mult); 
	}

}
