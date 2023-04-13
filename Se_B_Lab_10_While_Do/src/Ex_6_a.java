import java.util.Scanner;
public class Ex_6_a{

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int num, sum=0, i=1 ,sub=0, plus=0, minus=0;
		char ch;
		
		System.out.println("please enter An arithmetic exercise:");
		
		do {
			num = input.nextInt();

			ch=input.next().charAt(0);
			
			if (ch=='+') {
				sum+=num;
				++plus;}
			
			if (ch=='-') { 
				sum = num-sum;
				++minus;}
			
			if (ch=='=')
				if(plus>=1)
					sum+=num;
				else if (minus>=1)
					sum = sum-num;
			
			i++;
				
			}
		
		while (i<=2);
		
		System.out.println(sum);
	}

}
