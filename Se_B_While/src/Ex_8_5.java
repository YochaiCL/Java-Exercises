import java.util.Scanner;
public class Ex_8_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int x,y;
		
		System.out.println("enter 2 numbers:");
		x=input.nextInt();
		y=input.nextInt();
		
		while (x!=0 || y!=0) {
			System.out.println(Math.min(x, y)+" "+Math.max(x, y));
			x=input.nextInt();
			y=input.nextInt();
		}
	}

}
