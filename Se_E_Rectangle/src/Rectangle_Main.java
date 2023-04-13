
public class Rectangle_Main {

	public static void main(String[] args) {

		System.out.println("a1:");
		Rectangle a1 = new Rectangle();
		a1.showShap();

		System.out.println("a2:");
		Rectangle a2 = new Rectangle(3, 3);
		a2.showShap();

		System.out.println("a3:");
		Rectangle a3 = new Rectangle(a2);
		a3.showChar('^');

		System.out.println("a3 after change:");
		a3.setLength(5);
		a3.showChar('3');

		System.out.println("a2 after change:");
		a2.showChar('2');

		System.out.println("The perimeter of a2 is: " + a2.perimeter());
		System.out.println("The area of a2 is: " + a2.area());
	}

}
