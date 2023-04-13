
public class Rational {

	private int numerator, denom;
	
	public Rational (int x, int y) {//���� x � y
		
		this.numerator=x;//�����
		this.denom=y;//�����
	}
	
	public int getNumerator () {//�� ����� ����
		
		return this.numerator;//������ �� ����� �� ����
	}

	public int getDenom() {//�� ����� ����
		
		return this.denom;//������ �� ����� �� ����
	}
	
	public boolean isEqual(Rational num) {//����� ����� �������� // ����� ���� ���
		
		return this.numerator*num.denom==this.denom*num.numerator;//��� ������� ����� ������ ������
		/*
		 * ������:
		 * this=3/2
		 * num=9/6
		 * ��� �� �����?
		 * 3*6=18
		 * 9*2=18
		 * 18=18 ����� true
		 */
	}
	
	public Rational multply (Rational num) {//���� ���� ���� ����� ���� ����
		//���� ����� pablic Rational �� ���� ���� ���� ���� ���� ������� ��� ���
		//������ ���� �������
		
		int n,d;
		
		n=this.numerator*num.numerator;//���� ���� ����
		
		d=this.denom*num.denom;//���� ���� ����
		
		Rational r=new Rational (n,d);//������� �� ������ ������� ����� �������
		
		return r;
	}
	
	public Rational divided (Rational num) {//������ ����� ��� �������� ��� ���
		//����� ���� ���� �������
		
		if (num.numerator==0)//�� ����� ��� 0 �� �� �� ����� ������� �� �� ���� ���� 0 �� �� ����
			return null;//����� ����� ����
		
		Rational r=new Rational (num.denom,num.numerator);//����� ����� ������� ���� ����� ����� ������ �����
		
		return this.multply(r);//������ �� ����� �������� ����� ����� �� ���� this
	}
	
	public String toString() {
		
		return numerator+"/"+denom;//���� �����
	}
	

	/*
	 * ����� ������ ���� �����
	 * 3/7+2/5
	 * (35/7*3+35/5*2)/35
	 * �� ���� �� ����� 3/7-2/5
	 * (35/7*3-35/5*2)/35
	 */
	
	public Rational addRational(Rational num) {//����� ������� ����� �������  //������ ���� �������
		
	int n,d;
	
	d=this.denom*num.denom;
	
	n=(d/this.denom*this.numerator)+(d/num.numerator);
	
	return new Rational (n,d);
}
	
	public Rational subRational(Rational num) {//����� ������� ����� �������  //������ ���� �������
		
		int n,d;
		
		d=this.denom*num.denom;
		
		n=(d/this.denom*this.numerator)-(d/num.numerator);
		
		return new Rational (n,d);
	}
	
}
