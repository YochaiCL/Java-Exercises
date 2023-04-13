import java.util.Scanner;
public class Ex_12_6_b {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int n;
		
		System.out.println("Please write down how many stars the sides of the triangle will have:");
		n = input.nextInt();//משתנה n אשר קולט את מספר הכוכביות בכל צלע
		
		for (int i=1;i<=n;--n) {
			
			for (int j=1;j<=n;j++)
				System.out.print("*");
			
			System.out.println();		
		}
	}
}
