import java.util.Scanner;
public class Ex_5_b {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int num,sum=0;
		char ch;
		
		System.out.println("please enter An arithmetic exercise:");
		
		do {
			num = input.nextInt();
			
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
