package java9;

public class Main1 {
	public static void main(String[] args) {
		Sword s=new Sword();
		s.name = "‰Š‚ÌŒ•";
		s.damage = 10;
		
		Hero h = new Hero();
		h.name = "ƒ~ƒiƒg";
		h.hp = 100;
		h.sword = s;
		h.attack();
		
		System.out.println("Œ»İ‚Ì•Ší‚Í"+h.sword.name);
	}
}
