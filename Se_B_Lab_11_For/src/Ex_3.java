import java.util.Scanner;
public class Ex_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int count=0, max=0, lastNumber=-2, smallCount=0;
		
		System.out.println("please writh seriea positiv numbers: ");
		
		for (int i=input.nextInt(); i!=-2 ;) {
			
				count=1;
				lastNumber=i;
			
			for (i=input.nextInt(); i!=-2; i=input.nextInt()) {
				
				if (i==lastNumber) 
					count++;
						
				else {
					System.out.println("the max seriea of number:"+lastNumber+" is:"+count);
					smallCount++;
					count=1;
					lastNumber=i;
				}
					
				if (count>max)
				max=count;}
		}
		
		System.out.println("the number of identical numbers are:"+max);
		System.out.println("the number of small series is:"+smallCount);
		
	}

}
