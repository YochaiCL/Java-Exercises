import java.util.Scanner;
public class Ex_12_6_d {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int n;
		
		System.out.println("please writh a number:");
		n = input.nextInt();
		
		for (int i=1; i<=n; i++) {
			
			for(int j=1; j<=i; j++)
				System.out.print(j);
		
		System.out.println();
	}}
}
