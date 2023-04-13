import java.util.Scanner;
public class Ex_1__ {
	
	public static int max (int num) {
		
		int maxDig, max=0;
		
		while (num!=0) {
			
			maxDig=num%10;
			
			if (maxDig>max)
				max=maxDig;
			
			num/=10;	
		}	
		return max;
	}
	
	
	public static int max2Digids (int n1, int n2) {
		
		int sum=0,result1, result2;
		
		result1=max(n1);
		result2=max(n2);
		
		sum=result1+result2;
		
		return sum;
	}
	

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		
		int num1, num2, result, min=20, count=0, count7=0, sum7=0, numMIn1=0, numMIn2=0;
		
		System.out.println("please enter 2 numbers");
		num1=input.nextInt();
		num2=input.nextInt();
		
		
		while (num1!=-1 && num2!=-1) {
			
			result=max2Digids(num1, num2);
			
			System.out.println("the sum of two big digits in the two numbers is:"+result);
			
			if (result<min) {
				numMIn1=num1;
				numMIn2=num2;
				min=result;}
			
			if (result%7==0)
				count++;
			
			if (num1>99) {
				
				if (num1%7==0) {
					sum7+=num1;
					count7++;}}
			
			if (num2>99) {
					
				 if (num2%7==0) {
					sum7+=num2;
					count7++;}}
			
			System.out.println("please enter 2 numbers");
			num1=input.nextInt();
			num2=input.nextInt();		
		}
		System.out.println("the min sum of two big digits in the two numbers are "+numMIn1+" & "+numMIn2+" is:"+min);
		
		if (count7>0)
			System.out.println("the min avrage three-digit numbers is:"+(sum7/count7));
		
		else
			System.out.println("Error you cant divided with 0");
	}
}
