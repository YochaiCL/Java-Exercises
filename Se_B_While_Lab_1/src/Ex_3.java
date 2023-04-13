import java.util.Scanner;
public class Ex_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int i=1,num,sum=0,avg=0;
		
		System.out.println("please enter 10 numbers:");
		
		while(i<=10) {
			
			num = input.nextInt();
			
			sum+=num;
						
			i++;
		}
		
		avg=sum/10;
		System.out.println("the sum is:"+sum);
		System.out.println("the avg is:"+avg);
	}

}
