package java11and12.test;

public class Dog extends Animal{
	public Dog(String Name,int Age){
		super(Name,Age);
		this.Name = Name;
		this.Age= Age;
	}
	
	public void Run() {
		System.out.println("�g�R�g�R");
	}
	public void Speak() {
		System.out.println("����");
	}
}
