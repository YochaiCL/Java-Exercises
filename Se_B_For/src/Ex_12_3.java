import java.util.Scanner;
public class Ex_12_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		float grade; // ���� ����� ������
		float sum=0;//���� ����� ����� ���� �� �������
		float avg;//���� ����� ������ �����
		float min=100;//���� ����� ������� ����� �100 �� �� ���� ����� ����� ���� ���� ���� �������
		float imin=0;//���� ����� ������ ����� ������ ����� ����� ��� ���������
		
		for (int student =1; student<=40; student++) {//������ �� �� � 40 ��������
			System.out.println("enter 6 grades from student "+ student+ ":");//����� ����� �� ���� ����� 6 ������ �� ���������
			
			for (int i=1; i<=6;i++) {//����� 6 ������ �� �� ������ �����
				
				grade = input.nextInt();
				
				sum+=grade;//������ �� �� ������� �� ��� ����� ����� ��� ������ �����
				}
			
			avg = sum/6;
			System.out.println("the avrage of student "+student+" is: "+avg);//����� ����� ������ ��� ������ �����
			
			if (avg<min) {//�� ������ �� ��� ���������� ���� ������� �������� ����� �� ��� ���� ���� ��������
				min = avg;//������ �������� ���� ���� ���� 	min
				imin = student;//������� �� ������ ����� ����� ���� ���� imin
				}}
			System.out.println("the min avg is "+min+"of student "+imin);//����� ������ ����� �� ������ ��� ���� ������
	}
}
