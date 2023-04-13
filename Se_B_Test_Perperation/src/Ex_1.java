import java.util.Scanner;
public class Ex_1 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		
		int result, sum, max=0, icontestant=0,count=0, lass8=0;
		double sumAvg=0;
		
		for (int contestant=1; contestant<=100; contestant++) {
			
			sum=0;
			
			for (int judge=1; judge<=5; judge++) {
				
				System.out.println("enter the result of judge "+judge+" for contestant:"+contestant);
				result=input.nextInt();
				
				while (result <1 || result>5) {
					System.out.println("Eroor!! result need to be between 1 to 5");
					System.out.println("enter the result of judge "+judge+" for contestant:"+contestant);
					result=input.nextInt();
				}
				sum+=result;
			}
			System.out.println("Total points the song "+contestant+" received is:"+sum+"\n" );
			
			if (sum>max) {
					max=sum;
					icontestant=contestant;		
			}
			
			if (sum>=10 && sum<=15) {
				sumAvg+=sum;
				count++;}
			
			if (sum<8)
				lass8++;
		}
		System.out.println("the number of contestants that get lass than 8 points are:"+lass8);
		System.out.println("the winning song is "+icontestant+" with "+max+" points");
		if (count!=0)
		System.out.println("the avrage points for songs that get between 10-15 points is:"+(sumAvg/count ));
		
	}

}
