import java.util.Scanner;
public class Ex_2 {
	
	public static int sum (int num) {
		
		int x=0;
		
		while (num!=0) {
			
			x+=num%10;
			num/=10;
		}
		return x;	
	}
	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		
		int num, result, min=0;
		
		System.out.println("please enter a number:");
		num=input.nextInt();
		
		if (num>0)
			min=sum(num);
		
		while (num>0) {
			
			result=sum(num);
			
			System.out.println("the sum of "+num+" is: "+result);
			
			if (result<min)
				result=min;
			
			System.out.println("please enter a number:");
			num=input.nextInt();
		}
		
		if (num<0)
			System.out.println("the number is negetive");
		
		System.out.println("the most min sum is:"+min);
	}
}
