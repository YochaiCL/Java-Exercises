import java.util.Scanner;
public class Ex_12_6_a {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int n;
		
		System.out.println("Please write down how many stars the sides of the triangle will have:");
		n = input.nextInt();//����� n ��� ���� �� ���� �������� ��� ���
		
		for (int i=1; i<=n; i++) {//����� �� ����� �������
			
			for (int j=1; j<=i; j++)//�� ��� j ��� �� ���� � i �� ��� ����� ������
				System.out.print("*");//���� ������ ��� ����� ����
			
			System.out.println();//���� ����
		}
	}
}
