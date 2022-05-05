package Part2;

public class Floor {
	private double width;
	private double length;

	public Floor(double width, double length) {
		this.width = width;
		this.length = length;
	}

	public double getArea() {
		if (width < 0 || length < 0) {
			System.out.println("Invalid parameter");
			return -1;
		} else {
			return width * length;
		}

	}
}
