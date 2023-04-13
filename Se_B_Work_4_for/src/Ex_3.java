import java.util.Scanner;
public class Ex_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int price, i, sum=0, max=0, imax=0, count100=0,count5060=0;
		double avg;
		
		System.out.println("please enter price of 20 items");
		
			for (i=1; i<=20; i++) {
				
				System.out.println("enter price of item "+i+":");
				price=input.nextInt();
				
				sum+=price;
				
				if (price>max) {
					max=price;
					imax=i;
				}
				
				if (price>100)
					count100++;
				
				if (price>=50 && price<=60)
					count5060++;		
			}	
		System.out.println("the sum of all 20 items is: "+sum);
		System.out.println("the avrage is: "+(avg=sum/20));
		System.out.println("the max price is: "+max+" in item "+imax);
		System.out.println("the quantity of items whose price is large than 100 is: "+count100);
		System.out.println("the quantity of items whose price between 50 to 60 is: "+count5060);
		}
}
