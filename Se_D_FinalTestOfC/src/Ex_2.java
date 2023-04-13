
public class Ex_2 {
	
	public static void openSod(int [] arr, String str) {
		
		String res="";
		
		int i, index=0, counter=0;
		
		for (i=0;i<str.length();i++) {
			
			if (counter==arr[index]) {
				
				res+=" ";
				i--;
				index++;
				counter=0;
			}
			else {
				res+=str.charAt(i);
				counter++;
			}
		}
		
		System.out.println(res);
	}

	public static void main(String[] args) {
		int[]arr= {5,5,3};
		openSod(arr, "Happysunnyday");
		
		
		
		
		

	}

}
