package Point1;

//מגישים:
//יוחאי חן לוי ודוד ידוובסקי

public class MainPoint1 {

	public static void main(String[] args) {

		// Constractors
		Point1 p1 = new Point1(3, 7);

		Point1 p2 = new Point1(p1);

		// toString
		System.out.println("p1:" + p1);
		System.out.println("p2:" + p1);

		// Equals
		System.out.println("p1==p2?" + p1.equals(p2));

		// Distance
		System.out.println("distance p1 to p2:" + p1.distance(p2));
		
		// Move
		System.out.println("move by -5, -3");

		p1.move(-5, -3);

		System.out.println("p1:" + p1);
		
		System.out.println("move by 3, 5");

		p1.move(3, 5);

		System.out.println("p1:" + p1);
		
		System.out.println("move by -5, 3");

		p1.move(-5, 3);

		System.out.println("p1:" + p1);

		// Is Under
		System.out.println("p1 under p2? " + p1.isUnder(p2));

		// Is Above
		System.out.println("p1 above p2? " + p1.isAbove(p2));

		// is Left
		System.out.println("p1 left to p2? " + p1.isLeft(p2));
		
		// Is Right
		System.out.println("p1 right p2? " + p1.isRight(p2));

	}

}
