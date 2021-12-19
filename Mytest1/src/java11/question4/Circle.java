package java11.question4;

public class Circle {
	final double PI = 3.14;
	int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	public double getArea() {
		return radius * radius * PI;
	}
}
