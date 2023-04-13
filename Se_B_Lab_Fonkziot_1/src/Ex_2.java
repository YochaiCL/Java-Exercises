
public class Ex_2 {
	
	public static int number (int num) {
		
		int x=0;
		
		if (num<0)
			x=-99;
		
		if (num>0)
			x=100;
		
		if (num==0)
			x=0;
		
		return x;
	}
	
	public static void main(String[] args) {
		
		int x;
		
		x=number(0);
		
		System.out.println(x);
	}
}
