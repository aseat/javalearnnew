package java14;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main2 {
	public static void main(String[] args) throws Exception {
		Calendar c = Calendar.getInstance();
		c.set(2021, 12, 22, 4, 34, 33);
		c.set(Calendar.DAY_OF_MONTH, 0);
		Date d = c.getTime();
		System.out.println(d);

		Date now = new Date();
		c.setTime(now);
		int y = c.get(Calendar.MONTH);
		System.out.println(y);

		SimpleDateFormat s = new SimpleDateFormat("yyyy/MM/dd");
		Date day= s.parse("2021/2/1");
		System.out.println(day);
		
		Date nowtime=new Date();
		String string=s.format(nowtime);
		System.out.println(string);
		
	}
}
