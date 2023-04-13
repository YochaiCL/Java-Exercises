import java.util.Scanner;
public class Ex_3 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner (System.in);
		
		System.out.println("enter how much numbers do you want in the arry:");
		int num=input.nextInt();
		
		int [] arr=new int [num];
		
		for (int j=0;j<arr.length;j++) {
			
			System.out.println("please enter number "+(j+1));
			
			arr[j]=input.nextInt();
		}
		
		if (num%3==0) {
			
			int end=num/3;
			
			int [] check =new int [end];
			
			for (int i=0;i<check.length; i++) {
				
				check[i]=arr[i];
			}
			
			int h=0;
			boolean flag=true;
			
			for (int k=0;k<arr.length && flag;k++) {
				
				if (k%check.length==0) {
				
					h=0;				
				}
				
				if (arr[k]==check[h]) {
					
					h++;
				}
				
				else {
					flag=false;
				}
				
			}
			if (flag)
				System.out.println("this is tringle arry");
			
			else
				System.out.println("this is not tringle arry");
		}
		
		else
			System.out.println("this is not tringle arry");
	}
}
