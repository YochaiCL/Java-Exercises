import java.util.Scanner;
public class Ex_2 {
	
	public static int sum_digit(int num) {
		
		int tmp=0;
		
		while (num!=0) {
			tmp+=num%10;
			num/=10;
		}
		return tmp;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int x, min=9999, result=0;
		System.out.println("enter a number:");
		x = input.nextInt();
		
				
		while (x>0) {
			System.out.println(result=sum_digit(x));
			
			if (result<min && result>0)
				min=result;
			
			System.out.println("enter a number:");
			x = input.nextInt();
		}
		System.out.println("min="+min);
		
		

	}

}
