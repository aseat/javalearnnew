package java11.question4;

public class Main {
	public static void main(String[] args) {
		Circle circle = new Circle(10);
		System.out.println("”¼Œa10cm‚Ì‰~‚Ì–ÊÏ‚Í" + circle.getArea() + "•½•ûcm‚Å‚·B");

		Cylinder cylinder = new Cylinder(8, 8);
		System.out.println("”¼Œa8cm‚Ì‰~‚Ì–ÊÏ‚Í" + cylinder.getArea() + "•½•ûcm‚Å‚·B");
		System.out.println("”¼Œa8cmA‚‚³8cm‚Ì‰~’Œ‚Ì‘ÌÏ‚Í" + cylinder.getVolume() + "—§•ûcm‚Å‚·B");
	}
}