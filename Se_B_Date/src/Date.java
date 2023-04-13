
public class Date {
	
	private int day, month, year;
	
	public Date (int day, int month, int year){
		
		this.day=day;
		this.month=month;
		this.year=year;
	}
	
	//copy constractor
	public Date (Date other) {//����� �� ������� ������ �����
		
		this.day=other.day;
		this.month=other.month;
		this.year=other.year;
	}
	
	public int getYear() {
		
		return this.year;
	}
	
	public int getMonth() {
		
		return this.month;
	}
	
	public int getDay() {
		
		return this.day;
	}
	
	public void setYear (int yearToSet) {//void = �� �����
		
		this.year=yearToSet;
	}
	
	public void setMonth (int monthToSet) {
		
		this.month=monthToSet;
	}
	
	public void setDay (int DayToSet) {//x
		
		this.day=DayToSet;//���� �� � this ���� ��� �� x ��� �� ������ ���� ��
	}
	
	public int compareTo (Date other) {
		
		int y,m,d;
		
		y=this.year-other.year;
		m=this.month-other.month;
		d=this.day-other.day;
		
		if(y!=0)//������� �� ���� ���� ���� ���� � 0
			return y;
		
		if (m!=0)//������� �� ������ ���� ���� ��� 0
			return m;
		
		else
			return d;	
	}
	
	public String toString(){//�� ����� ����
		
		return this.day+"."+this.month+"."+this.year;
	}
	
}
