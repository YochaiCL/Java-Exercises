import java.util.Scanner;
public class Ex_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int serie=0, max=0,count=0;
		
		System.out.println("please writh series numbers");
		
		for (int i=input.nextInt(); i!=0 ;) {
			count++;
			
			for (i=input.nextInt(); i!=0; i=input.nextInt()) 
				count++;
			
			if (i==0) 
					serie++;
						
			if (count>max)
				max=count;
			
			count=0;
			
			i=input.nextInt();
		}
		System.out.println("the number of series is:"+serie);
		System.out.println("the max numbers in a serie is:"+max);

	}

}
