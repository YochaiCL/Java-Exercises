
public class TestDate {

	public static void main(String[] args) {//צריך מחלקה ראשית
		
		Date d1=new Date (1,2,2020);
		Date d2=new Date (3,4,2020);
		
		System.out.println(d1+"  "+d2);
		
		d1.setMonth(d2.getMonth());
		
		System.out.println(d1+"  "+d2);
		
		if (d1.compareTo(d2)>0)
			System.out.println(d1+" after "+d2);
		
		else if (d1.compareTo(d2)<0)
			System.out.println(d1+" befor "+d2);
		
		else
			System.out.println(d1+" equal "+d2);
	}

}
