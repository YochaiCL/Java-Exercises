import java.util.Scanner;
public class Ex_8_9 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int x,y,mult=0;
		
		x=input.nextInt();
		y=input.nextInt();
		
		while (y>0) {
			mult=mult+x;
			y--;
		}
		System.out.println(mult);
	}

}
