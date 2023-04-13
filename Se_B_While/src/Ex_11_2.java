import java.util.Scanner;
public class Ex_11_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int i=1, n, num1,num2,tmp;
		
		System.out.println("enter the first two numbers:");
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		System.out.println("enter the amount of numbers:");
		n = input.nextInt();
		
		System.out.print("the resulte is: "+num1+" "+num2);//בלי ln//כדי להמשיך את ההדפסה בחלק למטה
		
		i+=2;
		
		while(i<=n) {
			tmp=num1+num2;
			System.out.print(" "+tmp);//בלי ln//הכל יהיה באותה שורה
			num1=num2;
			num2=tmp;
			i++;
		}
		
		/*
		 * 	enter the first two numbers:
			2
			5
			enter the amount of numbers:
			13
			the resulte is: 2 5 7 12 19 31 50 81 131 212 343 555 898
		 */

	}

}
