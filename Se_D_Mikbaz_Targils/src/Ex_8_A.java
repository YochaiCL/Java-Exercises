
public class Ex_8_A {
	
	public static int mezamzem (int num) {
		
		int saveFirst=0, saveLast, result;
		
		saveLast=num%10;
		
		while(num>0) {
			saveFirst=num%10;
			num/=10;
		}
		result=(saveFirst*10)+saveLast;
		
		return result;
	}

	public static void main(String[] args) {
		
		System.out.println(mezamzem(123456789));

	}

}
