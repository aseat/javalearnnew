package java11and12;

public class Main {
	public static void main(String[] args) {
		Matango matango = new Matango("�������L�m�R", 50);
		Dancer dancer = new Dancer("�_���T�[", 50);
		dancer.dance();

		while (0 < matango.hp && 0 < dancer.hp){
			dancer.attack(matango);
			matango.attack(dancer);
		}
	}
}
