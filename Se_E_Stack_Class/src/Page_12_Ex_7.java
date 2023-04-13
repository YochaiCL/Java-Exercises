import unit4.collectionsLib.Stack;

public class Page_12_Ex_7 {
	
	public static void printStrRevers (String str) {
		
		Stack <Character> s= new Stack <Character>();
		
		int i=0;
		
		while (i<str.length()) {
			s.push(str.charAt(i));
			i++;
		}
		
		String result="";
		while(i>0) {
			result+=s.pop();
			i--;
		}
		
		System.out.println(result);
	}

	public static void main(String[] args) {

		String str="Hello new student!";
		
		printStrRevers(str);
		

	}

}
