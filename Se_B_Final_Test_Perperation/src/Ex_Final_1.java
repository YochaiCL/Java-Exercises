import java.util.Scanner;
public class Ex_Final_1 {
	
	public static int biggerNumber (int x) {
		
		int num, max=0;
		
		while (x!=0) {
			
			num=x%10;
			
			if(num>max)
				max=num;
			
			x/=10;
		}
		return max;
	}
	
	public static int sumNumbers (int y, int z) {
		
		int num1, num2, sum;
		
		num1=biggerNumber(y);
		num2=biggerNumber(z);
		
		sum=num1+num2;
		
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int n1,n2, sum=0, min, sum3=0, count=0, mini1, mini2;
		
		System.out.println("please enter a number:");
		n1=input.nextInt();
		System.out.println("please enter a number:");
		n2=input.nextInt();
		
		min=sumNumbers(n1, n2);
				
		mini1=n1;
		mini2=n2;
		
		while (n1!=-1 && n2!=-1) {
			
			sum=sumNumbers(n1, n2);
			
			if (sum<min) {
				min=sum;
				mini1=n1;
				mini2=n2;
			}
				
			if (n1>99 && n1<1000) {
				
				if(n1%7==0)
				sum3+=n1;
				count++;}
			
			if(n2>99 && n2<1000) {
				
				if(n2%7==0)
				sum3+=n2;
				count++;}
			
			System.out.println("the biggest sum numbers are: "+sum);
			
			System.out.println("please enter a number:");
			n1=input.nextInt();
			System.out.println("please enter a number:");
			n2=input.nextInt();
		}
		
		System.out.println("the min sum numbers are: "+mini1+" "+mini2);
		System.out.println("the avg of 3 dig numbers are: "+(sum3/count));
	}

}
