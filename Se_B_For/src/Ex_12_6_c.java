import java.util.Scanner;
public class Ex_12_6_c {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int n;
		
		System.out.println("Please write down how many stars the sides of the triangle will have:");
		n = input.nextInt();//משתנה n אשר קולט את מספר הכוכביות בכל צלע
		
		for (int i=1; i<=n; i++) {
			
			for (int j=1; j<=n-i; j++)
				System.out.print(" ");//רווחים
			/* n=5
			 * i=1
			 * j=1
			 * 
			 * 1<=5-1 => 1<=4 //עושה רווחים עד שמגיע ל 4<=4 // עושה 4 רווחים
			 * 1<=5-2 => 1<=3 //עושה רווחים עד שמגיע ל 3<=3 // עושה 3 רווחים
		     * 1<=5-3 => 1<=2 //עושה רווחים עד שמגיע ל 2<=2 // עושה 2 רווחים
		     * 1<=5-4 => 1<=1 //עושה רווחים עד שמגיע ל 1<=1 // עושה 1 רווח
			 * 1<=5-5 => 1<=0 //לא עושה כלום	
			 */
			
			for(int k=1; k<=i; k++)
				System.out.print("*");
			
			System.out.println();		
		}
	}
}
