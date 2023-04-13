import java.util.Scanner;
public class Ex_12_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("enter the number of days:");
		int days = input.nextInt();
		
		int fuel, sum=0, sumall=0;
		
		for (int day=1; day<=days; day++) {
			
			System.out.println("enter the fuel of 20 drivers of day: "+day);
			
			sum=0;
			
			for (int driver =1; driver <=20; driver++) {
				
				fuel  = input.nextInt();
				sum+=fuel ;
			}
			
			sumall+=sum;
			
			System.out.println("in day "+day+" all the fuel is: "+sum);
		}
		System.out.println("in all days the fuel is: "+sumall);

	}

}
