
public class Rectangle {

	private int length;
	private int width;

	// Constractors
	public Rectangle() {
		this.length = 10;
		this.width = 10;
	}

	public Rectangle(int tmpLength, int tmpWidth) {
		setLength(tmpLength);
		setWidth(tmpWidth);
	}

	public Rectangle(Rectangle other) {
		this.length = other.length;
		this.width = other.width;
	}

	// Get
	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}

	// Set
	public boolean setLength(int tmpLength) {
		if (tmpLength <= 0)
			return false;

		this.length = tmpLength;
		return true;
	}

	public boolean setWidth(int tmpWidth) {
		if (tmpWidth <= 0)
			return false;

		this.width = tmpWidth;
		return true;
	}

	// Rectangle perimeter
	public int perimeter() {
		return ((2 * this.length) + (2 * this.width));
	}

	// Rectangle area
	public int area() {
		return (this.length * this.width);
	}

	public void showShap() {
		showChar('*');
	}

	// Show with char
	public void showChar(char ch) {
		for (int i = 0; i < this.length; i++)
			System.out.print(ch);

		System.out.println();
		for (int i = 0; i < this.width-2; i++) {
			System.out.print(ch);
			for (int j = 0; j < this.length-2; j++)
				System.out.print(" ");
			System.out.print(ch);
			System.out.println();
		}
		for (int i = 0; i < this.length; i++)
			System.out.print(ch);
		System.out.println();

	}
}
