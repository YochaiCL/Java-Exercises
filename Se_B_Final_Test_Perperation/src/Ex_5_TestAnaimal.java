
public class Ex_5_TestAnaimal {

	public static void main(String[] args) {
		
		Ex_5_Animal beast1=new Ex_5_Animal("Girafa", 13,356.7);
		
		Ex_5_Animal beast2=new Ex_5_Animal("camel", 10,123.7);
		
		System.out.println(beast1);
		System.out.println(beast2);
		System.out.println(beast1.big_wieght(beast2));
	}
}
