package java15.question;

public class Fifteen_one {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= 100; i++) {
			sb.append(i).append(",");
		}
		String string = sb.toString();

		String[] array = string.split("[,]");

		for (String arrays : array) {
			System.out.print(arrays);
		}
	}
}
