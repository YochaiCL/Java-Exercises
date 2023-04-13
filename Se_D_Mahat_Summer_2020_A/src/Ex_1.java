import java.util.Scanner;
public class Ex_1 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner (System.in);
		
		int num, count=0, countZogi=0, countPos=0, sum=0;
		
		do {
			
			System.out.println("Please enter a number:");
			num=input.nextInt();
			count++;
			
			if (num>0) {
				countPos++;
				sum+=num;
			}
			
			if (num%2==0 && num!=0) 
				countZogi++;
				
		}while (num!=0);
		
		System.out.println("The amount of inputs: "+count);
		
		System.out.println("The amount of Zogi numbers: "+countZogi);
		
		System.out.println("The avg of Pos numbers: "+(sum/countPos));
	}
}
