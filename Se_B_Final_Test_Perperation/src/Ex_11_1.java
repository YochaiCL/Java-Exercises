import java.util.Scanner;
public class Ex_11_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int num, oldNumber=0;
		
		boolean flag=true, result=true;
		
		System.out.println("please enter a series of numbers:");
		num=input.nextInt();
		
		while (num!=-999) {
					
			if (num>oldNumber) 
				flag=true;
			
			else
				flag=false;
			
			if (flag==false)
				result=false;
			
			oldNumber=num;
						
			System.out.println("please enter a series of numbers:");
			num=input.nextInt();		
		}
		
		if(result)
		System.out.println("the numbers are Really sorted number");
		
		else
			System.out.println("the numbers are NOT!!! Really sorted number");
	}

}
