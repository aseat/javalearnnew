package java11;

public abstract class Item {
	String name;
	int value;
	
	public Item(String name,int value) {
		this.name = name;
		this.value= value;
	}
	
	public abstract void use();
}
