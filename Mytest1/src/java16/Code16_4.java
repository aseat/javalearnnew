package java16;

import java.util.Set;
import java.util.TreeSet;

public class Code16_4 {
	public static void main(String[] args) {
		Set<String> words = new TreeSet<String>();
		words.add("month");
		words.add("day");
		words.add("Ç†Ç†");

		for (String word : words) {
			System.out.print(word + "Å®");
		}
	}
}
