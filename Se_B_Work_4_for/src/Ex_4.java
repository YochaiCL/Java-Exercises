import java.util.Scanner;
public class Ex_4 {

	public static void main(String[] args) {
		Scanner input =new Scanner (System.in);
		
		int num1,num2, equalNumber=0,maxDifference=0, i=1, imaxdiff=0;
		
		System.out.println("please writh 20 pair of numbers");
		
		num1=input.nextInt();
		num2=input.nextInt();
		
		{if (num1>num2) {
			System.out.println("\nthe biggest number is: "+num1);
			System.out.println("the difference between the two numbers is: "+num1+"-"+num2+"= "+(num1-num2));
			
			if ((num1-num2)>maxDifference) {
				maxDifference=(num1-num2);
				imaxdiff=i;	}
			}
		
			else if (num2>num1) {
				System.out.println("\nthe biggest number is: "+num2);
				System.out.println("the difference between the two numbers is: "+num2+"-"+num1+"= "+(num2-num1));
				if ((num2-num1)>maxDifference) {
					maxDifference=(num1-num2);
					imaxdiff=i;	}	}}
				
		if (num1==num2)
			equalNumber++;
		
		i++;
		
		
		for (; i<=4; i++) {
			
			num1=input.nextInt();
			num2=input.nextInt();
					 
			if (num1==num2)
				equalNumber++;
			
			{if (num1>num2) {
				System.out.println("\nthe biggest number is: "+num1);
				System.out.println("the difference between the two numbers is: "+num1+"-"+num2+"= "+(num1-num2));
				
				if ((num1-num2)>maxDifference) {
					maxDifference=(num1-num2);
					imaxdiff=i;	}
				}
				
			
				else if (num2>num1) {
					System.out.println("\nthe biggest number is: "+num2);
					System.out.println("the difference between the two numbers is: "+num2+"-"+num1+"= "+(num2-num1));
					
					if ((num2-num1)>maxDifference) {
						maxDifference=(num1-num2);
						imaxdiff=i;	}}
					
		}}
		System.out.println("\nthe amount of equal numbers is: "+equalNumber);
		System.out.println("the max difference in all numbers are: "+maxDifference+" in place: "+imaxdiff);
	}

}
