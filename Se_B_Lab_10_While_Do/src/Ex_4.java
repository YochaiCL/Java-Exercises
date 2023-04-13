import java.util.Scanner;
public class Ex_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int mone=0;
		float num,avg,sum=0;
		System.out.println ("Enter a number. The last one will be 0");
		num = input.nextInt();
		while (num!=0)
		{
		mone++;
		sum+=num;
		System.out.println ("Enter a number. The last one will be 0");
		num = input.nextInt();
		}
		avg=sum/mone;
		System.out.println ("the average is "+ avg);

	}

}
