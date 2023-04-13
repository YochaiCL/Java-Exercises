import java.util.Scanner;
public class Ex_10_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int num, i=1;
		boolean flag=true;
		
		while (i<=15) {
			System.out.println("enter a number:");
			num = input.nextInt();
			
			if (i%2==1 && num%2==1  ) 
				flag=false;
		
			i++;
		}
		
		if (flag)
			System.out.println("all the numbers is even");
		else
			System.out.println("not all numbers is even");
			
	}

}
