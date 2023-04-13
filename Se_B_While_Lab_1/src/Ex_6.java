import java.util.Scanner;
public class Ex_6 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int num1,num2,sum=0,i=1, mult=1;
		
		while(i<=10) {
			System.out.println("please enter 2 numbers:");
			num1 = input.nextInt();
			num2 = input.nextInt();
			
			mult=(num1*num2);
			System.out.println("mult= num1 * num2=:"+mult);
			
			sum+=num1+num2;
			
			i++;
		}
		
		System.out.println((sum>100)?"bigger than 100":"small than 100");
		
	}

}
