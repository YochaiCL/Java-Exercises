package Segment;
// מגישים:
// יוחאי חן לוי ודוד ידוובסקי

public class Main_Segment {

	public static void main(String[] args) {

		// Constractor 1

		System.out.println("Bulid Constractor optine 1");

		Point1 pLeft = new Point1(5, 0);

		Point1 pRight = new Point1(8, 0);

		Segment p = new Segment(pLeft, pRight);

		System.out.println("pLeft: " + p.getPoLeft());
		System.out.println("pRight: " + p.getPoRight());
		System.out.println("Segment Length: " + p.getLength());
		System.out.println(p);

		System.out.println("----End option 1----\n");

		// Constractor 2

		System.out.println("Bulid Constractor optine 2");

		Segment pLeftAndRight = new Segment(3, 4, 5, 6);

		System.out.println("pLeft: " + pLeftAndRight.getPoLeft());
		System.out.println("pRight: " + pLeftAndRight.getPoRight());
		System.out.println("Segment Length: " + p.getLength());
		System.out.println(p);

		System.out.println("----End option 2----\n");

		// Constractor 3

		System.out.println("Bulid Constractor optine 3");

		Segment p1 = new Segment(pLeft, pRight);

		Segment p2 = new Segment(p1);

		System.out.println("pLeft: " + p1.getPoLeft());
		System.out.println("pRight: " + p2.getPoRight());
		System.out.println("Segment Length: " + p.getLength());
		System.out.println(p);

		System.out.println("----End option 3----\n");

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
		System.out.println("chack equal p "+ p +" to p1 "+p1+":" + p.equals(p1));
		System.out.println("chack equal p1 to p2: " + p1.equals(p2));
		System.out.println("chack equal pLeftAndRight to p1: " + pLeftAndRight.equals(p1));

		System.out.println("----End Function equal----\n");

		// Above
		System.out.println("Function above");
		System.out.println("chack p above pLeftAndRight: " + p.isAbove(pLeftAndRight));
		System.out.println("chack p above p1: " + p.isAbove(p1));
		System.out.println("chack p2 above p: " + p2.isAbove(p));

		System.out.println("----End Function above----\n");

		// Under
		System.out.println("Function under");
		System.out.println("chack p under pLeftAndRight: " + p.isUnder(pLeftAndRight));
		System.out.println("chack p under p1: " + p.isUnder(p1));
		System.out.println("chack p2 under p: " + p2.isUnder(p));

		System.out.println("----End Function under----\n");

		// Left
		System.out.println("Function left");
		System.out.println("p1 before change: " + p1);
		System.out.println("move p1 by 10 in x:");
		p1.moveHorizontal(10);
		System.out.println(p1);

		System.out.println("chack p left to pLeftAndRight: " + p.isLeft(pLeftAndRight));
		System.out.println("chack p left to p1: " + p.isLeft(p1));
		System.out.println("chack p left to p2: " + p.isLeft(p2));

		System.out.println("----End Function left----\n");

		// Right
		System.out.println("Function right");
		System.out.println("p "+p);
		System.out.println("p1 "+p1);
		System.out.println("p2 "+p2);
		System.out.println("pLeftAndRight "+pLeftAndRight+"\n");
		System.out.println("chack p right to pLeftAndRight: " + p.isRight(pLeftAndRight));
		System.out.println("chack p right to p1: " + p.isRight(p1));
		System.out.println("chack p right to p2: " + p.isRight(p2));

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

		//Move Horizontal
		System.out.println("Function Move Horizontal");
		System.out.println("p before the change: "+p);
		System.out.println("move x in p by 5");
		p.moveHorizontal(5);
		System.out.println("p:"+p);
		System.out.println("move x in p by -20");
		p.moveHorizontal(-20);
		System.out.println("p:"+p);
		
		System.out.println("----End Move Horizontal----\n");
		
		// Move Vertical
		System.out.println("Function Move Vertical");
		System.out.println("p before the change: "+p);
		System.out.println("move y in p by 5");
		p.moveVertical(5);
		System.out.println("p:"+p);
		System.out.println("move y in p by -20");
		p.moveVertical(-20);
		System.out.println("p:"+p);
		
		System.out.println("----End Move Vertical----\n");
		
		
		// Point On Segment
		System.out.println("Function pointOnSegment");
		Point1 pointOnSegment = new Point1(7, 7);
		System.out.println(
				"chack if point" + pointOnSegment + "on segment p: " + p + ":" + p.pointOnSegment(pointOnSegment));
		System.out.println(
				"chack point" + pointOnSegment + "on segment p1: " + p1 + ":" + p1.pointOnSegment(pointOnSegment));

		System.out.println("----End Function pointOnSegment----\n");

		
		// Is Bigger
		System.out.println("Function bigger segment");
		System.out.println("move onlt right p by 3 in x:");
		p.changeSize(3);
		System.out.println("p:" + p);
		System.out.println("p1:" + p1);
		System.out.println("p bigger segment than p1? " + p.isBigger(p1));
		System.out.println("p1 bigger segment than p? " + p1.isBigger(p));

		System.out.println("----End Function bigger segment----\n");

		// Over lap
		System.out.println("Function overlap");
		System.out.println("pLeftAndRight:" + pLeftAndRight);
		System.out.println("p1:" + p1);
		System.out.println("p2:" + p2);

		System.out.println("Is there an overlap pLeftAndRight >> p2? " + pLeftAndRight.overlap(p2));
		System.out.println("Is there an overlap p1 >> p2? " + p1.overlap(p2));
		
		System.out.println("----End Function overlap----\n");
		
		
		// Trapez Perimeter
		System.out.println("Function trapizius perimeter");
		
		Point1 pLeftUp = new Point1(3, 4);

		Point1 pRightUP = new Point1(5, 6);// >> (5,4)
		
		Point1 pLeftDown = new Point1(2, 2);

		Point1 pRightDown = new Point1(4, 2);
		
		
		Segment up=new Segment(pLeftUp, pRightUP);
		
		Segment down=new Segment(pLeftDown, pRightDown);
		
		
		System.out.println("The trapizius perimeter is: " + up.trapezPerimeter(down));
		
		System.out.println("----End trapizius perimeter----");

	}

}
