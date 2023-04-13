import java.util.Scanner;
public class Ex_2 {
	
	public static boolean prime (int num) {
		
		boolean flag=true;
		
		for (int j=2; j<num; j++) 
			
			if (num%j==0)
				flag=false;
		
		return flag;
	}

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
				
		int N, i=1, num1, num2;
		boolean flag=false, result=false;
		
		System.out.println("please enter a number:");
		N=input.nextInt();
		
		while (N>=i) {
			System.out.println("plese enter two numbers:");
			num1=input.nextInt();
			num2=input.nextInt();
			
			flag=prime(num1);
			if(flag==true)
				result=true;
			
			flag=prime(num2);
			if(flag==true)
				result=true;
			
			if (result==true)			
				System.out.println("Preliminary collection");
			
			if (result==false)
				System.out.println("Freak Collection ");
			
			i++;
			result=false;
		}
	}
}
