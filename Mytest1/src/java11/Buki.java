package java11;

public class Buki extends Item{
	
	public Buki(String name,int value){
		super(name,value);
	}
	
	public void use() {
		System.out.println(this.name+"��������!!");
		System.out.println("�G��"+this.value+"�̃_���[�W!");
	}
}
