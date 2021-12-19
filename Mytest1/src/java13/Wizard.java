package java13;

public class Wizard {
	private int hp;
	private int mp;
	private String name;
	private Wand wand;

	public void heal(Hero hero) {
		int basePoint = 10;
		int recovPoint = (int) (basePoint * this.getWand().getPower());
		hero.setHp(hero.getHp() + recovPoint);
		System.out.println(hero.getName() + "のHPを" + recovPoint + "回復した！");
	}

	public int getHp() {
		return this.hp;
	}

	public void setHp(int hp) {
		if (hp < 0) {
			this.hp = 0;
		} else {
			this.hp = hp;
		}
	}

	public int getMp() {
		return this.mp;
	}

	public void setMp(int mp) {
		if (mp < 0) {
			throw new IllegalArgumentException("設定しようとしているMPが異常です");
		}
		this.mp = mp;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		if (name.length() < 3) {
			throw new IllegalArgumentException("設定しようとしている魔法使いの名前が異常");
		}
		this.name = name;
	}

	public Wand getWand() {
		return this.wand;
	}

	public void setWand(Wand wand) {
		if (wand == null) {
			throw new IllegalArgumentException("設定しようとしている杖がnullです");
		}
		this.wand = wand;
	}
}
