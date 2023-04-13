import java.util.Scanner;
public class Ex_3_ {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		
		boolean ok= false;
		System.out.println(" Enter num ");
		int num = input.nextInt();
		while( num != -1 )
		{
		if (num % 2 == 0)
		ok = true;
		else
		ok = false;
		System.out.println(" Enter num ");
		num = input.nextInt();
		}
		if ( ok )
		System.out.println(" סדרת מספרים זוגיים ");
		else
		System.out.println(" סדרת מספרים שלמים ");
		
		num=-1%2;
		System.out.println(num);

	}

}
