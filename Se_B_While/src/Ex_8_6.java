import java.util.Scanner;
public class Ex_8_6 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int boys, girls, count=0;
		
		System.out.println("enter the number of boys and girls:");
		boys = input.nextInt();
		girls = input.nextInt();
		
		while (boys !=-1 || girls !=-1) {
			/* ������ ������� �� ����� -1 ��� ����� �� -1
			   ��� ������ �� ���� ����
			   �� ��� ���� �� ���� �� �� -1
			 */
			System.out.println("the sun is: "+boys+girls);
			
			if (boys == girls)
				count++;
			
			System.out.println("enter the number of boys and girls:");
			boys = input.nextInt();
			girls = input.nextInt();
		}
		System.out.println("the amount is: "+count);
	}
}
