import java.util.Scanner;
public class Ex_11_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int n, i=1, num,oldNumber;
		
		boolean flag=true, result=true;
		
		System.out.println("please enter how much numbers:");
		n=input.nextInt();
		
		System.out.println("please enter a number:");
		num=input.nextInt();
		
		i++;
		
		oldNumber=num;
		
		while (i<=n) {
		
			System.out.println("please enter a number:");
			num=input.nextInt();
			
			if (num%2==0 && oldNumber%2==1)
				flag=true;
			
			if (num%2==1 && oldNumber%2==0)
				flag=true;
			
			if (num%2==1 && oldNumber%2==1 || num%2==0 && oldNumber%2==0)
				flag=false;
			
			if (flag==false)
				result=false;
			
			oldNumber=num;
			
			i++;
		}
		
		if(result)
			System.out.println("It's a rotating numbers");
		
		else
			System.out.println("It's NOT a rotating numbers");	
	}
}
