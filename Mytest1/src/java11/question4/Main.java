package java11.question4;

public class Main {
	public static void main(String[] args) {
		Circle circle = new Circle(10);
		System.out.println("¼a10cmĢ~ĢŹĻĶ" + circle.getArea() + "½ūcmÅ·B");

		Cylinder cylinder = new Cylinder(8, 8);
		System.out.println("¼a8cmĢ~ĢŹĻĶ" + cylinder.getArea() + "½ūcmÅ·B");
		System.out.println("¼a8cmA³8cmĢ~ĢĢĻĶ" + cylinder.getVolume() + "§ūcmÅ·B");
	}
}