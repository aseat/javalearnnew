package java9;

public class Main1 {
	public static void main(String[] args) {
		Sword s=new Sword();
		s.name = "���̌�";
		s.damage = 10;
		
		Hero h = new Hero();
		h.name = "�~�i�g";
		h.hp = 100;
		h.sword = s;
		h.attack();
		
		System.out.println("���݂̕����"+h.sword.name);
	}
}
