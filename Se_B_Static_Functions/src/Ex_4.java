
public class Ex_4 {
	public static int sum(int num) {
		
		int result=0;
		
		while (num !=0) {
			
			result+=num%10;
			num/=10;
		}
		return result;
		
	}

	public static void main(String[] args) {
		

	}

}
