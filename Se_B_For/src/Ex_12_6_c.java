import java.util.Scanner;
public class Ex_12_6_c {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int n;
		
		System.out.println("Please write down how many stars the sides of the triangle will have:");
		n = input.nextInt();//����� n ��� ���� �� ���� �������� ��� ���
		
		for (int i=1; i<=n; i++) {
			
			for (int j=1; j<=n-i; j++)
				System.out.print(" ");//������
			/* n=5
			 * i=1
			 * j=1
			 * 
			 * 1<=5-1 => 1<=4 //���� ������ �� ����� � 4<=4 // ���� 4 ������
			 * 1<=5-2 => 1<=3 //���� ������ �� ����� � 3<=3 // ���� 3 ������
		     * 1<=5-3 => 1<=2 //���� ������ �� ����� � 2<=2 // ���� 2 ������
		     * 1<=5-4 => 1<=1 //���� ������ �� ����� � 1<=1 // ���� 1 ����
			 * 1<=5-5 => 1<=0 //�� ���� ����	
			 */
			
			for(int k=1; k<=i; k++)
				System.out.print("*");
			
			System.out.println();		
		}
	}
}
