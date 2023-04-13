import java.util.Scanner;
public class Ex_1 {
	
	public static int perimeter (int a, int b, int c) {
		
		int x;
		
		x=a+b+c;
		
		return x;
	}
	
	public static int area (int a, int b) {
		
		int y;
		
		y=a*b/2;
		
		return y;
	}
	
	public static boolean check_input (int a, int b, int c) {
		
		boolean flag=false;
		
		if (a+b>c && a+c>b && b+c>a)
			flag=true;
		
		return flag;
	}

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		
		int num1, num2, num3;
		
		System.out.println("Please insert the sides of the triangle:");
		num1=input.nextInt();
		num2=input.nextInt();
		num3=input.nextInt();
		
		while (num1!=0 && num2!=0 && num3!=0) {
		
		boolean check;
		
		check=check_input(num1, num2, num3);
		
		int area,perimeter;
		
		if (check==true) {
			
		area= area(num1, num2);
		
		perimeter=perimeter(num1, num2, num3);
		
		System.out.println("the area is:"+area);
		System.out.println("the perimeter is:"+perimeter);
				
		}
		else
			System.out.println("this is not triangle");
		
		System.out.println("Please insert the sides of the triangle:");
		num1=input.nextInt();
		num2=input.nextInt();
		num3=input.nextInt();
	}
		if (num1==0 && num2==0 && num3==0)
			System.out.println("thare is no triangle with 3 ziro sides");
}

}
