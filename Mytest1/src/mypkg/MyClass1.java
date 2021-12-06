package mypkg;

public class MyClass1 {
	public static void main(String[] args) {

		System.out.println("‚æ‚¤‚±‚»");
		
		System.out.println("–¼‘O“ü—Í");
		String name= new java.util.Scanner(System.in).nextLine();
		System.out.println("”N—î“ü—Í");
		int age= new java.util.Scanner(System.in).nextInt();
		int fortune=new java.util.Random().nextInt(4);
		fortune+=2;
		System.out.println("Œ‹‰Ê");
		System.out.println(age+"Î‚Ì"+name+"‚³‚ñ‚ ‚È‚½‚Ì‰^¨”Ô†‚Í"+fortune+"‚Å‚·");
		System.out.println("1:‘å‹g,2:’†‹g,3:¬‹g,4:‹¥");
	}
}