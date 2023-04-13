import java.util.Scanner;
public class Ex_8_10 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int x,y,mult=0, sighn=1;
		
		x=input.nextInt();
		y=input.nextInt();
		
		if (y<0) {
			sighn=-1;
			y=-y;
		}
		while (y>0) {
			mult=mult+x;
			y--;
		}
		System.out.println(mult*sighn);
	}

}
