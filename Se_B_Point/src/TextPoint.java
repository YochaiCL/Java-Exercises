
public class TextPoint {

	public static void main(String[] args) {
		
		Point p1=new Point (43,7);
		
		Point p2=new Point (5,5);
		
		System.out.println(p1.toString());
		System.out.println(p2);
		
		double tmp=p1.getx();
		
		p1.setx(p2.getx());
		
		p2.setx(tmp);
		
		System.out.println(p1);
		System.out.println(p2);
		
		
		//*****************************************//
		
		double x=p1.distance(p2);
		System.out.println("the distance="+x);
		
		Point pmiddle=p1.middle(p2);
		System.out.println("pmiddle="+pmiddle);
	}
}
