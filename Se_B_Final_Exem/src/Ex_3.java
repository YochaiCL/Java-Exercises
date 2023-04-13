
public class Ex_3 {

	public static void main(String[] args) {
		
		int num1=212, num2=112;
		
		boolean flag;
		
		while (num2!=0) {
			
			if(num1%10==num2%10)
				flag= true;
			
			else flag= false;
			
			num2/=10;
			
			
			System.out.print("*");
			System.out.println("\\");
		}
	}

}
