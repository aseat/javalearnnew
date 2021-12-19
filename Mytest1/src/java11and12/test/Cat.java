package java11and12.test;

public class Cat extends Animal{
	
	public Cat(String Name,int Age){
		super(Name,Age);
		this.Name = Name;
		this.Age= Age;
	}

	public void sleep() {
		System.out.println("スースー");
	}
	public void Speak() {
		System.out.println("ニャー");
	}
}
