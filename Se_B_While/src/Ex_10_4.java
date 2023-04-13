import java.util.Scanner;
public class Ex_10_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int num;
		boolean flag=true;
		
		System.out.println("please enter a number:");
		num = input.nextInt();
		
		while (num<=0) {//בדיקת קלט למספר חיובי
			System.out.println("input error, enter a positive number");
			num = input.nextInt();
		}
		
		while (num!=0 && flag) { //ברגע שאנו רושמים גם את הדגל בסוגריים אז ברגע שיהיה פיצוץ הוא עוצר את הנוסחא
					
			if (num%2==1)
				flag = false;
			num/=10;
		}
		
		System.out.println((flag)?"yes":"no");

	}

}
