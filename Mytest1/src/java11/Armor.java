package java11;

public class Armor extends Item{
	public Armor(String name,int value) {
		super(name,value);
	}
	
	public void use() {
		System.out.println(this.name+"‚ğg‚É’…‚¯‚½");
		System.out.println("ç”õ—Í‚ª"+this.value+"ã‚ª‚Á‚½");
	}
}
