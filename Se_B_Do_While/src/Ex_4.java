import java.util.Scanner;
public class Ex_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		input.useDelimiter("");//����� �� ������� ����� ���
		
		char ch;
		int count=0;
		boolean flag = false;
		
		System.out.println("please enter a Sentence:");
		
		do {
			ch =input.next().charAt(0);
			
			if(ch=='a' || ch=='A') { 
				flag = true;//����� ��� a
				
				if (flag)//�� �� ���� ��� ���� �� ��� ���� �����
					count++;//���� ��� ����� ������ �� a
					flag =false;//������� �� ���� ��� ���� �� ����� ����� ����� �� ����� ����
			}
			
			else if (ch== ' ' || ch=='.') //������ ���� ������� ����� �� ����
				flag =false;
					
		}
		//� do ���� �� ������� �� ����� �� ����� �� ������ ��� �� ����
		
		while (ch!='.');//���� ���� ��� �����
		System.out.println("the amount of a is:"+count);
	}

}
