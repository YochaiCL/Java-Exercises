import java.util.Scanner;
public class Ex_10_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int i=1, num;
		boolean flag =true; // all numbers are divided by 5
		
		while (i<=15) {
			num = input.nextInt();
			
			if (num%5!=0)
				flag = false; //not all numbers are didvided by 5
			i++;
		}
		if (flag)//לא חייב לרשום אם הוא נכון או לא - בריררת מחדל היא נכון
			System.out.println("all numbers are divided by 5");
		else
			System.out.println("not all numbers are divided by 5");

	}

}
