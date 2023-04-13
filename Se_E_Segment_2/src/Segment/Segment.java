package Segment;
// מגישים:
// יוחאי חן לוי ודוד ידוובסקי

public class Segment {

	private Point2 _poLeft;
	private Point2 _poRight;

	// constractors
	public Segment(Point2 left, Point2 right) {

		Point2 pRight = new Point2(right);

		Point2 pLeft = new Point2(left);

		this._poRight = pRight;

		this._poLeft = pLeft;

		if (_poRight.getY() != this._poLeft.getY())

			_poRight.setY(this._poLeft.getY());
	}

	public Segment(int xLeft, int yLeft, int xRight, int yRight) {

		Point2 pRight = new Point2(xRight, yRight);

		Point2 pLeft = new Point2(xLeft, yLeft);

		this._poRight = pRight;

		this._poLeft = pLeft;

		if (_poRight.getY() != this._poLeft.getY())

			_poRight.setY(this._poLeft.getY());

	}

	public Segment(Segment other) {

		Point2 pRight = new Point2(other._poRight);

		Point2 pLeft = new Point2(other._poLeft);

		this._poLeft = pLeft;
		this._poRight = pRight;

	}

	// Gets
	public Point2 getPoLeft() {
		return this._poLeft;
	}

	public Point2 getPoRight() {
		return this._poRight;
	}

	// Get Length
	public int getLength() {
		return this._poRight.getX() - this._poLeft.getX();
	}

	// toString
	public String toString() {

		return "(" + this._poLeft.getX() + "," + this._poLeft.getY() + ")" + "---" + "(" + this._poRight.getX() + ","
				+ this._poRight.getY() + ")";

	}

	// Equals
	public boolean equals(Segment other) {

		if (this._poLeft.equals(other._poLeft))

			if (this._poRight.equals(other._poRight))
				return true;

		return false;

	}

	// Is above
	public boolean isAbove(Segment other) {

		if (this._poLeft.isAbove(other._poLeft))
			if (this._poRight.isAbove(other._poRight))

				return true;

		return false;
	}

	// Is under
	public boolean isUnder(Segment other) {
		if (other.isAbove(this))
			return true;

		return false;
	}

	// Is left
	public boolean isLeft(Segment other) {

		if (this._poRight.isLeft(other._poLeft))

			return true;

		return false;
	}

	// Is right
	public boolean isRight(Segment other) {
		if (other.isLeft(this))
			return true;

		return false;
	}


	// Move Horizontal
	public void moveHorizontal(int delta) {

		this._poLeft.move(delta, 0);

		this._poRight.move(delta, 0);

	}

	// Move Vertical
	public void moveVertical(int delta) {

		this._poLeft.move(0, delta);

		this._poRight.move(0, delta);

	}

	// Change Size
	public void changeSize(int delta) {

		if (delta < 0)
			if ((this._poRight.getX() - delta) > this._poLeft.getX())

				this._poRight.move(delta, 0);

			else
				return;
		else
			this._poRight.move(delta, 0);
	}

	// Point On Segment
	public boolean pointOnSegment(Point2 p) {

		if (this._poLeft.isLeft(p))

			if (this._poRight.isRight(p))

				if (this._poLeft.getY() == p.getY())

					return true;

		return false;
	}

	// Is Bigger
	public boolean isBigger(Segment other) {

		if ((this._poRight.getX() - this._poLeft.getX()) > (other._poRight.getX() - other._poLeft.getX()))

			return true;

		return false;
	}

	// Over lap
	public int overlap(Segment other) {

		if (this._poRight.getX() > other._poRight.getX())

			if (other._poLeft.getX() > this._poLeft.getX())

				return other._poRight.getX() - this._poLeft.getX();

		if (this._poRight.getX() < other._poRight.getX())

			if (other._poLeft.getX() < this._poLeft.getX())

				return this._poRight.getX() - other._poLeft.getX();

		if (this.equals(other))
			return this.getLength();

		else
			return 0;

	}

	// Trapez Perimeter
	public double trapezPerimeter(Segment other) {
		double rightHypotenuse = other._poRight.distance(this._poRight);
		double leftHypotenouse = other._poLeft.distance(this._poLeft);
		double topTrapiziusBasis = other.getLength();
		double bottomTrapiziusBasis = this.getLength();
		return topTrapiziusBasis + bottomTrapiziusBasis + leftHypotenouse + rightHypotenuse;
	}

}
