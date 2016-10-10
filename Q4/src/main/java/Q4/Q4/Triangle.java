package Q4.Q4;

public class Triangle extends GeometricObject {
	private double side1;
	private double side2;
	private double side3;

	public Triangle() {
		super();
		side1 = 1;
		side2 = 1;
		side3 = 1;
	}

	public Triangle(double side1, double side2, double side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	@Override
	public double getArea() {// TODO fixit
		double s = this.getPerimeter() / 2;
		return Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3));
	}

	@Override
	public double getPerimeter() {
		return (this.side1 + this.side2 + this.side3);
	}

	@Override
	public String toString() {
		return ("This triangle has sides lengths: " + Double.toString(this.side1) + "," + Double.toString(this.side2)
				+ "," + Double.toString(this.side3));
	}

	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

}
