package java9;

public class Main2 {
	public static void main(String[] args) {
		Hero h1 = new Hero();
		h1.name = "�~�i�g";
		h1.hp = 100;
		
		Hero h2 = new Hero();
		h2.name = "�A�T�J";
		h2.hp=100;
		
		Wizard w = new Wizard();
		w.name ="�X�K����";
		w.hp=50;
		w.heal(h1);
		w.heal(h2);
		w.heal(h2);
	}
}
