package Segment;
// מגישים:

// יוחאי חן לוי ודוד ידוובסקי

public class Main_Segment {

	public static void main(String[] args) {

		// Constractor 1

		System.out.println("Bulid Constractor optine 1");

		Point2 pLeft = new Point2(5, 0);

		Point2 pRight = new Point2(8, 0);

		Segment p = new Segment(pLeft, pRight);

		
		System.out.println("Segment Length: " + p.getLength());
		System.out.println(p);

		System.out.println("----End option 1----\n");

		// Constractor 2

		System.out.println("Bulid Constractor optine 2");

		Segment p1 = new Segment(p);

		
		System.out.println("Segment Length: " + p.getLength());
		System.out.println(p);

		System.out.println("----End option 2----\n");

		// Move
		System.out.println("Function move");
		System.out.println("p before change: " + p);
		System.out.println("move p by 3 in x:");
		p.moveHorizontal(3);
		System.out.println(p);

		System.out.println("move p by 3 in y:");
		p.moveVertical(3);
		System.out.println(p);
		System.out.println("----End Function move----\n");

		// Equal
		System.out.println("Function equal");

		System.out.println("----End Function equal----\n");

		// Above
		System.out.println("Function above");

		System.out.println("chack p2 above p: " + p1.isAbove(p));

		System.out.println("----End Function above----\n");

		// Under
		System.out.println("Function under");

		System.out.println("chack p2 under p: " + p1.isUnder(p));

		System.out.println("----End Function under----\n");

		// Left
		System.out.println("Function left");

		System.out.println("move p1 by 10 in x:");

		System.out.println("chack p left to p2: " + p.isLeft(p1));

		System.out.println("----End Function left----\n");

		// Right
		System.out.println("Function right");
		System.out.println("p " + p);

		System.out.println("p2 " + p1);

		System.out.println("chack p right to p2: " + p.isRight(p1));

		System.out.println("----End Function right----\n");

		// Change Size
		System.out.println("Function Change Size");

		System.out.println("p before change: " + p);

		System.out.println("move only right p by 3 in x:");
		p.changeSize(3);
		System.out.println(p);
		System.out.println("move only right p by -3 in x:");
		p.changeSize(-3);
		System.out.println(p);
		System.out.println("move only right p by -9 in x:");
		p.changeSize(-9);
		System.out.println(p);

		System.out.println("----End Function Change Size----\n");

		// Move Horizontal
		System.out.println("Function Move Horizontal");
		System.out.println("p before the change: " + p);
		System.out.println("move x in p by 5");
		p.moveHorizontal(5);
		System.out.println("p:" + p);
		System.out.println("move x in p by -20");
		p.moveHorizontal(-20);
		System.out.println("p:" + p);

		System.out.println("----End Move Horizontal----\n");

		// Move Vertical
		System.out.println("Function Move Vertical");
		System.out.println("p before the change: " + p);
		System.out.println("move y in p by 5");
		p.moveVertical(5);
		System.out.println("p:" + p);
		System.out.println("move y in p by -20");
		p.moveVertical(-20);
		System.out.println("p:" + p);

		System.out.println("----End Move Vertical----\n");

		// Point On Segment
		System.out.println("Function pointOnSegment");
		Point2 pointOnSegment = new Point2(7, 7);
		System.out.println(
				"chack if point" + pointOnSegment + "on segment p: " + p + ":" + p.pointOnSegment(pointOnSegment));

		System.out.println("----End Function pointOnSegment----\n");

		// Is Bigger
		System.out.println("Function bigger segment");
		System.out.println("move onlt right p by 3 in x:");
		p.changeSize(3);
		System.out.println("p:" + p);

		System.out.println("----End Function bigger segment----\n");

		// Over lap
		System.out.println("Function overlap");

		System.out.println("p2:" + p1);

		System.out.println("----End Function overlap----\n");

		// Trapez Perimeter
		System.out.println("Function trapizius perimeter");

		Point2 pLeftUp = new Point2(3, 4);

		Point2 pRightUP = new Point2(5, 6);// >> (5,4)

		Point2 pLeftDown = new Point2(2, 2);

		Point2 pRightDown = new Point2(4, 2);

		Segment up = new Segment(pLeftUp, pRightUP);

		Segment down = new Segment(pLeftDown, pRightDown);

		System.out.println("The trapizius perimeter is: " + up.trapezPerimeter(down));

		System.out.println("----End trapizius perimeter----");

	}

}
