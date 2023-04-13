import java.util.Scanner;
public class Ex_1 {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner (System.in);
		
		int num1,num2, sum=0, countNum=0,counteven=0;
		boolean flag=true;
		
		System.out.println("please enter two numbers:");
		num1=input.nextInt();
		num2=input.nextInt();
		
		if (num1+num2==0)
			flag=false;
		
		while (flag) {
			
			//1
			countNum+=2;
			
			//2
			if(num1>0)
				sum+=num1;
			
			if(num2>0)
				sum+=num2;
			
			//3
			if (num1==num2)
				counteven++;
			
			System.out.println("please enter two numbers:");
			num1=input.nextInt();
			num2=input.nextInt();
			
			if (num1+num2==0)
				flag=false;
		}		
		System.out.println("the amount of numbers is: "+countNum);
		System.out.println("the sum of all positive numbers are :"+sum);
		System.out.println("the amount of even numbers is: "+counteven);
	}
}
