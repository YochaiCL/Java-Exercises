import java.util.Scanner;
public class Ex_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int i=1, num=1;
		
		do {
			if (num%2==0 || num%3==0) {//�� ����� ����� � 2 �� � 3
				System.out.println(num);//�� �� ���� �� �����
				i++;//�� �� ����� �� ����� ���� ������
			}
			num++;//��� �� ����� ����� ��� ����	
		}
		while(i<=20);
	}
}
