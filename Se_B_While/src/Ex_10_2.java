import java.util.Scanner;
public class Ex_10_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int num, i=1;
		boolean flag= true;
		
		while (i<=10) {
			System.out.println("enter a number:");
			num = input.nextInt();
			
			if(num%i!=0)
				flag=false;
			i++;
		}
		if (flag)//לא חייב לרשום אם הוא נכון או לא - בריררת מחדל היא נכון
			System.out.println("all numbers are divided by i");
		else
			System.out.println("not all numbers are divided by i");
	}

}
