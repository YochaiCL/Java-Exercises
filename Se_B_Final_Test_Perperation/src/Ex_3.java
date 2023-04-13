import java.util.Scanner;
public class Ex_3 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		
		boolean ok=false;
		
		System.out.println("enter num");
		
		int num=input.nextInt();
		
		while (num!=-1 && ok!=false) {
			
			if(num%2==0 && num>0)
				ok=true;
			else
				ok=false;
			System.out.println("enter num");
			num=input.nextInt();
		}
		
		if(ok)
			System.out.println("A series of even numbers");
		
		else
			System.out.println("An integer series ");
	}

}
