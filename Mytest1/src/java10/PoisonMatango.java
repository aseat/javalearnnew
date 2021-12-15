package java10;

public class PoisonMatango extends Matango {
	int poisonCount = 5;

	public PoisonMatango(char suffix) {
		super(suffix);
	}

	public void attack(Hero hero) {
		super.attack(hero);
		if (poisonCount > 0) {
			System.out.println("����ɓł̖E�q���΂�܂����I");
			int damage = hero.hp / 5;
			hero.hp -= damage;
			System.out.println(damage + "�|�C���g�̃_���[�W");
			poisonCount--;
		}
	}
}
