import java.util.Scanner;
public class Ex_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);

		boolean flag;
		int i;
		
		System.out.println("please check a if number is a prime, enter a number:");
		i=input.nextInt();
		
		while (i<0){
			System.out.println("negtive number are not prime ");
			System.out.println("please check a if number is a prime, enter a number:");
			i=input.nextInt();
		}
		
		while (i==1) {
			System.out.println("the number "+i+" is a Not! prime please writh numbers bigger than 1 ");
			System.out.println("please check a if number is a prime, enter a number:");
			i=input.nextInt();
		}
		
		for ( ;i>1 ; i=input.nextInt()) {
			
			flag = true;//אנו קובעים כבר עכשיו שהמספר הוא ראשוני
			
		for (int j=2; j<i; j++) 
			
			if (i%j==0)
				flag=false;
			
			if (flag)
				System.out.println("the number "+i+" is a prime");
			
			else
				System.out.println("the number "+i+" is a Not! prime");
		
				}
			
					
	}
}




	
	
	

