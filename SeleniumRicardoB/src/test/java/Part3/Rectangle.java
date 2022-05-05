package Part3;

public class Rectangle {

	public double length;
	public double width;

	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;

		if (width < 0) {
			width = 0;
		}
		if (length < 0) {
			length = 0;
		}
	}

	public double getWidth() {
		return width;
	}

	public double getLength() {
		return length;
	}
	
	public double getArea()
	{
		return width * length;
	}
}
