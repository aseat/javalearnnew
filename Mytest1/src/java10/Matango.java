package java10;

public class Matango {
	int hp=50;
	char suffix;
	
	public Matango(char suffix) {
		this.suffix = suffix;
	}
	public void attack(Hero hero) {
		System.out.println("�L�m�R" +this.suffix+"�̍U��");
		System.out.println("10�̃_���[�W");
		hero.hp -=10;
	}
}
