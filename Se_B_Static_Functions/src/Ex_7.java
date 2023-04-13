
public class Ex_7 {
	
	public static void meshochlal(int num) {
	//void=מדפיס
		int sum=0;
		
		for (int i=1; i<=num/2; i++)
			if(num%i==0)
				sum+=i;
	}
	public static void main(String[] args) {
		
		for (int i=2; i<=100; i++) 
			meshochlal(i);
		
		}
}
