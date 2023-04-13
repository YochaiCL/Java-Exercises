import java.util.Scanner;
public class Ex_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		input.useDelimiter("");
		
		char ch;
		int i=1, count=0, icount=0;
		
		System.out.println("please write 25 characters");
		
		do {
			ch = input.next().charAt(0);
			
			if(ch=='W' || ch == 'w') {
				count++;
				icount=i;
				
				System.out.println("there is character w in location "+icount);
			}
			i++;
			}
		
		while(i<=25);
		
		if (count==0)
			System.out.println("there is no w characters");
	}
}
