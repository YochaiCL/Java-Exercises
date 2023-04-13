import java.util.Scanner;
public class Ex_5_a {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int num,sum=0;
		char ch;
		
		System.out.println("please enter An arithmetic exercise:");
		System.out.println("Note This is a one-digit exercise only");
		
		
		do {
			num = input.nextInt();
			while (num >9 || num <-9) {
				System.out.println("Note This is a one-digit exercise only");
				System.out.println("please enter An arithmetic exercise:");
				num = input.nextInt();
			}
			
			ch=input.next().charAt(0);
			
			if (ch=='+' || ch== '=') {
				sum+=num;
			}
			
			
			else {
				System.out.println("This is a connection exercise please enter sign '+'");
				ch=input.next().charAt(0);
				while ((char)ch!='+') {
					System.out.println("This is a connection exercise please enter sign '+'");
					ch=input.next().charAt(0);
					
				}
				sum+=num;
				}
			}
			
		while (ch!='=');
		
		System.out.println(sum);
	}

}
