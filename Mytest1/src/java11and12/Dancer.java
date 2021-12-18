package java11and12;

public class Dancer extends Character {
	public Dancer(String name, int hp) {
		super(name,hp);
		this.name = name;
		this.hp = hp;
	}

	public void dance() {
		System.out.println(this.name + "は情熱的だった");
	}

	public void attack(Character enemy) {
		if(this.hp>0) {
			System.out.println(this.name + "の攻撃");
			enemy.hp -= 5;
			System.out.println(enemy.name + "に5ダメージをあたえた");
		}else{
			System.out.println(this.name+"は戦闘不能になった");
			System.out.println(enemy.name+"の勝ち");
		}
		
	}
}
