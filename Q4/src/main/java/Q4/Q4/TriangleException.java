package Q4.Q4;

public class TriangleException extends Exception {
	
	private Triangle triangle;
	
	public TriangleException() {
		System.out.print("The triangle is invalid");
	}
	
	public TriangleException(double side1, double side2, double side3) {
		System.out.println("Cannot have a triangle of side lengths: " + side1 + ", " + side2 + ", " + side3 +".");
	}
}
