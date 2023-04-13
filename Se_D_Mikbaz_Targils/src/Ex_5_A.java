import java.util.Scanner;
public class Ex_5_A {
	
	public static Scanner input=new Scanner(System.in);

	public static void main(String[] args) {
		
		int num;
		
		for(int k=1; k<=4;k++) {
			num=input.nextInt();
			System.out.println(num/10 + num%10);
		}
	}
}
