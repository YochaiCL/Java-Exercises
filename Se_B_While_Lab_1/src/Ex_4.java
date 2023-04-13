import java.util.Scanner;
public class Ex_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int students, grade, avg, i=1, sum=0;
		
		System.out.println("please enter the number of students");
		students = input.nextInt();
		
		while (i<=students) {//כל עוד i קטן או שווה לכמות הסטודנטים
			System.out.println("please enter grade of student "+i);
			grade = input.nextInt();
			
			while (0 > grade && grade > 100) {//במידה והציון הוא נמוך מ0 וגבוה מ100 אז תיכנס ללולאה
				System.out.println("input error! please try againe");
				System.out.println("please enter grade of student "+i);
				grade = input.nextInt();
			}
			
			sum+=grade;
			
			i++;
				
		}
		
		if (students < 0)
			System.out.println("error! cant divided with 0");
		
		else {
			avg = sum/students;
			System.out.println("the avg is:"+avg);
		}	
	}

}
