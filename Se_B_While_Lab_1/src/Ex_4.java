import java.util.Scanner;
public class Ex_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int students, grade, avg, i=1, sum=0;
		
		System.out.println("please enter the number of students");
		students = input.nextInt();
		
		while (i<=students) {//�� ��� i ��� �� ���� ����� ���������
			System.out.println("please enter grade of student "+i);
			grade = input.nextInt();
			
			while (0 > grade && grade > 100) {//����� ������ ��� ���� �0 ����� �100 �� ����� ������
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
