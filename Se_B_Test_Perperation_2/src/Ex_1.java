import java.util.Scanner;
public class Ex_1 {
	
	public static int du (int num) {
		
		int hundred, dig, result=0,count=0,n;
			
				dig=num%10;
				
				if(num>1000)
				hundred=num/1000;
								
				else  //(num<1000)
					hundred=num/100;
				
								
				result=hundred*10+dig;
			
			return result;
	}
	
public static int randum () {
		
		int range=10000-(-100)+1;
		
		int number=(int)(Math.random()*range)+100;
		
		return number;
				
	}
	

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int N, num, result, max=0, sum=0;
		
		System.out.println("please enter how much numbers wholde you want to chack");
		N=input.nextInt();
		
		for (int i=1; i<=N; i++) {
			
			num=randum();
			
			result=du(num);
			
			System.out.println("for number "+i+" "+num+" the most & unmost numbers is: "+result);
			
			if (result>max)
				max=result;
			
			sum+=result;
		}
		System.out.println("the max is:"+max);
		System.out.println("the avrage is:"+(double)sum/N);
		
	}

}
