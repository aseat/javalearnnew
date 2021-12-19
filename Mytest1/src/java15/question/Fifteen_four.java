package java15.question;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Fifteen_four {

	public static void main(String[] args) {

		LocalDate now = LocalDate.now();

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("¼—ïyyyy”NMMŒdd“ú");

		LocalDate plusDay = now.plusDays(100);

		System.out.print(plusDay.format(fmt));
	}

}
