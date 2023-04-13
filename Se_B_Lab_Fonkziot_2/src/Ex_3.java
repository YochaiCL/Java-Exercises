import java.util.Scanner;
public class Ex_3 {
	
	public static boolean prime (int num) {
		
		boolean flag=true;
	
		if (num>1) {
			
			for (int j=2; j<num; j++) 
				
				if (num%j==0)
					flag=false;
	}
		else if (num<=0)
			flag=false;
		
		return flag;
	}
	
	public static int special (int sp) {
		
		boolean result;
		int sum=0;
		
		for (int i=1; i<sp; i++) {
			
			result=prime(i);
			
			if (result==true)
				sum+=i;
		}
		
		if (sum/2==sp)
			return 1;
		
		else
			return 0;
	}
	
	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		
		int num,result;
		
		for (int i=1; i<=100; i++) {
			
			System.out.println("please enter a number:");
			num=input.nextInt();
			
			result=special(num);
			
			if (result==1)
				System.out.println("the number:"+num+" is special\n");
			
			else
				System.out.println("the number:"+num+" is NOT! special\n");
		}
	}
}
