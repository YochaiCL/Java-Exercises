import java.util.Scanner;
public class TestRational {
	
	public static Rational kelet() {//������� ������� ���� ������� ������ ���� ������� �������
		
		Scanner input = new Scanner (System.in);//Scanner
		
		System.out.println("entyer a numoretor:");//���� �� �����
		int num=input.nextInt();
		
		System.out.println("enter denom:");//���� �� �����
		int denom=input.nextInt();
		
		while (denom==0) {//���� ������ ���� 0
			
			System.out.println("error denom can not be zero, try agian:");
			denom=input.nextInt();
		}
		
		return new Rational (num,denom);//���� ���� �������
		
	}

	public static void main(String[] args) {
		
		Rational r1,r2;
		
		r1=kelet();//������ ���� r1 �� ���� ������� �������� kelet
		r2=kelet();//������ ���� r2 �� ���� ������� �������� kelet
		
		/*
		 * �� ���� ��� ������ ����� ����� ���� 2 ������� ���
		 * ����� ���� 2 ������ ��������
		 */
		
		System.out.println(r1);//����� �� r1 � r2
		System.out.println(r2);
		
		if (r1.isEqual(r2))//���� �� ��� ������� ��������� �����
			System.out.println("the numbers are equal");//�� ������ ��� true  �� ������ �� ����� ������
		
		System.out.println(r1+"/"+r2+"="+r1.divided(r2));//������ �� ����� ������
		
		System.out.println(r1+"*"+r2+"="+r1.multply(r2));//������ �� ����� ����
		
		System.out.println(r1+"+"+r2+"="+r1.addRational(r2));//������ �� ����� ������
		
		System.out.println(r1+"-"+r2+"="+r1.subRational(r2));//������ �� ����� ������
	}
	
}
