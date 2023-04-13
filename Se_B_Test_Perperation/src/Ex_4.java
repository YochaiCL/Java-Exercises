import java.util.Scanner;
public class Ex_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int m, n1, n2;
		boolean f=false;
		
		System.out.println ("enter two numbers");
		int num1= input.nextInt() ;
		int num2= input.nextInt() ;
		
		m=num1+num2;
		
		n1=num1;
		
		n2=num2;
		
		while (num1*num2!=0)
		{
		f=true;
		
		if (num1+num2< m)
		{
		m=num1+num2;
		n1=num1;
		n2=num2;
		}
		
		System.out.println ("enter two numbers");
		num1= input.nextInt() ;
		num2= input.nextInt() ;
		}
		
		if( f)
		System.out.println ( "n1 ="+n1+" n2="+ n2+" m= "+m);
		else
		System.out.println (" no numbers");
	}
}
