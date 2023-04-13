import java.util.Scanner;
public class Ex_5 {

	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
		char x='-', y='|', z='*', w=' ';
		System.out.println("enter a num");
		int n= input.nextInt();
		for(int i=0;i<n;i++)
		{ int j=0;
		while(j<n)
		{
		if(i==0|| i==n-1)
		System.out.print(x);
		else
		if(j==0|| j==n-1)
		System.out.print(y);
		else
		if(i==j || i+j == n-1)
		System.out.print(z);
		else
		System.out.print(w);
		++j;
		}//while
		System.out.println();
		}//for
		}//main
		}