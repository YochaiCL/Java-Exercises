import java.util.Scanner;
public class Ex_13_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		double sum=0;
		int count=0;
		
		for (int i=1; Math.ceil(sum*1000)/1000.0 < 0.5 ; i+=2) {
			
			sum+=1.0/(i*(i+2));
			count++;
			System.out.println(sum);
		}
		
	}
}
