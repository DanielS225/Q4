package Q4.Q4;

public class Triangle extends GeometricObject {
	private double side1;
	private double side2;
	private double side3;

	/** Construct default triangle (sides all 1 unit) */
	public Triangle() {
		super();
		side1 = 1;
		side2 = 1;
		side3 = 1;
	}
	 /** Construct instance with given 3 side lengths
	  * @param side1
	  * @param side2
	  * @param side3
	  */
	public Triangle(double side1, double side2, double side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	/** Construct instance with given 3 side lengths and color and filled
	  * @param side1
	  * @param side2
	  * @param side3
	  * @param color
	  * @param filled
	  */
	public Triangle(double side1, double side2, double side3, String color, boolean filled) {
		super(color,filled);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	/** Give the area of the triangle object */
	@Override
	public double getArea() {// TODO fixit
		double s = this.getPerimeter() / 2;
		return Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3));
	}
	
	/**
	 *  Give perimeter of the triangle object */
	@Override
	public double getPerimeter() {
		return (this.side1 + this.side2 + this.side3);
	}
	
	/**	Returns a string that describes the triangle object */
	@Override
	public String toString() {
		return ("This triangle has sides lengths: " + Double.toString(this.side1) + "," + Double.toString(this.side2)
				+ "," + Double.toString(this.side3));
	}

	/** Gives first side length
	 * @return length of side 1
	 */
	public double getSide1() {
		return side1;
	}
	
	/** Gives second side length
	 * @return length of side 2
	 */
	public double getSide2() {
		return side2;
	}

	/** Gives third side length
	 * @return length of side 3
	 */
	public double getSide3() {
		return side3;
	}

}
