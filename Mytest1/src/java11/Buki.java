package java11;

public class Buki extends Item{
	
	public Buki(String name,int value){
		super(name,value);
	}
	
	public void use() {
		System.out.println(this.name+"こうげき!!");
		System.out.println("敵に"+this.value+"のダメージ!");
	}
}
