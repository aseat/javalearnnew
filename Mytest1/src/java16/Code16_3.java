package java16;

import java.util.HashSet;
import java.util.Set;

public class Code16_3 {
	public static void main(String[] args) {
		Set<String> colors = new HashSet<String>();
		colors.add("��");
		colors.add("��");
		colors.add("�s���N");

		for (String color : colors) {
			System.out.print(color + "��");
		}
	}
}
