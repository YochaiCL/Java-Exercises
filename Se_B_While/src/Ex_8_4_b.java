import java.util.Scanner;
public class Ex_8_4_b {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int sum=0, num, a, b, count=0;
		
		System.out.println("enter a:");
		a = input.nextInt();
		System.out.println("enter a:");
		b = input.nextInt();
		
		System.out.println("enter a num:");
		num = input.nextInt();
		
		sum+=num;
		count++;
		
		while (sum<a && count !=b) {
			/*עוצרים את הללולאה כאשר :
			sum>a || count ==b
			ובלולאה כל עוד
			sum<a && count!=b
			*/
			
			System.out.println("enter a num:");
			num = input.nextInt();
			
			sum+=num;
		}
		System.out.println("the sum is: "+sum);
	}
}
