package Cat;

public class Cat {

	protected String name;
	protected double Length;
	protected String color;

	public Cat(String tmpName, double tmpLength, String tmpColor) {

		setName(tmpName);
		setLength(tmpLength);
		setColor(tmpColor);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getLength() {
		return Length;
	}

	public void setLength(double length) {
		Length = length;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", Length=" + Length + ", color=" + color + "]";
	}

}
