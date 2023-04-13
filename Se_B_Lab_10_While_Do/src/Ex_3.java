import java.util.Scanner;
public class Ex_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int n=1, num, i=1;
		double x,result, sum=0;
		
		System.out.println("To what number would you like to calculate ");
		num = input.nextInt();
		
		System.out.println("please writh the value of x");
		x = input.nextDouble();
		  
		do {
			result = n*Math.pow(x,n-1);
			sum+=result;
			System.out.println(result);
			i++;
			n++;
		}
		while(i<=num);
		
		System.out.println("the sum is: "+sum);
	}

}
