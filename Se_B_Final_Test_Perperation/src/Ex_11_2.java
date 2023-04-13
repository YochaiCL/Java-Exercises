import java.util.Scanner;
public class Ex_11_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int num, oldNumber, count=0, max=0;
		
		boolean flag=true, result=true;
		
		System.out.println("please enter a series of numbers:");
		num=input.nextInt();
		
		oldNumber=num;
		
		while (num!=-999) {
					
			if (num>oldNumber) 
				count++;
			
			else
				count=0;
			
			oldNumber=num;
			
			if (count>max)
				max=count;
						
			System.out.println("please enter a series of numbers:");
			num=input.nextInt();		
		}
		
		System.out.println("the max is:"+max);		
	}
}
