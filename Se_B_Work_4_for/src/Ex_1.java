import java.util.Scanner;
public class Ex_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int i=1,numLast, num, sum;
		
		System.out.println("enter 10 numbers:");
		
		for (; i<=10;) {
						
			System.out.println("enter number: "+i);
			num=input.nextInt();
			
			numLast=num;
			
			i++;
			
			System.out.println("enter number: "+i);
			num=input.nextInt();
			
			sum = numLast-num;
			
			System.out.println("\n"+numLast+"-"+num+"="+sum+"\n");
			
			for (i++ ;i<=10; i++) {
				
				numLast=num;
				
				System.out.println("enter number: "+i);
				num=input.nextInt();
				
				sum = numLast-num;
				
				System.out.println("\n"+numLast+"-"+num+"="+sum+"\n");	
			}	
			}
	}
}
