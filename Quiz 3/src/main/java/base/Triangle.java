package base;

/**
 * 
 * @author Hayley Andrews
 *
 */
public class Triangle extends GeometricObject {
	/**
	 * double data fields
	 */
	private double side1 = 1;
	private double side2 = 1;
	private double side3 = 1;

	/**
	 * No arg constructor to create a default equilateral triangle
	 */
	public Triangle() {
		this.side1 = 1;
		this.side2 = 1;
		this.side3 = 1;
	}

	/**
	 * Constructor that creates triangle with specified lengths
	 * 
	 * @param side1
	 *            Length of first side
	 * @param side2
	 *            Length of second side
	 * @param side3
	 *            Length of third side
	 */

	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	/**
	 * side1 getter
	 * 
	 * @return side1 length
	 */
	public double getSide1() {
		return this.side1;
	}

	/**
	 * side2 getter
	 * 
	 * @return side2 length
	 */
	public double getSide2() {
		return this.side2;
	}

	/**
	 * side3 getter
	 * 
	 * @return side3 length
	 */
	public double getSide3() {
		return this.side3;
	}

	/**
	 * method getArea
	 * 
	 * @return the area of the triangle
	 */
	@Override
	public double getArea() {
		double Ph = this.getPerimeter() / 2;
		return Math.sqrt(Ph * (Ph - this.side1) * (Ph - this.side2) * (Ph - this.side3));

	}

	/**
	 * method getPerimeter
	 * 
	 * @return the perimeter of a triangle
	 */
	@Override
	public double getPerimeter() {
		return this.side1 + this.side2 + this.side3;
	}

	/**
	 * method toString
	 * @return string description of triangle
	 */
	public String toString() {
		return "side 1 " + this.side1 + " side 2 "+ this.side2 +" side 3 ";
		}
}
