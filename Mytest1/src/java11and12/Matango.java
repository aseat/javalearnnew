package java11and12;

public class Matango extends Character {
	public Matango (String name, int hp) {
		super(name,hp);
		this.name = name;
		this.hp = hp;
	}

	public void attack(Character enemy){
		if(this.hp>0) {
			System.out.println(this.name + "�̍U��");
			enemy.hp -= 5;
			System.out.println(enemy.name + "��5�_���[�W����������");
		}else{
			System.out.println(this.name+"�͐퓬�s�\�ɂȂ���");
			System.out.println(enemy.name+"�̏���");
		}
	}
}