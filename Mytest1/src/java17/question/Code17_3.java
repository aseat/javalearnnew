package java17.question;

public class Code17_3 {

	public static void main(String[] args) {
		try {
			int i = Integer.parseInt("三");
			System.out.println(i);
		} catch (NumberFormatException error) {
			System.out.println("整数で書けやコラ");
		}
	}

}
