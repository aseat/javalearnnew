package mypkg;

public class MyClass1 {
	public static void main(String[] args) {

		System.out.println("ようこそ");
		
		System.out.println("名前入力");
		String name= new java.util.Scanner(System.in).nextLine();
		System.out.println("年齢入力");
		int age= new java.util.Scanner(System.in).nextInt();
		int fortune=new java.util.Random().nextInt(4);
		fortune+=2;
		System.out.println("結果");
		System.out.println(age+"歳の"+name+"さんあなたの運勢番号は"+fortune+"です");
		System.out.println("1:大吉,2:中吉,3:小吉,4:凶");
	}
}