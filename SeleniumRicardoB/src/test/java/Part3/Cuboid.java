package Part3;

public class Cuboid extends Rectangle {

	public double height;

	public Cuboid(double width, double length, double height) {
		super(width, length);
		this.height = height;
		if (height < 0) {
			height = 0;
		}

	}

	public double getHeight() {
		return height;
	}

	public double getVolume() {

		return width * length * height;
	}

	public void Results() {
		Rectangle rectangle = new Rectangle(5, 10);
		Cuboid cuboid = new Cuboid(5,10,5);
		rectangle.getArea();
		cuboid.getVolume();
	}
}
