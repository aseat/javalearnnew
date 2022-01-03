package java13;

public class Wand {
	private String name;
	private double power;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		if (name == null || name.length() < 3) {
			throw new IllegalArgumentException("�ݒ肵�悤�Ƃ��Ă����̖��O���ُ�ł�");
		}
		this.name = name;
	}

	public double getPower() {
		return this.power;
	}

	public void setPower(double power) {
		if (0.5 < power || 100 < power) {
			throw new IllegalArgumentException("�ݒ肵�悤�Ƃ��Ă��鑝�������ُ�ł�");
		}
		this.power = power;
	}
}
