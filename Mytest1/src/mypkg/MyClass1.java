package mypkg;

public class MyClass1 {
	public static void main(String[] args) {

		System.out.println("�悤����");
		
		System.out.println("���O����");
		String name= new java.util.Scanner(System.in).nextLine();
		System.out.println("�N�����");
		int age= new java.util.Scanner(System.in).nextInt();
		int fortune=new java.util.Random().nextInt(4);
		fortune+=2;
		System.out.println("����");
		System.out.println(age+"�΂�"+name+"���񂠂Ȃ��̉^���ԍ���"+fortune+"�ł�");
		System.out.println("1:��g,2:���g,3:���g,4:��");
	}
}