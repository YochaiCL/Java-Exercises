import java.awt.Point;
public class Ex_2 {

	public static void main(String[] args) {
		
		Point p1 = new Point (4,8);
		Point p2 = new Point (1,5);//1 5
		
		System.out.println(p1);
		System.out.println(p2);
		
		p1.move(6, 15);
		System.out.println(p1);
		p2.translate(7, 20);//7+1  20+5
		System.out.println(p2);
		
		
		Point p = new Point();//היה חסר new
		p.move(3, 4);
		System.out.println(p);
	}
}
