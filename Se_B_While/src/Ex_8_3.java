import java.util.Scanner;
public class Ex_8_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int age, max, min, sum=0, count=0;
		
		System.out.println("enter your age:");
		age = input.nextInt();
		
		max=age;
		min=age;
		
		while (age>0) {
			if(age>max)
				max=age;
			if (age<min)
				min=age;
			
			sum+=age;
			count++;
			
			System.out.println("enter your age:");
			age = input.nextInt();
		}
		
		if (count!=0) {
			System.out.println("the max is: "+max);
			System.out.println("the min is: "+min);
			System.out.println("the avg is: "+sum/count);
		}

	}

}
