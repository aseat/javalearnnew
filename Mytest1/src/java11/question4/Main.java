package java11.question4;

public class Main {
	public static void main(String[] args) {
		Circle circle = new Circle(10);
		System.out.println("���a10cm�̉~�̖ʐς�" + circle.getArea() + "����cm�ł��B");

		Cylinder cylinder = new Cylinder(8, 8);
		System.out.println("���a8cm�̉~�̖ʐς�" + cylinder.getArea() + "����cm�ł��B");
		System.out.println("���a8cm�A����8cm�̉~���̑̐ς�" + cylinder.getVolume() + "����cm�ł��B");
	}
}