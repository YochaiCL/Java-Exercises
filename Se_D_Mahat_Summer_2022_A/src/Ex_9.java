
public class Ex_9 {
	
	public static boolean special (String str) {
		
		int countBigL=0;
		int countSmallL=0;
		
		for (int i=0;i<str.length();i++) {
			
			if (str.charAt(i)>='A' && str.charAt(i)<='Z')
				countBigL++;
			
			if (str.charAt(i)>='a' && str.charAt(i)<='z')
				countSmallL++;
		}
		
		if (countBigL==str.length() || countSmallL==str.length())
			return true;
		
		return false;
	}

	public static void main(String[] args) {
		
		String str="gfks";
		
		System.out.println(special(str));
		

	}

}
