
public class DiceGame {

	public static void main(String[] args) {
		
		int count=0;
		
		Se_B_Die d1=new Se_B_Die ();//�� ����� ��� ����� ���
		
		Se_B_Die d2=new Se_B_Die ();
		
		while (d1.getNum()!=6 || d2.getNum()!=6) {//������ ���� ��� �� ����� ���� ��� ����� �����
			
			System.out.println("d1="+d1.getNum()+" d2="+d2.getNum());
			
			d1.roll();
			d2.roll();
			
			count++;

		}
			System.out.println("count="+count);	
			
		}
	
}
