import java.util.Scanner;
public class Ex_1 {
	
	public static boolean digit (int num, int dig) {
		
		boolean flag=false;
		
		while (flag!=true && num!=0) {
						
			if (num%10==dig)
				flag=true;
			
			else
				flag=false;
			
			num/=10;
		}
		return flag;
	}
	
	public static boolean number (int num1, int num2) {
		
		int digNum1;
		
		boolean result=true;
		
		while (result!=false && num1!=0) {
			
			digNum1=num1%10;
			
			result=digit(num2, digNum1);
			
			num1/=10;
		}
		return result;
	}
		

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		
		int m, i=1, num1, num2;
		boolean flag=true, result=true;
		
		System.out.println("please enter a positiv dig number:");
		m=input.nextInt();
		
		while (i<=m) {
			
			System.out.println("please enter 2 numbers:");
			num1=input.nextInt();
			num2=input.nextInt();
			
			System.out.println("the numbers are: num1="+num1+" num2="+num2);
			
				flag=number(num1, num2);
				if(flag==false)
					result=false;
				
				flag=number(num2, num1);
				if(flag==false)
					result=false;
			
			if (result==true)
				System.out.println("do the numbers contain the same digits? YES!!");
			
			if (result==false)
				System.out.println("do the numbers contain the same digits? NO!!");
			
			i++;
			result=true;
		}
	}

}
