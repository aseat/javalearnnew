package java11and12;

public class Main {
	public static void main(String[] args) {
		Matango matango = new Matango("お化けキノコ", 10);
		Dancer dancer = new Dancer("ダンサー", 10);
		dancer.dance();

		while (0 < matango.hp && 0 < dancer.hp){
			dancer.attack(matango);
			matango.attack(dancer);
		}
	}
}
