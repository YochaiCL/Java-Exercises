import java.util.Scanner;
public class Ex_4 {
	
	public static boolean checkPass (String str) {
		
		int i=0;
		boolean flag=false;
		
		if (str.length()>=8)
			
			if (str.charAt(i)>=(int)'A' && str.charAt(i)<=(int)'Z') {
				
				i++;
				
				while (i<str.length()&&flag==false) {
					
					if (str.charAt(i)==str.charAt(i-1))
						
						flag=true;
					
					i++;
				}
			}
			else
				flag=true;
		else
			flag=true;
		
		return flag;
	}

	public static void main(String[] args) {
		
		Scanner input=new Scanner (System.in);
		
		String str;
		
		int count=1;
		
		boolean flag=false;
		
		do {
			
			System.out.println("please enter a password:");
			
			str=input.next();
			
			flag=checkPass(str);
			
			if (flag) {
				
				count++;
				
				System.out.println("Error please try again");
				
			}
			
		} while(flag==true);
		
		System.out.println("the number of trys are "+ count);	

	}

}
