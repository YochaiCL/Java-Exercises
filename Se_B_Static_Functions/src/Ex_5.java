import java.util.Scanner;
public class Ex_5 {
	
	public static boolean digit(int num, int dig) {
			
			while (num!=0) {
				
				if (dig==num%10)
					return true;
				
				num/=10;
			}
			return false;}
	
	public static boolean digits (int num, int dig) {
	
		return digit(num,dig) && digit (num*num, dig) && digit(num*num*num, dig);
	}
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner (System.in);
		
		System.out.println("enter a digit");
		int d=input.nextInt();
		
		while (d<0 || d>9) {
			System.out.println("Eroor! enter positiv number");
			d=input.nextInt();	
		}
		
		for (int i=1; i<=100; i++)
			if (digits(i,d))
				System.out.println(i+"  ");
	}
}
