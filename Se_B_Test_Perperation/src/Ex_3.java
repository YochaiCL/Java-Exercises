import java.util.Scanner;
public class Ex_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int num, i;
		boolean flag ;
		
		for(i=0;i< 5; i++)
		{
		num = input.nextInt() ;
		
		flag = true ;
		
		System.out.println (" "+num);
		
		while (num >= 10)
		{
		if (num%100/10 > num%10)
		flag = flag;
		else
		flag = false;
		num /= 10;
		}
		System.out.println ( !flag ? "no" : "yes");
	}}
}
