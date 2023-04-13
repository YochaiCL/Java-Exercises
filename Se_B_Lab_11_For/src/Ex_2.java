import java.util.Scanner;
public class Ex_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int count=0, max=0, lastNumber=-1;
		
		System.out.println("please writh seriea positiv numbers: ");
		
		for (int i=input.nextInt(); i!=-1 ;) {
			
				count=1;
				lastNumber=i;
			
			for (i=input.nextInt(); i!=-1; i=input.nextInt()) {
				
				if (i==lastNumber)
					count++;
				
				else {
					count=1;
					lastNumber=i;
				}
					
				if (count>max)
				max=count;}
		}
		System.out.println("The number of identical numbers are:"+max);
	}

}
