package java15.question;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Fifeen_three {

	public static void main(String[] args) {
		Date now = new Date();

		Calendar cal = Calendar.getInstance();
		cal.setTime(now);

		cal.get(Calendar.DATE);

		cal.add(Calendar.DATE, 100);

		Date date = cal.getTime();

		SimpleDateFormat format = new SimpleDateFormat("¼—ïyyyy”NMMŒdd“ú");
		String string = format.format(date);

		System.out.print(string);
	}

}
