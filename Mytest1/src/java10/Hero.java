package java10;



public class Hero {
	String name;
	int hp;
	public void attack() {
		System.out.println(this.name + "�͍U������");
		System.out.println("�G��5�|�C���g�̃_���[�W�����������I");
		
	}
	
	public void sit(int sec) {
		this.hp +=sec;
		System.out.println(this.name + "�́A" +sec +"�b�������I");
		System.out.println("HP��"+ sec +"�|�C���g�񕜂���");
	}
	
	public void slip() {
		this.hp += 5;
		System.out.println(this.name + "�́A�]��");
		System.out.println("5�̃_���[�W");
	}
	
	public void run() {
		System.out.println(this.name + "�́A�����o����!");
		System.out.println("GAMEOVER");
		System.out.println("�ŏI��HP��"+ this.hp +"�ł���");
	}
}
