package java11;

public class Armor extends Item{
	public Armor(String name,int value) {
		super(name,value);
	}
	
	public void use() {
		System.out.println(this.name+"��g�ɒ�����");
		System.out.println("����͂�"+this.value+"�オ����");
	}
}
