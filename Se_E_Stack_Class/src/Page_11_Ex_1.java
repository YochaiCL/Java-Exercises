import unit4.collectionsLib.Stack;
import java.util.Scanner;
public class Page_11_Ex_1 {
	
	public static void sod (Stack <Integer> s1) {
		
		Stack<Integer> s2=new Stack<Integer>();
		
		while (!s1.isEmpty()) {
			int x=s1.pop();
			if (!s1.isEmpty()) {
				int y=s1.pop();
				s2.push(y);
			}
			else
				s2.push(x);
			s2.push(x);
			
			while(!s2.isEmpty())
				System.out.print(s2.pop()+" ");
		}
	}

	public static void main(String[] args) {
		
		Scanner input=new Scanner (System.in);
		
		Stack<Integer> s= new Stack <Integer>();
		
		int i=0;
		
		while (i<5) {
			
			System.out.println("Enter " +i);
			
			s.push(input.nextInt());
			
			i++;
			
		}
		
		sod (s);
		

	}

}
