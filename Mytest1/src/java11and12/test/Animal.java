package java11and12.test;

class Animal
{
    public String Name;
    public int Age;
    
    public Animal(String Name,int Age){
		this.Name = Name;
		this.Age= Age;
	}

    public void ShowProfile()
    {
        System.out.println( "���O�́A" + Name + "�A" + Age + "�΂ł��B" );
    }
    public void Speak() {
    	System.out.println("......");
    }
}