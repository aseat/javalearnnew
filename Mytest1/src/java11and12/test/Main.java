package java11and12.test;

public class Main {
	public static void main(String[] args) {
		Cat cat = new Cat("”L",5);
		cat.ShowProfile();
		cat.Speak();
		
		Dog dog = new Dog("Œ¢",6);
		dog.ShowProfile();
		dog.Speak();
		
		Animal[] animals = {new Cat("”L",7),new Dog("Œ¢",8),new Cat("”L",9),new Dog("Œ¢",10)};

		for (Animal animal1:animals) {
			animal1.Speak();
		}
		
	}
}
