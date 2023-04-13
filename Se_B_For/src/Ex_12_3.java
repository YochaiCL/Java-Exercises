import java.util.Scanner;
public class Ex_12_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		float grade; // הקמת משתנה ציונים
		float sum=0;//הקמת משתנה לטובת סכום כל הציונים
		float avg;//הקמת משתנה לחישוב ממוצע
		float min=100;//הקמת ממוצע מינמאלי ששווה ל100 כי לא יכול להיות ממוצע גבוה יותר ממאה בציונים
		float imin=0;//הקמת משתנה לרישום מיקום הממוצע הנמוך ביותר בין הסטודנטים
		
		for (int student =1; student<=40; student++) {//סופרים את כל ה 40 סטודנטים
			System.out.println("enter 6 grades from student "+ student+ ":");//פעולת הדפסה בו נדרש לקלוט 6 ציונים של הסטודנטים
			
			for (int i=1; i<=6;i++) {//קליטת 6 ציונים של כל סטודנט בנפרד
				
				grade = input.nextInt();
				
				sum+=grade;//סוכמים את כל הציונים כל מנת לעשות ממוצע לכל סטודנט בנפרד
				}
			
			avg = sum/6;
			System.out.println("the avrage of student "+student+" is: "+avg);//הדפסת ממוצע ציונים לכל סטודנט בנפרד
			
			if (avg<min) {//אם הממוצע של אחד מהסטודנטים נמוך מהממוצע המנימאלי ביותר אז הוא יכנס לתוך הפונקציה
				min = avg;//המומצע המנימאלי החדש נשמר בתוך 	min
				imin = student;//הסטודנט עם הממוצע הנמוך ביותר נשמר בתוך imin
				}}
			System.out.println("the min avg is "+min+"of student "+imin);//הדפסת הממוצע הנמוך של סטודנט ושל איזה סטודנט
	}
}
