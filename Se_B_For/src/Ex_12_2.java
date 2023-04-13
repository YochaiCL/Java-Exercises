import java.util.Scanner;
public class Ex_12_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int store; //לולאה חיצונית
		int pen; //לולאה פנימית
		double price, sum, max=0, maxi=0;
		
		for (store=1; store<=8; store++) {
			
			for (pen=1, sum=0; pen<=5; pen++) {
				System.out.print("enter the price of pen number "+pen+" in store "+store);
				price = input.nextDouble();
				
				sum+=price;
			}
			
			if (sum>max) {
				max=sum;
				maxi=store;
			}	
		}
		System.out.println("the max price is "+max+" in store "+maxi);
	}

}
