
public class Ex_6 {

	public static boolean why(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) < 'A' || str.charAt(i) > 'Z') {
				return false;
			}
		}
		return true;
	}

	public static boolean mystery(String[] arr) {
		for (int i = 0; i < arr.length / 2; i++) {
			if (why(arr[i]) == why(arr[arr.length - 1 - i]))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		
		
		String [] arr= {"FGR","GHF","GFD","FD3D"};
		
		mystery(arr);

	}

}
