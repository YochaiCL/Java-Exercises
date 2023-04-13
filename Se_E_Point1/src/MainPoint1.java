
public class MainPoint1 {

	public static void main(String[] args) {

		Point1 p1 = new Point1(3, 5);

		Point1 p2 = new Point1(p1);

		System.out.println("p1:" + p1);
		System.out.println("p2:" + p1);

		System.out.println("p1==p2?" + p1.equals(p2));

		System.out.println("distance:" + p1.distance(p2));

		p1.move(-5, -3);

		System.out.println("p1:" + p1);

		p1.move(3, 5);

		System.out.println("p1:" + p1);

		p1.move(-5, 3);

		System.out.println("p1:" + p1);

		System.out.println("p1 under p2? " + p1.isUnder(p2));

		System.out.println("p1 above p2? " + p1.isAbove(p2));

		System.out.println("p1 left to p2? " + p1.isLeft(p2));

		System.out.println("p1 right p2? " + p1.isRight(p2));

	}

}
