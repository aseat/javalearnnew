package java11and12;

public abstract class Character {
	String name;
	int hp;

	public Character(String name,int hp) {
		this.name = name;
		this.hp = hp;
	}

	// ������
	public void run() {
		System.out.println(this.name + "�͓����o����");
	}

	// �키
	public abstract void attack(Character enemy);
}
