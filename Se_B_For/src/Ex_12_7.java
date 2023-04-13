import java.util.Scanner;
public class Ex_12_7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		boolean flag;
		
		for (int i=1; i<=3000; i++) {
			
			flag = true;//אנו קובעים כבר עכשיו שהמספר הוא ראשוני
			
			for (int j=2; j<i; j++) 
								
				if (i%j==0)
					flag=false;
				
			if (flag)
				System.out.println("the number "+i+" is a prime");
			}
	}
}
