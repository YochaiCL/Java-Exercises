import java.util.Scanner;
public class Ex_5_techer {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		input.useDelimiter("");//����� �� �� ������ ����� ���
		
		char ch;
		int num=0,sum=0;
		
		System.out.println("please enter An arithmetic exercise:");
		
		do {
			ch = input.next().charAt(0); //digit or + or =
			
			if (ch>='0' && ch<='9')//�� �� ������ ��� ����
				num = num*10+ch-'0';//���� �� ������ ��� ���� ����
			//�� ����� 123 �� ��� ���� 1 ��� 2 ��� 3
			
			else if (ch=='+' || ch=='=')
			{
				sum+=num;//���� ���� sum �� ������ ��������
				num=0;//���� �� num ��� ���� ��� ����� �����
			}
		}
		while (ch!='=');//�� ��� �� �� = �� ��� ����� ���� �����
		
		System.out.println(sum);
	}

}
