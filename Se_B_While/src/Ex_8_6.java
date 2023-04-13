import java.util.Scanner;
public class Ex_8_6 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int boys, girls, count=0;
		
		System.out.println("enter the number of boys and girls:");
		boys = input.nextInt();
		girls = input.nextInt();
		
		while (boys !=-1 || girls !=-1) {
			/* נתונים אחרונים הם לבנות -1 וגם לבנים זה -1
			   לכן בלולאה זה יהיה הפוך
			   כל עוד בנים או בנות הם לא -1
			 */
			System.out.println("the sun is: "+boys+girls);
			
			if (boys == girls)
				count++;
			
			System.out.println("enter the number of boys and girls:");
			boys = input.nextInt();
			girls = input.nextInt();
		}
		System.out.println("the amount is: "+count);
	}
}
