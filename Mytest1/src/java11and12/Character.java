package java11and12;

public abstract class Character {
	String name;
	int hp;

	public Character(String name,int hp) {
		this.name = name;
		this.hp = hp;
	}

	// “¦‚°‚é
	public void run() {
		System.out.println(this.name + "‚Í“¦‚°o‚µ‚½");
	}

	// í‚¤
	public abstract void attack(Character enemy);
}
