package java17;

public class Person {
	int age;

	public void setAge(int age) {
		if (age < 0) {
			throw new IllegalArgumentException("�N���0�ȏ�̐����w�肷��ׂ��ł��B�w��l=" + age);
		}
		this.age = age;
	}
}
