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
        System.out.println( "名前は、" + Name + "、" + Age + "歳です。" );
    }
    public void Speak() {
    	System.out.println("......");
    }
}