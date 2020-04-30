package shapes;

public class Circle extends Shape {
	private double radius;

	public Circle() {
		super();
		radius = 1.0;
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	public Circle(double radius,String color, boolean filled) {
		super(color,filled);
		this.radius = radius;
	}

	public double getRadius() {
		return this.radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}
	public double getPerimeter() {
		return Math.PI * this.radius * 2;
	}

	@Override
	public String toString() {
		return "A Circle with radius of " + radius + " which is a subclass of " + super.toString();
	}
}
