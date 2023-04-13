import java.util.Scanner;

public class Ex_3 {
	
	public static int atzeret (int n) {
		int mult =1;
		while (n!=0) {
			mult*=n;
			n--;
		}
		return mult;
	}
	
	public static int kelet() {
		Scanner input = new Scanner (System.in);
		System.out.println("enter a number");
		int num=input.nextInt();
		
		while (num<0) {
			System.out.println("Eroor, enter positiv number:");
			num=input.nextInt();
		}
		return num;
	}

	public static void main(String[] args) {
		
		int n=kelet();//שומר את המספר בתוך n
		//ברגע שהוא יוצא מפה ל kelet אז הוא אחרי הפונקציה יחזור לפה
		
		for (int i=1; i<=n; i++)
			System.out.println(i+"!="+atzeret(i));
	}
}
