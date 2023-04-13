package Point1;
// מגישים:
// יוחאי חן לוי ודוד ידוובסקי

public class Point1 {

	private int _x;
	private int _y;

	// Constractors
	public Point1(int x, int y) {
		if (x < 0)
			this._x = 0;

		if (y < 0)
			this._y = 0;

		setX(x);

		setY(y);
	}

	public Point1(Point1 other) {
		this._x = other._x;
		this._y = other._y;
	}

	// Get
	public int getX() {
		return _x;
	}

	public int getY() {
		return _y;
	}

	// Set
	public void setY(int num) {
		if (num >= 0)
			this._y = num;
	}

	public void setX(int num) {
		if (num >= 0)
			this._x = num;
	}

	// toString
	public String toString() {

		return "(" + this._x + "," + this._y + ")";

	}

	// Equals
	public boolean equals(Point1 other) {
		if (this._x == other._x)
			if (this._y == other._y)
				return true;

		return false;
	}

	// Is Above
	public boolean isAbove(Point1 other) {

		if (this._y > other._y)
			return true;
		return false;
	}

	// Is Under
	public boolean isUnder(Point1 other) {

		if (other.isAbove(this))
			return true;

		return false;
	}

	// is Left
	public boolean isLeft(Point1 other) {

		if (this._x < other._x)
			return true;

		return false;
	}

	// Is Right
	public boolean isRight(Point1 other) {
		if (other.isLeft(this))
			return true;

		return false;
	}

	// Distance
	public double distance(Point1 p) {
		return Math.sqrt(((p._y - this._y) * (p._y - this._y)) + ((p._x - this._x) * (p._x - this._x)));
	}

	// Move
	public void move(int dx, int dy) {

		if (dx < 0) {
			dx = Math.abs(dx);

			if (dx > this._x)
				return;

			else
				setX(this._x - dx);
		}

		else
			setX(this._x + dx);

		if (dy < 0) {
			dy = Math.abs(dy);

			if (dy > this._y)
				return;

			else
				setY(this._y - dy);
		}

		else
			setY(this._y + dy);

	}

}
