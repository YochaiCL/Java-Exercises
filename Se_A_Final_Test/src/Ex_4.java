import java.util.Scanner;
public class Ex_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int i=1, team1, team2, sumTotal=0, minGame=0, sumGame=0, team=0,min, imin=0, iteam;
		
		System.out.println("please enter result of team 1 of game "+i);
		team1=input.nextInt();
		System.out.println("please enter result of team 2 of game "+i);
		team2=input.nextInt();
		
		min = minGame = Math.min(team1, team2); //������ ��� �����
		iteam=min;
		
		if (team1 > team2) {//�� ����� 2 ���� ����
			team = 2;//�� ����� 2 ��� �� ����� ������� �����
			imin=i;}//������ ��� ������ ��� ������ �������
		
		if (team2 > team1) {//�� ����� 1 ���� ����
			team = 1;//�� ����� 1 ��� �� ����� ������� �����
			imin=i;}//������ ��� ������ ��� ������ 
		
		sumGame = team1+team2;// ���� �� �� ������� �����
		sumTotal+=sumGame;//���� �� �� ����� ��� ������� ����� �����
		
		System.out.println("the sum in game "+i+" is="+sumGame);
		
		i++;
		
		while (i<=4) {
			System.out.println("");
			System.out.println("please enter result of team 1 of game "+i);
			team1=input.nextInt();
			System.out.println("please enter result of team 2 of game "+i);
			team2=input.nextInt();
			
			min = Math.min(team1, team2);//������ ��� �����
			
			if(min<minGame)//���� ���� ��� ������ ��� ����� ��� �������
				minGame=min;//���� �� ������ ��� ����� ������
			
			sumGame = team1+team2;// ���� �� �� ������� �����
			
			if (team1 > team2)//�� ����� 2 ���� ����
				team = 2;//�� ����� 2 ��� �� ����� ������� �����
			
			if (team2 > team1)//�� ����� 1 ���� ����
				team = 1;//�� ����� 1 ��� �� ����� ������� �����
			
			if (team2<=minGame){//��� ���� ����� ����� ��� ���� ���� ������ ����� ���������� ���� �������
				imin=i;//�� ���� ����� ����
				iteam=2;//���� ������ �����
			}
			
			if (team1<=minGame){//��� ���� ����� ����� ��� ���� ���� ������ ����� ���������� ���� �������
				imin=i;//�� ���� ����� ����
				iteam=1;//���� ������ �����
			}
			
			sumTotal+=sumGame;//���� �� �� ����� ��� ������� ����� �����
			
			System.out.println("the sum in game "+i+" is="+sumGame);
						
			i++;
		}
		
		System.out.println("");
		System.out.println("the total of team1 and team2 is: "+sumTotal);
		System.out.println("the min is "+minGame+" of team "+iteam+" in game "+imin);
	}

}
