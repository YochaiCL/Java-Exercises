import java.util.Scanner;
public class Ex_3 {
	
	public static int factorial(int n){
	
	int result, I;
	
	for (I=1, result =1; I<=n; I++)
		
	result *= I;
	
	return result;
	}
	
	public static boolean check_input(int num) {
		
		if (num<0)
			return false;
		
		return true;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int res = factorial(4);
		
		System.out.println ("4! = "+ res);
		
		System.out.println ("\nEnter number for calculate factorial ");
		int num = input.nextInt() ;
		
		boolean check = check_input(num);
		
		if (check ==true) {
			
		res = factorial (num);
		
		System.out.println (num+"! = "+ res);
		
		System.out.println (num+1 +"! = "+factorial(num+1));
		}
		else
		System.out.println("the number is negtiv, no fatorial for negtiv numbers");
	}
}
