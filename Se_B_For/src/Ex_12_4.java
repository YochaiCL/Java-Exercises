import java.util.Scanner;
public class Ex_12_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int Patients, sum=0, avg, count=0;
					
		for (int hospital=1; hospital<=5; hospital++) {
			
			System.out.println("please enter the number of Patients in hospital "+hospital+" in the last 7 days:");
			
			for (int day=1; day<=7; day++) {
				
				Patients = input.nextInt();
				
				sum+=Patients;
			}
			avg=sum/7;
			System.out.println("the avrage patients in 7 days of hospital "+hospital+" is: "+avg);		
			if(avg<100) {
			count++;
		}
		}
		System.out.println("the number of hospitals that avrage patients is lass than 100 is "+count);
	}
}
