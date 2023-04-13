import java.util.Scanner;
public class Ex_12_6_a {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int n;
		
		System.out.println("Please write down how many stars the sides of the triangle will have:");
		n = input.nextInt();//משתנה n אשר קולט את מספר הכוכביות בכל צלע
		
		for (int i=1; i<=n; i++) {//מתחיל עם השורה הראשונה
			
			for (int j=1; j<=i; j++)//כל עוד j קטן או שווה ל i אז הוא ירשום כוכבית
				System.out.print("*");//רושם כוכבית ללא ירידת שורה
			
			System.out.println();//יורד שורה
		}
	}
}
