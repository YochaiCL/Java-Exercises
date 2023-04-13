
public class Point2 {

	private double _radius;
	private double _alpha;

	// Constractors
	public Point2(int x, int y) {
		if (x < 0)
			this._radius = 0;
		else
			this._radius = Math.sqrt((x * x) + (y * y));

		if (y < 0)
			this._alpha = 0;

		setY(y);
	}

	public Point2(Point2 other) {
		this._radius = other._radius;
		this._alpha = other._alpha;
	}

	// Get
	public int getX() {

		double radian = (this._alpha / 360) * (2 * Math.PI);

		int x = (int) Math.round((Math.cos(radian) * _radius));

		return x;
	}

	public int getY() {

		double radian = (this._alpha / 360) * (2 * Math.PI);

		int y = Math.round((int) (Math.sin(radian) * this._radius));
		return y;
	}

	// Set
	public void setX(int num) {
		if (num >= 0) {
			double radian = (this._alpha / 360) * (2 * Math.PI);
			this._radius = (num / (Math.cos(radian)));
		}
	}

	public void setY(int num) {

		if (num >= 0) {
			int x = (int)Math.round( Math.sqrt((this._radius * this._radius) - (num * num)));
			double divided = (double) num / x;
			double mathRes = Math.atan(divided);
			this._alpha = (mathRes / (2 * Math.PI)) * 360;
		}
	}

	// toString
	public String toString() {

		return "(" + this.getX() + "," + this.getY() + ")";

	}

	// this == other
	public boolean equals(Point2 other) {
		if (this.getX() == other.getX())
			if (this.getY() == other.getY())
				return true;

		return false;
	}

	// this y above other y
	public boolean isAbove(Point2 other) {

		if (this.getY() > other.getY())
			return true;
		return false;
	}

	// other is under this
	public boolean isUnder(Point2 other) {

		if (other.isAbove(this))
			return true;

		return false;
	}

	// other is left to this
	public boolean isLeft(Point2 other) {

		if (this.getX() < other.getX())
			return true;

		return false;
	}

	// other is right to this
	public boolean isRight(Point2 other) {
		if (other.isLeft(this))
			return true;

		return false;
	}

	public double distance(Point2 p) {
		return Math.sqrt(((p.getY() - this.getY()) * (p.getY() - this.getY()))
				+ ((p.getX() - this.getX()) * (p.getX() - this.getX())));
	}

	public void move(int dx, int dy) {

		int x = this.getX();
		int y = this.getY();

		if (dx < 0) {
			dx = Math.abs(dx);

			if (dx > x)
				return;

			else

				x = x - dx;
		}

		else

			x = x + dx;

		if (dy < 0) {
			dy = Math.abs(dy);

			if (dy > y)
				return;

			else

				y = y - dy;
		}

		else

			y = y + dy;

		_radius = Math.sqrt(((x * x) + (y * y)));

		setY(y);

	}

}