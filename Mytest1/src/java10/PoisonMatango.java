package java10;

public class PoisonMatango extends Matango {
	int poisonCount = 5;

	public PoisonMatango(char suffix) {
		super(suffix);
	}

	public void attack(Hero hero) {
		super.attack(hero);
		if (poisonCount > 0) {
			System.out.println("さらに毒の胞子をばらまいた！");
			int damage = hero.hp / 5;
			hero.hp -= damage;
			System.out.println(damage + "ポイントのダメージ");
			poisonCount--;
		}
	}
}
